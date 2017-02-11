package zajecia.dziewiate;

/**
 * Created by RENT on 2017-02-11.
 */
public class Zajecia9 {
    public static void main(String[] args) {

//        user.firstName = "Jan";
//        user.lastName = "Nowak";
//        user.birthDate = "12.02.2009";
//        User user1 = new User("Jan", "Nowak", "12.02.2008");
//        user1.firstName = "Jan";
//        user1.lastName = "Nowak";
//        user1.birthDate = "12.02.2009";
//        user.print();
//
//        User[] users = new User[2];
//        users[0] = user;
//        users[1] = user1;
//        printUsers(users);


        User user = new User("Jan", "Nowak", "12.02.2009");
        Address address = new Address("Poznań", "Poznanska", "30", "90-210", "PL");
        user.address = address;
        user.print();
//        address.print();

    }
//
//    public static void printUsers(User[] users) {
//        for (int i = 0; i < users.length; i++) {
//            users[i].print();
//        }
//    }
}
