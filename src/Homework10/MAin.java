package Homework10;

public class MAin {
        public static void main(String[] args) {

            User user1 = new User("vlad", "vlad@mail.ru", 35, true);
            User user2 = new User("vlad", "vlad@mail.ru", 32, true);
            User user3 = new User("vlad", "vlad@mail.ru", 32, true);
            User user4 = new User("kate", "katya@mail.com", 21, false);
            System.out.println("Equals");
            System.out.println("user1.equals(user2): " + user1.equals(user2));
            System.out.println("user2.equals(user3): " + user2.equals(user3));
            System.out.println("user1.equals(user3): " + user1.equals(user3));
            System.out.println("user1.equals(user4): " + user1.equals(user4));
            System.out.println("-".repeat(100));
            System.out.println("toString");
            System.out.println("user1: " + user1);
            System.out.println("user2: " + user2);
            System.out.println("user3: " + user3);
            System.out.println("user4: " + user4);
            System.out.println("-".repeat(100));
            System.out.println("hashCode");
            System.out.println("hashCode user1: " + user1.hashCode());
            System.out.println("hashCode user2: " + user2.hashCode());
            System.out.println("hashCode user3: " + user3.hashCode());
            System.out.println("hashCode user4: " + user4.hashCode());

            System.out.println("If the objects are equal, then the hash codes are equal: " +
                    (user2.equals(user3) && user2.hashCode() == user3.hashCode()));
        }
    }

