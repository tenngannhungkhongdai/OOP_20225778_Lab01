import java.util.Scanner;
public class InputFromKeyboard{
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        System.out.println("Name?");
        String strName = key.nextLine();
        System.out.println("Age?");
        int age = key.nextInt();
        System.out.println("Height?");
        double tall = key.nextDouble();
        System.out.println("name: " + strName + ", Age: " + age + ", Height: " + tall + ".");
    }
}