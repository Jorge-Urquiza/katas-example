package kata1.bad;

public class Bird implements Animal{

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Bird can't swim");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }
}
