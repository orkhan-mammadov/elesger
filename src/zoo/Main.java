package zoo;

import zoo.attraction.Attraction;


public class Main {

    public static void main(String[] args) {
         Zoo zoo = new Zoo(21,"Baki");
         Visitor visitor = new Visitor(20,"Alasgar");
         Attraction attraction = new Attraction("Ucan bosqab");
         Attraction attraction1 = new Attraction("qacan bosqab");
         Attraction attraction2 = new Attraction("sican bosqab");

         zoo.addAttraction(attraction);
         zoo.addAttraction(attraction1);
         zoo.addAttraction(attraction2);
         zoo.getNrOfAttractions();
         visitor.enterZoo(zoo);
    }
}
