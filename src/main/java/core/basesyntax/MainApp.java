package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = new Machine [] {new Excavator(), new Bulldozer(), new Truck()};
        for (Machine x : machine) {
            x.doWork();
            x.stopWork();
        }
    }
}
