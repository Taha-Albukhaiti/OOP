package game;

public class Magazine extends GameObject implements Buyable, Comparable<Magazine>{
    private double price;

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + super.name + '\'' +
                ", price ='" + price + '\'' +
                '}';
    }

    protected Magazine(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public boolean useOn(GameObject object) {
        return false;
    }

    @Override
    public int compareTo(Magazine o) {
        return Double.compare(this.price(), o.price());
    }

}
