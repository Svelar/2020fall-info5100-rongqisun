package Assignments.Assignment5;

import java.util.List;
import java.util.Vector;

public class CheckOut {

    List <DessertItem> Items = new Vector<>();



    public CheckOut() {
    }

    public int numberOfItems(){
        return Items.size();
    }

    public void enterItem(DessertItem item){
        Items.add(item);
    }

    public void clear(){
        Items.clear();
    }

    public int totalCost(){
        int totalcost = 0;
        for (DessertItem item:
             Items) {
            totalcost+=item.getCost();
        }
        return totalcost;
    }

    public int totalTax(){
        return (int)Math.round(totalCost()*DessertShoppe.TAX_RATE);
    }

    public String PrintItems(){
        String results="";
        for (DessertItem item:
             Items) {
            results+=item+"\n";
        }
        return results;
    }

    @Override
    public String toString() {
        return DessertShoppe.STORE_NAME+"\n"+
                "--------------------"+"\n"+"\n"+
                PrintItems()+"\n"+
                "Tax "+DessertShoppe.cents2dollarsAndCents(totalTax())+"\n"+
                "Total Cost "+DessertShoppe.cents2dollarsAndCents(totalTax()+totalCost())+"\n";
    }
}
