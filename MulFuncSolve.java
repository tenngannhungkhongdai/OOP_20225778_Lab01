import java.util.Scanner;
public class MulFuncSolve{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Function a1x+b1y=c1,a2x+b2y=c2");
        System.out.print("Value a1: ");
        float a1 = input.nextFloat();
        System.out.print("Value b1: ");
        float b1 = input.nextFloat();
        System.out.print("Value c1: ");
        float c1 = input.nextFloat();
        System.out.print("Value a2: ");
        float a2 = input.nextFloat();
        System.out.print("Value b2: ");
        float b2 = input.nextFloat();
        System.out.print("Value c2: ");
        float c2 = input.nextFloat();
        if((a1/a2)==(b1/b2)){
            if((a1/a2)==(c1/c2)){
                System.out.println("Infinitely many roots");
            }else{
                System.out.println("The equation has no solution");
            }
        }else{
            System.out.printf("x = %.2f,y = %.2f\n",(c1*b2-c2*b1)/(a1*b2-a2*b1),(a1*c2-a2*c1)/(a1*b2-a2*b1));
        }
    }
}