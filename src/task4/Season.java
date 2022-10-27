package task4;

public enum Season {
    SUMMER(30, "Hot"),
    SPRING(20, "Warm"),
    AUTUMN(15, "Cold"),
    WINTER(-15, "Bro, Im like IceCobe");

    private final int temperature;
    private final String description;

    Season(int temperature, String description){
        this.temperature = temperature;
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public int getTemperature() {
        return this.temperature;
    }
}
