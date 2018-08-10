import java.util.Scanner;

public class Lesson8 {
    public static void main(String args[]){
        //boolean / (Boolean) true / false value.
        double employeePay = 0;
        boolean isChanged = false;
        Scanner scan = new Scanner(System.in);

        //Let user enter how much someone earns.
        System.out.println("Enter the new pay for the employee: ");
        employeePay = scan.nextDouble();

        if(employeePay != 0){
            //set boolean to true
            isChanged = true;
        }
        //is true
        if(isChanged){
            System.out.println("The employee's pay has changed from it's intial value of 0");
        }

        //This is the exact same as using false
        if(!isChanged){
            System.out.println("The employee's pay is the same");
        }

    }
}
