import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int largest, secondLargest;

        if (A >= B && A >= C) {
            largest = A;
            secondLargest = Math.max(B, C);
        } else if (B >= A && B >= C) {
            largest = B;
            secondLargest = Math.max(A, C);
        } else {
            largest = C;
            secondLargest = Math.max(A, B);
        }

        
        System.out.println(secondLargest);
    }
}