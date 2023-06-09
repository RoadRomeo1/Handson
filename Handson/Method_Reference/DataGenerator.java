package Handson.Method_Reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    private List<Emp> list = new ArrayList<>();


    public List<Emp> getAllData(){

    
        this.list.add(new Emp("Apple", 1, Arrays.asList("Immunity", "Taste", "Texture", "Color")));
        this.list.add(new Emp("Banana", 2, Arrays.asList("Potassium Rich", "Quick Energy", "Dry", "Weather Sensitive")));
        this.list.add(new Emp("Jakefruit", 3, Arrays.asList("Spikey", "Unknown", "Seeds Rich")));
        this.list.add(new Emp("Tomato", 4, Arrays.asList("Red", "Juicy", "Slushy", "Tasty", "Tangy")));
        this.list.add(new Emp("Cranberry", 5, Arrays.asList("Juicy", "Red", "Berries", "Juices", "Squashy", "Single Seed")));
        this.list.add(null);
        return list;
    }

    public List<Emp> getNullDataAsWell(){`
        this.list.add(1, new Emp(null, 100, Arrays.asList("Immunity", "Taste", "Texture", "Color")));
        return list;
    }

    public void setList(List<Emp> list) {
        this.list = list;
    }

}
