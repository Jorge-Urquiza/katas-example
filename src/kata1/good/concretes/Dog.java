package kata1.good.concretes;

import kata1.good.interfaces.Swimmable;

public class Dog implements Runnable, Swimmable {
    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}
