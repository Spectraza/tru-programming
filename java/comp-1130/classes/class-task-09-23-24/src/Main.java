//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        String [] names = new String [11];

        names[0] = "Tinorenda";
        names[1] = "Minh";
        names[2] = "Maria";
        names[3] = "Sam";
        names[4] = "Roemar";
        names[5] = "Chubiyojo";
        names[6] = "Leif";
        names[7] = "Maddox";
        names[8] = "Valeria";
        names[9] = "Toyin";
        names[10] = "Clive";

        for (int i = 0; i < names.length; i++){
            System.out.println("Name " + (i+1) + " is " + names[i]);
        }

    }
}