package Practice.Array.Array_2.Assignment;

import java.util.Scanner;

public class Index_subarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=0;
        int sum=0;
        while(j<n){
            sum+=arr[j];
            if (sum>s){
                while(sum>s && i<j){
                    sum-=arr[i];
                    i++;
                }
            }
            if (sum==s){
                System.out.print(i+" ");
                System.out.print(j);
                break;
            }
            j++;
        }
    }
}
