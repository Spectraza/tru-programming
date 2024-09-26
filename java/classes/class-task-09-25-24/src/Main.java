//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final int LIMIT = 15, MULTIPLE = 10;
        int [] list = new int [LIMIT];

        for (int i = 0; i < LIMIT; i++){
            list [i] = i * MULTIPLE;
        }

        list[5] = 999;

        for (int i = 0; i < LIMIT; i++){
            System.out.println(list[i]);
        }


//        int [] numbers = {10, 20, 30, 40, 50};
//
//        System.out.println("Array elements are: ");
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//
//        numbers[2] = 35;
//        numbers[4] = 3;
//
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("The modified Array elements are: " + numbers[i]);
//        }
    }
}