package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addObserver(new TVNews());
        journal.addObserver(new Newspaper());
        journal.addObserver(new RadioNews());
        journal.publishNews("Tú bị bố đánh");
    }
}
