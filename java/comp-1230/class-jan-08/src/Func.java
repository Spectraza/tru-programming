public class Func {
    private int a;
    private int b;

    public Func(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add(){
        int sum = this.a + this.b;
        System.out.println("Sum is " + sum);
    }
    public void sub(){
        int sub = this.a - this.b;
        System.out.println("Substraction is " + sub);
    }
    public void mul(){
        int mul = this.a * this.b;
        System.out.println("Product is " + mul);
    }
    public void div(){
        int div = this.a / this.b;
        System.out.println("Dividing is " + div);
    }
}
