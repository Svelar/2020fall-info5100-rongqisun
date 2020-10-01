package Assignments.Assignment3.ProfessorBuilderPattern;

public class Professor {
    private String firstName;
    private String lastName;
    private int id;

    public static class Builder {
        private String firstName;
        private String lastName;
        private int id;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Professor build() {
            return new Professor(firstName, lastName, id);
        }
    }


    public Professor(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }
    void teach() {
        System.out.println(firstName+" "+lastName+" "+id + " is teaching info5100");
    }

}

