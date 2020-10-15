package Assignments.Assignment5;

public class Cookie extends DessertItem{
    private int Number;
    private int PricePerDozen;

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public double getPricePerDozen() {
        return PricePerDozen;
    }

    public void setPricePerDozen(int pricePerDozen) {
        PricePerDozen = pricePerDozen;
    }

    public Cookie(String name, int number, int pricePerDozen) {
        super(name);
        Number = number;
        PricePerDozen = pricePerDozen;
    }

    @Override
    public int getCost() {
        double cost=(getPricePerDozen()/12)*getNumber();
        return (int)Math.round(cost);
    }

    @Override
    public String toString() {
        return Number+" @ "+DessertShoppe.cents2dollarsAndCents(PricePerDozen)+" /dz."+"\n"+
                name+"\t"+
                DessertShoppe.cents2dollarsAndCents(getCost());
    }
}
