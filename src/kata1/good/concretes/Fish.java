package kata1.good.concretes;

import kata1.good.interfaces.Swimmable;

public class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
