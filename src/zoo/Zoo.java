package zoo;

import zoo.attraction.Attraction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zoo {

    private Integer entranceFee;
    private String name;
    private Set<Attraction> attractions = new HashSet<>();

    public Zoo(Integer entranceFee, String name) {
        if(entranceFee<0 || name.isEmpty())
            throw new IllegalArgumentException();
        this.entranceFee = entranceFee;
        this.name = name;
    }

    public Integer getEntranceFee() {
        return entranceFee;
    }

    public String getName() {
        return name;
    }

    public int getNrOfAttractions(){
        System.out.println(this.attractions.size());
        return this.attractions.size();
    }

    public void addAttraction(Attraction attraction){
        if(attraction == null)
            throw new IllegalArgumentException();
        this.attractions.add(attraction);
    }
}
