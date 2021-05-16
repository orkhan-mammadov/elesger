package zoo;

public class Visitor {
    private Integer money;
    private final String name;
    private Zoo zoo;


    public Visitor(Integer money, String name) {
        if(money<0)
            throw new IllegalArgumentException();
        this.money = money;
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public boolean pay(int price){
        if(price<0)
            throw new IllegalArgumentException();
        else if (price > money)
            return false;

        money-=price;
        return true;
    }

    public boolean enterZoo(Zoo zoo){
        if(zoo == null)
            throw new IllegalArgumentException();
        else if(this.zoo!=null)
            throw new IllegalStateException();
        else if(zoo.getEntranceFee()>this.money)
            return false;

        this.zoo = zoo;
        this.money-=zoo.getEntranceFee();
        return true;
    }

    public boolean exitZoo(){
        if(this.zoo == null)
            throw new IllegalStateException();
        this.zoo = null;
        return true;
    }
}
