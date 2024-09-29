import java.util.Scanner;
public class DaysOfMonth{
    public static void main(String args[]){
        Scanner key1 = new Scanner(System.in);
        Scanner key2 = new Scanner(System.in);
        System.out.print("Year: ");
        int year = key1.nextInt();
        System.out.print("Month: ");
        String month = key2.nextLine();
        switch(month){
            case "January":
            case "Jan":
            case "1":
            case "Jan.":
            case "March":
            case "Mar":
            case "3":
            case "Mar.":
            case "May":
            case "5":
            case "May.":
            case "July":
            case "Jul":
            case "7":
            case "Jul.":
            case "August":
            case "Aug":
            case "8":
            case "Aug.":
            case "October":
            case "Oct":
            case "10":
            case "Oct.":
            case "December":
            case "Dec":
            case "12":
            case "Dec.":
                System.out.println("31 days");
                break;
            case "April":
            case "Apr":
            case "4":
            case "Apr.":
            case "June":
            case "Jun":
            case "6":
            case "Jun.":
            case "September":
            case "Sep":
            case "9":
            case "Sep.":
            case "November":
            case "Nov":
            case "11":
            case "Nov.":
                System.out.println("30 days");
                break;
            case "Febuary":
            case "Feb":
            case "2":
            case "Feb.":
                if(year%4==0){
                    System.out.println("29 days");
                    break;
                }else{
                    System.out.println("28 days");
                    break;
                }
            default:
                System.out.println("Invalid");
        }
    }
}