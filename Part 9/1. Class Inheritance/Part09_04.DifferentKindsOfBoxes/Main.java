/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 4 - Different Kinds Of Boxes


Implement classes that utilize class inheritance and abstract class concepts.
=======
*/

public class Main {

    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
        
        System.out.println("-----");
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
        
        System.out.println("-----");
        MisplacingBox mbox = new MisplacingBox();
        mbox.add(new Item("Saludo", 5));
        mbox.add(new Item("Pirkka", 5));

        System.out.println(mbox.isInBox(new Item("Saludo")));
        System.out.println(mbox.isInBox(new Item("Pirkka")));
    }
}
