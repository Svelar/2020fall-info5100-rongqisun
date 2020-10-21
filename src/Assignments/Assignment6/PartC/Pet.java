package Assignments.Assignment6.PartC;

public class Pet {
    private String name;
    private String ownerName;
    private String color;
    protected int sex;
    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 4;

    public Pet(String name, String ownerName, String color) {
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        String Sex="";
        switch (sex){
            case MALE:
                Sex = "Male";
                break;
            case FEMALE:
                Sex = "Female";
                break;
            case SPAYED:
                Sex = "Spayed";
                break;
            case NEUTERED:
                Sex = "Neutered";
                break;
        }
        return Sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + " owned by " + ownerName +
                "\nColor: " + getColor() +
                "\nSex: " + getSex();
    }
}
