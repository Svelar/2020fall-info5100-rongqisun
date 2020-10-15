package Assignments.Assignment5;

public class Candy extends DessertItem{
    private double Weight;
    private int PricePerPound;

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public double getPricePerPound() {
        return PricePerPound;
    }

    public void setPricePerPound(int pricePerPound) {
        PricePerPound = pricePerPound;
    }

    public Candy(String name,  double weight, int pricePerPound) {
        super(name);
        Weight = weight;
        PricePerPound = pricePerPound;
    }

    @Override
    public String toString() {
        return Weight+" lbs. @ "+DessertShoppe.cents2dollarsAndCents(PricePerPound)+" /lb."+"\n"+
                name+"\t"+ DessertShoppe.cents2dollarsAndCents(getCost());
    }

    @Override
    public int getCost() {
        double cost=getPricePerPound()*getWeight();
        return (int)Math.round(cost);
    }
}
