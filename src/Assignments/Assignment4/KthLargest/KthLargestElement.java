package Assignments.Assignment4.KthLargest;

/*(Score: 2) Kth Largest Element in an Array
        Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
        Example 1:
        Input: [3, 2, 1, 5, 6, 4] and k = 2 Output: 5
        Example 2:
        Input: [3,2,3,1,2,4,5,5,6] and k = 4 Output: 4
        Note:
        You may assume k is always valid, 1 ≤ k ≤ array's length.
        Inplement the test cases in class Test's main method. Please don't forget to consider about the corner cases.*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class KthLargestElement {
    public Integer KthLarEle(Integer[] arr,int k){
        List<Integer> list = Arrays.asList(arr);
        list.sort(null);
        Collections.reverse(list);
        return list.get(k-1);
    }

}
