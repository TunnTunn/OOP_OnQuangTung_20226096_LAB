import java.util.Scanner;

public class Lab01_64 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a Month: ");
        String month = keyboard.nextLine();
        System.out.println("Enter a Year: ");
        int year = keyboard.nextInt();

        switch (month) {
            case "January":
            case "Jan.":
            case "Jan":
            case "1":
            case "March":
            case "Mar.":
            case "Mar":
            case "3":
            case "May":
            case "5":
            case "July":
            case "Jul":
            case "7":
            case "August":
            case "Aug.":
            case "Aug":
            case "8":
            case "October":
            case "Oct.":
            case "Oct":
            case "10":
            case "December":
            case "Dec.":
            case "Dec":
            case "12":
                System.out.println(31);
                break;

            case "April":
            case "Apr.":
            case "Apr":
            case "4":
            case "June":
            case "Jun":
            case "6":
            case "September":
            case "Sept.":
            case "Sep":
            case "9":
            case "November":
            case "Nov.":
            case "Nov":
            case "11":
                System.out.println(30);
                break;

            case "Febuary":
            case "Feb.":
            case "Feb":
            case "2":
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                System.out.println("29");
                else
                System.out.println("28");
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }
}
