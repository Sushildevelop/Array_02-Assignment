package Practice.Array.Array_2.Assignment;

import java.util.Scanner;

public class Negative_Elements_atEnd {
    public static void printArray(){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Input of Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Print of array");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int [] ans=new int[n];
        int index=0;
        for (int i=0;i<n;i++){
            if (arr[i]>=0){
                ans[index]=arr[i];
                index++;
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i]<0){
                ans[index]=arr[i];
                index++;
            }
        }
        System.out.println("\nFinal Ouput");
        for (int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }


    public static void main(String[] args) {

        printArray();
    }
}
