package Assignments.Assignment5;

public abstract class DessertItem {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DessertItem() {
    }

    public DessertItem(String name) {
        if (name.length()<=DessertShoppe.MAXSIZE_OF_ITEM_NAME){
            this.name = name;
        }
    }

    public abstract int getCost();
}
