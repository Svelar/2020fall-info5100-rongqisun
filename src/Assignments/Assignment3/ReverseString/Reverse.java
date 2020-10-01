package Assignments.Assignment3.ReverseString;

public class Reverse {

    public String reverse(String s) {
        s= s.trim();
        String[] StrSplit = s.split("\\s+");
        String result ="";
        for (int i = StrSplit.length-1; i >=0 ; i--) {
            result+=(StrSplit[i]+" ");
        }
        return result.trim();
    }


    public static void main(String[] args) {
        String s = "    yt tg   hdvd ashsd    sdd     dd d d ";
        Reverse obj = new Reverse();
        System.out.println("-"+obj.reverse(s)+"-");
        String t = " The        sky is blue   ";
        System.out.println("-"+obj.reverse(t)+"-");

/*        Output:
        -d d dd sdd ashsd hdvd tg yt-
        -blue is sky The-*/

    }
}
