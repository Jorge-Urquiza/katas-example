package kata1.bad;

public class Dog implements Animal {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Dog can't fly");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
