package Assignments.Assignment6.PartC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Pet implements Boardable{
    private String size;
    private String startDate;
    private String endDate;

    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "DOG:\n" +
                getName() + " owned by " + getOwnerName() +
                "\nColor: " + getColor() +
                "\nSex: " + getSex() +
                "\nSize: " + size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        this.size = size;
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        this.startDate = Integer.toString(month)+"-"+Integer.toString(day)+"-"+Integer.toString(year);
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        this.endDate = Integer.toString(month)+"-"+Integer.toString(day)+"-"+Integer.toString(year);
    }

    @Override
    public boolean boarding(int month, int day, int year) throws ParseException {
        Date dataNow = sdf.parse(Integer.toString(month)+"-"+Integer.toString(day)+"-"+Integer.toString(year));
        Date dateStart = sdf.parse(startDate);
        Date dateEnd = sdf.parse(endDate);
        if (dataNow.getTime()>=dateStart.getTime()&&dataNow.getTime()<=dateEnd.getTime()){
            return true;
        }else {
            return false;
        }
    }
}
