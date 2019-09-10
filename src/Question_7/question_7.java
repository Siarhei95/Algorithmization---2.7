package Question_7;

import java.util.Scanner;

public class question_7 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int n = scanner.nextInt();
        double[][]a = new double[n][n];
        int k = 0;
        System.out.println("Matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                a[i][j] = Math.rint(Math.sin(((i * i - j * j) / n))*100)/100;
                if(a[i][j]>0) {
                    k=k+1;
                }
                System.out.print(a[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("The number of positive: " + k);
    }
}
