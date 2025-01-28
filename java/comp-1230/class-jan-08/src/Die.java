import java.util.Random;
public class Die {
    private final int MAX = 6;
    private int value = 1;

    public Die(){
        this.value = 0;
    }

    public int getValue(){
        this.value = new Random().nextInt(MAX);
        return this.value;
    }
}
