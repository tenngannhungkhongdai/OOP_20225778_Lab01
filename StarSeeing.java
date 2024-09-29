import java.util.Scanner;
public class StarSeeing{
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        int star = key.nextInt();
        for(int i=1;i<=star;i++){
            for(int j=0;j<star-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}