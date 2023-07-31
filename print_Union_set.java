package Practice.Array.Array_2.Assignment;

import java.util.Scanner;

public class print_Union_set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int []a=new int[n];
        int []b=new int[m];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<m;i++){
            b[i]=sc.nextInt();
            boolean check=false;
            for (int j=0;j<n;j++){
                if (b[i]==a[j]){
                    check=true;
                    break;
                }
            }
            if (!check){
                System.out.print(b[i]);
            }
        }
    }
}
