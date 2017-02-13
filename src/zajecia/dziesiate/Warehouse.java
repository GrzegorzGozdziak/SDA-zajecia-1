package zajecia.dziesiate;

import java.util.HashMap;

/**
 * Created by RENT on 2017-02-13.
 */
public class Warehouse {
    private HashMap<Product, Integer> warehouse;

    public Warehouse(HashMap<Product, Integer> warehouse) {
        this.warehouse = warehouse;
    }

    public boolean hasAmount(Product product, int amount) {
        boolean returnValue = false;
        if (warehouse.containsKey(product)) {
            Integer amountInWarehouse = warehouse.get(product);
            returnValue = amountInWarehouse >= amount;
        }
        return returnValue;
    }

    public void add(Product product, int amount) {
        if (warehouse.containsKey(product)) {
            Integer amountInWarehouse = warehouse.get(product);
            warehouse.put(product, amountInWarehouse + amount);
        } else {
            warehouse.put(product, amount);
        }
    }


    public HashMap<Product, Integer> get(Product product, int amount) {
        if(!hasAmount(product, amount)) {
            System.out.println("Brak Towaru!");
            return new HashMap<>();
        }
        Integer amountInWarehouse = warehouse.get(product);
        warehouse.put(product, amountInWarehouse - amount);
        HashMap<Product, Integer> products = new HashMap<>();
        products.put(product, amount);
        return products;
    }


}
