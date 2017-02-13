package zajecia.dziesiate;

import zajecia.dziewiate.Address;
import zajecia.dziewiate.User;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by RENT on 2017-02-13.
 */
public class Zajecia10 {
    public static void main(String[] args) {

        Product marchew = new Product("marchew", "warzywa", 8.00);
        Product seler = new Product("seler", "warzywa", 12.00);
        Product pietruszka = new Product("pietruszka", "warzywa", 11.00);
        Product pomidor = new Product("pomidor", "warzywa", 1.00);
        Product cebula = new Product("cebula", "warzywa", 10.00);

        HashMap<Product, Integer> products = new HashMap<>();
        products.put(marchew, 500);
        products.put(seler, 1500);
        products.put(pomidor, 100);

        Warehouse warehouse = new Warehouse(products);
//        warehouse.get(marchew, 700);

//        System.out.println();



//        Address address = new Address("Miasto", "Polna", "10", "33-333", "PL");
//        Client client = new Client("Greg", "G", "555-555-555", address);
//        System.out.println(client);
//

//        Order order = new Order(client, products);
//        System.out.println("Total price for this order is " + order.getPrice());


    }

    public static void mapDemo() {
        HashMap<String, User> map = new HashMap<>();
        map.put("123123132", new User("Szymon", "Nowak", "laskdajkdasd"));
        map.put("12312332", new User("Jan", "Nowak", "las234234dasd"));
        //User user = map.get("12312332");

        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });
    }

}
