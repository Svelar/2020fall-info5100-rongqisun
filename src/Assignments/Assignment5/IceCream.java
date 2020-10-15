package Assignments.Assignment5;

public class IceCream extends DessertItem{
    private int cost;

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String toString() {
        return name+"\t"+DessertShoppe.cents2dollarsAndCents(getCost());
    }

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }
}
