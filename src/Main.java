/*
Question : Given a matrix 'a' of dimension r * c and 2 coordinates (l1 ,r1) and (l2 , r2).
           Return the sum of the rectangle from (l1 ,r1) and (l2 , r2)
_________________________________________________________________________________________________
Note : l2 >= l1 , r2 >= r1
       0 <= l1,l2 < r
       0 <= r1,r2 < c
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c,d,e,f,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row matrix :");
        a = sc.nextInt();
        System.out.println("Enter the size of column matrix :");
        b = sc.nextInt();
        int[][] arr = new int[a][b];
        System.out.println("Enter the element of inside matrix :");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Firstly, printing the matrix :");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Enter the first coordinate value of matrix :");
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println("Enter the second coordinate value of matrix :");
        e = sc.nextInt();
        f = sc.nextInt();
        for (int i = c; i <= d; i++){
            for (int j = e; j <= f; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Printing the final value of matrix :");
        System.out.println(sum);
    }
}