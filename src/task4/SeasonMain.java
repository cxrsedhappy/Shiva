package task4;

public class SeasonMain {
    public static void main(String[] args) {
        // 1)
        Season season = Season.WINTER;

        // 2)
        switch (season) {
            case AUTUMN -> {
                System.out.println("I like autumn");
                break;
            }
            case SPRING -> {
                System.out.println("I like spring");
                break;
            }
            case SUMMER -> {
                System.out.println("I like summer");
                break;
            }
            case WINTER -> {
                System.out.println("I like winter");
                break;
            }
        }

        // 3)
        for (Season s : Season.values()){
            System.out.println(s.getTemperature());
        }

        // 4)
        // season.getTemperature();

        // 5)
        // System.out.println(season.getDescription());

        // 6)
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.getTemperature() + " " + s.getDescription());
        }
    }
}


