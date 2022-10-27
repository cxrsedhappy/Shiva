package task4;

public class ComputerMain {
    public static void main(String[] args) {
        for (Computer pc : Computer.values()) {
            System.out.println(pc + " " + pc.getName() + " - " + pc.getPrice());
        }
    }
}
