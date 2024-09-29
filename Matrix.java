import java.util.Scanner;
public class Matrix{
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        int m = key.nextInt();
        int n = key.nextInt();
        int[][] array1 = new int[m][n];
        int[][] array2 = new int[m][n];
        int[][] array = new int[m][n];
        System.out.println("matrix 1");
        for (int i = 0; i < m; i++) {
            for  (int j = 0; j < n; j++) {
                array1[i][j] = key.nextInt();
            }    
        }
        System.out.println("matrix 2");
        for (int i = 0; i < m; i++) {
            for  (int j = 0; j < n; j++) {
                array2[i][j] = key.nextInt();
            }    
        }
        for (int i = 0; i < m; i++) {
            for  (int j = 0; j < n; j++) {
                array[i][j] = array1[i][j]+array2[i][j];
                System.out.printf("%d\t",array[i][j]);
            } 
            System.out.print("\n");   
        }
    }
}