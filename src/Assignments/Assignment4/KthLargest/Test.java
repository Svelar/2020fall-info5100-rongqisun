package Assignments.Assignment4.KthLargest;

public class Test {
    public static void main(String[] args) {
        Integer[] numsA = new Integer[]{-2,1,-3,4,-1,2,1,-5,4};
        Integer[] numsB = new Integer[]{3, 2, 1, 5, 6, 4};
        Integer[] numsC = new Integer[]{3,2,3,1,2,4,5,5,6};
        KthLargestElement Kth = new KthLargestElement();
        System.out.println(Kth.KthLarEle(numsA,3));
        System.out.println(Kth.KthLarEle(numsB,2));
        System.out.println(Kth.KthLarEle(numsC,4));


/*        Output:
        2
        5
        4*/

    }
}
