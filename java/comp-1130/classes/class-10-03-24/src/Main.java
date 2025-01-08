import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[][] seats = {
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };

        Scanner scan = new Scanner(System.in);

        displaySeating(seats);

        System.out.print("Enter the row number (1-5) to book a seat: ");
        int row = scan.nextInt();
        System.out.print("Enter the colum number (1-5) to book a seat: ");
        int col = scan.nextInt() - 1;

        if (seats[row][col] == '0') {
            seats[row][col] = 'X';
            System.out.println("The seat is successfully booked");
        }
        else {
            System.out.println("The seat is already booked");
        }
        displaySeating(seats);


//
//        String [] [] chessBoard = new String[8][8];
//
//        for (int i = 0; i < 8; i++){
//            for (int j = 0; j < 8; j++){
//                chessBoard[i][j] = "_";
//            }
//        }
//          //White
//        chessBoard[0][0] = "R";
//        chessBoard[0][1] = "Kn";
//        chessBoard[7][4] = "K";
//        chessBoard[7][0] = "R";
//        chessBoard[7][1] = "Kn";
//        chessBoard[7][2] = "B";
//        chessBoard[7][3] = "Q";
//        chessBoard[7][5] = "B";
//        chessBoard[7][6] = "Kn";
//        chessBoard[7][7] = "R";
//        chessBoard[6][0] = "P";
//        chessBoard[6][1] = "P";
//        chessBoard[6][2] = "P";
//        chessBoard[6][3] = "P";
//        chessBoard[6][4] = "P";
//        chessBoard[6][5] = "P";
//        chessBoard[6][6] = "P";
//        chessBoard[6][7] = "P";
//
//        for (int i = 0; i < 8; i++){
//            for (int j = 0; j < 8; j++){
//                System.out.print(chessBoard[i][j] + " ");
//            }
//            System.out.println();
//        }

//        Course[] courses = new Course[4];
//
//        courses[0] = new Course(1130, "Computer Programming", 1);
//        courses[1] = new Course(1290, "Drawing", 4);
//        courses[2] = new Course(1350, "Math", 2);
//        courses[3] = new Course(1560, "Writing", 1);
//
//
//        for (int i = 1; i < courses.length; i++){
//            System.out.println("Course " + i + ": ");
//            courses[i].display();
//        }


//        for (int i = 1; i < courses.length; i++) {
//            System.out.println("Course " + i + ": ");
//            courses[i].display();
//        }
    }

    private static void displaySeating(char[][] seats) {
        System.out.println("Cinema System Arrangement:");
        System.out.println("1 2 3 4 5");
        System.out.println("----------");
        for (int i =0; i < seats.length; i++){
            for (int j = 0; j < seats.length; j++){
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}