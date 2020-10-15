package Assignments.Assignment5;

public class DessertShoppe {
    public static final double TAX_RATE = 0.065;
    public static final String STORE_NAME = "M & M Dessert Shoppe";
    public static final int MAXSIZE_OF_ITEM_NAME = 100;

    //Costs are calculated by cents, when transfer to dollars, they will keep only two digits after decimal, so this constant is unnecessary.
    public static final int WIDTH_OF_DISPLAY = 3;
    public static String cents2dollarsAndCents(int cents){
        return String.valueOf((double) cents/100);
    }

}
