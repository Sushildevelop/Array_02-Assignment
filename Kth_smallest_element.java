package Practice.Array.Array_2.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_smallest_element {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        int k=sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
