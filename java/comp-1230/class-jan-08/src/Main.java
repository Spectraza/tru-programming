public class Main {
    public static void main(String[] args) {
        Func func = new Func(5, 5);
        Die die = new Die();

        func.add();
        func.sub();
        func.mul();
        func.div();

        System.out.println(die.getValue());
    }
}