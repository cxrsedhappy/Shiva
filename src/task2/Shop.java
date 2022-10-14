package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Shop {
    private List<Computer> computers = new ArrayList<Computer>();

    public void addPC(Computer computer){
        computers.add(computer);
    }

    public Computer getPC(String name){
        for (Computer pc : computers){
            if (Objects.equals(pc.getName(), name)){
                return pc;
            }
        }
        return null;
    }
}
