package Assignments.Assignment6.PartA;

public class Test {
    public static void main(String[] args) {
        Mreview mreview = new Mreview("MULAN",1);
        mreview.addRating(3);
        mreview.addRating(4);
        mreview.addRating(3);
        mreview.addRating(7);
        System.out.println(mreview);
        System.out.println();
        System.out.println("Average rating: "+mreview.aveRating());

    }
}
