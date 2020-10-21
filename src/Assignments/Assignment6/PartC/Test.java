package Assignments.Assignment6.PartC;

import java.text.ParseException;

public class Test {
    public static void main(String[] args) throws ParseException {
        Pet Spot = new Pet("Spot","Mary","Black and White");
        Spot.setSex(Pet.MALE);
        System.out.println(Spot);

        System.out.println();
        Cat Tom = new Cat("Tom","Bob","Black","Short");
        Tom.setSex(Pet.SPAYED);
        System.out.println(Tom);
        Tom.setBoardStart(5,12,2020);
        Tom.setBoardEnd(8,31,2020);
        boolean flag;
        flag=Tom.boarding(6,10,2020);
        System.out.println("Start: "+Tom.getStartDate()+"/ End: "+Tom.getEndDate()+"/ Now: 6-10-2020/ Boarding: "+flag);
        flag=Tom.boarding(5,12,2020);
        System.out.println("Start: "+Tom.getStartDate()+"/ End: "+Tom.getEndDate()+"/ Now: 5-12-2020/ Boarding: "+flag);
        flag=Tom.boarding(9,1,2020);
        System.out.println("Start: "+Tom.getStartDate()+"/ End: "+Tom.getEndDate()+"/ Now: 9-1-2020/ Boarding: "+flag);

        System.out.println();
        Dog spot = new Dog("Spot","Susan","White","Medium");
        spot.setSex(Pet.SPAYED);
        System.out.println(spot);
        spot.setBoardStart(3,1,2019);
        spot.setBoardEnd(1,2,2020);
        flag=spot.boarding(6,10,2020);
        System.out.println("Start: "+spot.getStartDate()+"/ End: "+spot.getEndDate()+"/ Now: 6-10-2020/ Boarding: "+flag);
        flag=spot.boarding(9,12,2019);
        System.out.println("Start: "+spot.getStartDate()+"/ End: "+spot.getEndDate()+"/ Now: 9-12-2019/ Boarding: "+flag);
        flag=spot.boarding(9,1,2018);
        System.out.println("Start: "+spot.getStartDate()+"/ End: "+spot.getEndDate()+"/ Now: 9-1-2018/ Boarding: "+flag);


/*
        OutPut:
        Spot owned by Mary
        Color: Black and White
        Sex: Male

        CAT:
        Tom owned by Bob
        Color: Black
        Sex: Spayed
        Hair: Short
        Start: 5-12-2020/ End: 8-31-2020/ Now: 6-10-2020/ Boarding: true
        Start: 5-12-2020/ End: 8-31-2020/ Now: 5-12-2020/ Boarding: true
        Start: 5-12-2020/ End: 8-31-2020/ Now: 9-1-2020/ Boarding: false

        DOG:
        Spot owned by Susan
        Color: White
        Sex: Spayed
        Size: Medium
        Start: 3-1-2019/ End: 1-2-2020/ Now: 6-10-2020/ Boarding: false
        Start: 3-1-2019/ End: 1-2-2020/ Now: 9-12-2019/ Boarding: true
        Start: 3-1-2019/ End: 1-2-2020/ Now: 9-1-2018/ Boarding: false
*/

    }
}
