import java.util.Scanner;
public class FunctionSolve{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Function ax+b=0");
        System.out.print("Value a: ");
        float a = input.nextFloat();
        System.out.print("Value b: ");
        float b = input.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("Infinitely many roots");
            }else{
                System.out.println("The equation has no solution");
            }
        }else{
            System.out.printf("x = %.2f\n",-(b/a));
        }
    }
}
