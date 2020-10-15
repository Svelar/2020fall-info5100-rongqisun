package Assignments.Assignment5;

public class Sundae extends IceCream{
    private String Topping;
    private int ToppingCost;

    public String getTopping() {
        return Topping;
    }

    public void setTopping(String topping) {
        Topping = topping;
    }

    public int getToppingCost() {
        return ToppingCost;
    }

    public void setToppingCost(int toppingCost) {
        ToppingCost = toppingCost;
    }

    public Sundae(String IceCreamName, int IceCreamCost, String topping, int toppingCost) {
        super(IceCreamName, IceCreamCost);
        Topping = topping;
        ToppingCost = toppingCost;
    }

    @Override
    public int getCost(){
        return super.getCost()+getToppingCost();
    }

    @Override
    public String toString() {
        return Topping+" Sundae with\n"+
                name+"\t"+DessertShoppe.cents2dollarsAndCents(getCost());
    }
}
