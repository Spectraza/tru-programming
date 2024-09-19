import java.util.Scanner;//library for scanner

public class Main {
    public static void main(String[] args) {

        int degrees;
        String comment;

        Scanner input = new Scanner(System.in); //part of code which gives an ability to type a number
        System.out.print("Enter the degrees: ");
        degrees = input.nextInt(); //you can type

        if (degrees <= 0 ) { //condition for a temperature lower or equal 0

            comment = "Freezing";
        }
        else if (degrees > 0 && degrees <= 10) { // condition for a temperature higher than 0 but lower or equal to 10

            comment = "Cold";
        }
        else if (degrees >= 11 && degrees<= 25) { // // condition for a temperature higher than 11 but lower or equal to 25

            comment = "Warm";
        }

        else if (degrees >= 26 && degrees < 35) { // // condition for a temperature higher than 26 but lower or equal to 35

            comment = "Hot";
        }

        else if (degrees > 35) { // condition for a temperature higher than 35

            comment = "Very hot";
        }
        else{
            comment = "Please enter a valid age";
        }
        System.out.println("Temperature: " +degrees);
        System.out.println("Comment: " +comment);
    }
}

/****
 *
 * Name: Valeriia
 * Student Number: T00739110
 * Program Description:
 * We have a program where we can know if it is cold or hot outside.
 * I left some comments around the code. If it is lower than 0, it will tell us it is freezing.
 * If it is higher than 0 but lower than 10, it will tell us it is cold
 * If it is higher than 11 but lower than 25, it will tell us it is warm
 * If it is higher than 26 but lower than 35, it will tell us it is hot
 * If it is higher than 35, it will tell us it is very hot
 *
 *
 */