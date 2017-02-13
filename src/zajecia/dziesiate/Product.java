package zajecia.dziesiate;

/**
 * Created by RENT on 2017-02-13.
 */
public class Product {
    private String name;
    private String desc;
    private double price;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, String desc, double price) {
        this(name);
        this.desc = desc;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + desc + ", " + price + "]";
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
