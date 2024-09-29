import java.util.Scanner;
public class MoreFuncSolve{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Function ax^2+bx+c=0");
        System.out.print("Value a: ");
        float a = input.nextFloat();
        System.out.print("Value b: ");
        float b = input.nextFloat();
        System.out.print("Value c: ");
        float c = input.nextFloat();
        float delta=b*b-4*a*c;
        if(delta<0){
            System.out.println("No solution");
        }else if(delta==0){
            System.out.printf("x = %.2f\n",-b/(2*a));
        }else{
            System.out.printf("x1 = %.2f,x2 = %.2f\n",-(b+Math.sqrt(delta))/(2*a),-(b-Math.sqrt(delta))/(2*a));
        }
    }
}