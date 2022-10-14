package task2;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add computers");
        for (int i = 1; i < 3; i++){
            System.out.println("Computer #" + i);
            String pcName = scanner.nextLine();
            int pcPrice = scanner.nextInt();
            scanner.nextLine();
            shop.addPC(new Computer(pcName, pcPrice));
        }

        Computer pc = shop.getPC("HYPERX");
        System.out.println("PC exists!\n" + pc.getName() + "\n" + pc.getPrice());
        shop.addPC(new Computer("NVIDIA", 290000));
        System.out.println("Nvidia pc added");
        Computer nvidiaPC = shop.getPC("NVIDIA");
        System.out.println("NVIDIAPC exists!\n" + nvidiaPC.getName() + "\n" + nvidiaPC.getPrice());
    }
}
