import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Index number " + i + ": ");
            array[i] = key.nextInt();
        }
        int stop=1,swap;
        while(stop==1) {
            stop=0;
            for(int i=0;i<n-1;i++){
                if(array[i]>array[i+1]){
                    swap=array[i];
                    array[i]=array[i+1];
                    array[i+1]=swap;
                    stop=1;
                }
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+array[i];
        }
        System.out.print("array: ");
        for(int i=0;i<n;i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.printf(" sum: %d, average: %.2f",sum,1.0*sum/n);
    }
}