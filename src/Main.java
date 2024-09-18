import java.util.Scanner;//library for scanner

public class Main {
    public static void main(String[] args) {

        int age;
        String comment;

        Scanner input = new Scanner(System.in); //part of code which gives an ability to type an age
        System.out.print("Enter your age: ");
        age = input.nextInt(); //you can type the age

        if (age >= 0 && age <= 12) { //condition for a child

            comment = "Child";
        }
        else if (age >= 13 && age <= 19) { // condition for a teenager

            comment = "Teenager";
        }
        else if (age >= 20 && age<= 64) { // condition for an adult

            comment = "Adult";
        }
        else if (age > 65) { //condition for a senior

            comment = "Senior";
        }
        else{
            comment = "Please enter a valid age";
        }
        System.out.println("Age: " +age);
        System.out.println("Comment: " +comment);
    }
}

/****
 *
 * Name: Valeriia
 * Student Number: T00739110
 * Program Description: We have our 2 variables, such as integer and string
 * Scanner helps us to enter any number a user wants
 * After a user enters their number, it will check conditions and decides which one can be done
 * If we have a person, whose age is more than 0 but less than 12, it will show a comment that it is a child
 * If we have a person, whose age is more than 13 but less than 19, it will show a comment that it is a teenager
 * The same happens with adult, and almost the same with a senior. With senior, if we have a person, whose age is
 * more than 65, it will show a comment that it is a senior.
 *
 * However, if we type not an age but something else (such as -7, -18), it will show a comment with asking us to write a valid age
 * In the end, there is command, which print the result.
 *
 */