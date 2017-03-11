package junit.tutorial;

/**
 * Created by Masaya SHIMOMURA on 2015/08/24.
 */
public class Calculator {
    public int multiply(int x, int y){
        return x * y;
    }

    public float divide(int x, int y){
        if (y == 0) throw new IllegalArgumentException("divide by zero");
        return (float) x / (float) y;
    }
}
