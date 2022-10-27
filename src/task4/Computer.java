package task4;

public enum Computer {
    CPU(24999, "Intel i9 12900k"),
    GPU(139999, "RTX 4090"),
    RAM(5999, "Corsair White");

    private int price;
    private String name;
    Computer(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
