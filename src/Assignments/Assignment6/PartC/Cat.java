package Assignments.Assignment6.PartC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat extends Pet implements Boardable{
    private String hairLength;
    private String startDate;
    private String endDate;

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

    public Cat(String name, String ownerName, String color, String hairLength) {
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }

    @Override
    public String toString() {
        return "CAT:\n" +
                getName() + " owned by " + getOwnerName() +
                "\nColor: " + getColor() +
                "\nSex: " + getSex() +
                "\nHair: " + hairLength;
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
