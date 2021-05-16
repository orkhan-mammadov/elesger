package zoo.attraction;

import zoo.Visitor;

public class Attraction {
    private String name;

    public Attraction(String name) {
        if(name.isEmpty() || name == null)
            throw new IllegalArgumentException();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean visit(Visitor visitor){
        return true;
    }
}
