package Assignments.Assignment3.ProfessorBuilderPattern;

public class Test {
    public static void main(String[] args) {
        Professor siva = new Professor.Builder("Dosapati", "Siva")
                .setId(10086).build();

        siva.teach();


        //OUTPUT:
        //Dosapati Siva 10086 is teaching info5100

    }
}
