import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter all details about the Hero from League of Legends");

            System.out.println("Name: ");
            String name = scan.nextLine();

            System.out.println("Spell Q: ");
            String q = scan.nextLine();

            System.out.println("Spell W: ");
            String w = scan.nextLine();

            System.out.println("Spell E: ");
            String e = scan.nextLine();

            System.out.println("Spell R: ");
            String r = scan.nextLine();

            System.out.println("Level: ");
            int level = scan.nextInt();


            Hero hero = new Hero(name,q,w,e,r,level);

            hero.display();



    }
}