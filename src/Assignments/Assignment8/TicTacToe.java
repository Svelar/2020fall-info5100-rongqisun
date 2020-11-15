package Assignments.Assignment8;

import java.util.*;


//ref from some materials in INTERNET

public class TicTacToe {
    private final int CAPACITY = 9;
    private int now = 0;
    private char[][] gameBoard = new char[3][3];

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.Start();
    }

    TicTacToe(){
        for(char[] line : gameBoard){
            Arrays.fill(line, ' ');
        }
    }

    public void Start(){
        System.out.println(" 1 | 2 │ 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("RULES: \n1/ 1-9 stands for position above\n2/ You are 'O' while CPU is 'X'\n3/ You begin first");
        Scanner scanner = new Scanner(System.in);

        class Play{
            int cpuPlay(){
                Robot();
                printGameBroad();
                if(isSuccessful() == -1) {
                    System.out.println("CPU wins! Sorry:(");
                    return -1;
                }else if (now == CAPACITY){
                    System.out.println("CAT!");
                    return -1;
                }
                return 0;
            }

            int userPlay(){
                int position;
                while(true){
                    System.out.println("Enter your placement (1-9): ");
                    position = scanner.nextInt();
                    if(position < 1 || position > 9 || gameBoard[(position - 1) / 3][(position - 1) % 3] != ' '){
                        System.out.println("ERROR, INPUT AGAIN! ");
                        continue;
                    } else {
                        gameBoard[(position - 1)/3][(position - 1) % 3] = 'O';
                        now++;
                        break;
                    }
                }

                if(isSuccessful() == 1){
                    printGameBroad();
                    System.out.println("Congratulations you won!");
                    return -1;
                } else if(now == CAPACITY){
                    printGameBroad();
                    System.out.println("CAT!");
                    return -1;
                }
                return 0;
            }
        }

        Play play = new Play();
        while(true){
            if(play.userPlay() == -1)
                return;

            if(play.cpuPlay() == -1)
                return;
        }
    }

    private void printGameBroad(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(" " + gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2]);
    }

    private enum Choice{
        LINE,
        COLUMN,
        RIGHT_DIAGONAL,
        LEFT_DIAGONAL;
    }
    private int calculate(Choice choice, int i){
        switch (choice){
            case LINE:
                return gameBoard[i][0] + gameBoard[i][1] + gameBoard[i][2];
            case COLUMN:
                return gameBoard[0][i] + gameBoard[1][i] + gameBoard[2][i];
            case RIGHT_DIAGONAL:
                return gameBoard[0][0] + gameBoard[1][1] + gameBoard[2][2];
            case LEFT_DIAGONAL:
                return gameBoard[0][2] + gameBoard[1][1] + gameBoard[2][0];
        }
        return 0;
    }
    private int isSuccessful(){
        /*
        -1: CPU
        1: user
        0: continue
        264 == 'X' + 'X' + 'X'
        237 == 'O' + 'O' + 'O'
        */
        for(int i = 0; i < 3; i++){
            if(calculate(Choice.LINE, i) == 237 || calculate(Choice.COLUMN, i) == 237)
                return 1;
            if(calculate(Choice.LINE, i) == 264 || calculate(Choice.COLUMN, i) == 264)
                return -1;
        }
        if(calculate(Choice.LEFT_DIAGONAL, 0) == 237 || calculate(Choice.RIGHT_DIAGONAL, 0) == 237)
            return 1;
        if(calculate(Choice.LEFT_DIAGONAL, 0) == 264 || calculate(Choice.RIGHT_DIAGONAL, 0) == 264)
            return -1;
        return 0;
    }

    private boolean willBeSuccessful(int player){
        //190 == 2 * 'O' + ' '
        //208 == 2 * 'X' + ' '

        int n = 0;
        int s = (player == 1) ? 190 : 208;

        for(int i = 0; i < 3; i++){
            if(calculate(Choice.LINE, i) == s)
                n++;
            if(calculate(Choice.COLUMN, i) == s)
                n++;
        }
        return n > 1;
    }

    private int corner = 2;
    private void Robot(){
        if(gameBoard[1][1] == ' '){
            gameBoard[1][1] = 'X';
            now++;
            return;
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(gameBoard[i][j] == ' '){
                    gameBoard[i][j] = 'X';
                    if(isSuccessful() == -1){
                        now++;
                        return ;
                    }
                    else
                        gameBoard[i][j] = ' ';
                }
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(gameBoard[i][j] == ' '){
                    gameBoard[i][j] = 'O';
                    if(isSuccessful() == 1){
                        gameBoard[i][j] = 'X';
                        now++;
                        return ;
                    } else
                        gameBoard[i][j] = ' ';
                }
            }
        }

        if(corner > 0){
            corner--;
            for(int i = 0; i < 3; i++){
                if(i == 1)
                    continue;
                boolean NoBigO = true;
                for(int j = 0; j < 3; j++){
                    if(gameBoard[i][j] == 'O')
                        NoBigO = false;
                }
                for(int j = 0; j < 3 && NoBigO; j++){
                    if(gameBoard[i][j] == ' '){
                        gameBoard[i][j] = 'X';
                        now++;
                        return;
                    }
                }
            }

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(j == 1 || i == 1)
                        continue;
                    if(gameBoard[i][j] == ' '){
                        gameBoard[i][j] = 'X';
                        now++;
                        return;
                    }
                }
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(gameBoard[i][j] == ' '){
                    gameBoard[i][j] = 'X';
                    if(willBeSuccessful(-1)){
                        now++;
                        return;
                    } else
                        gameBoard[i][j] = ' ';
                }
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(gameBoard[i][j] == ' '){
                    gameBoard[i][j] = 'O';
                    if (willBeSuccessful(1)) {
                        gameBoard[i][j] = 'X';
                        now++;
                        return;
                    } else
                        gameBoard[i][j] = ' ';
                }
            }
        }

        int l, c;
        while(true){
            l = (int)(Math.random() * 3);
            c = (int)(Math.random() * 3);
            if(gameBoard[l][c] == ' '){
                gameBoard[l][c] = 'X';
                break;
            }
        }
        now++;
    }




}










