package kata2.good.concretes;

import kata2.good.interfaces.Printable;

public class BasicPrinter implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}
