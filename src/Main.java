import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        Dog charlie = new Dog("Charlie","Retriever",7,"male","Pale Yellow");
        Dog evie = new Dog("Evie","Labrador", 5, "female","Black");
        System.out.println(charlie.noise());
        System.out.println(charlie);
        charlie.setColour("Golden Yellow");
        System.out.println(charlie);
        System.out.println(evie);
        System.out.println(charlie.sit());
        System.out.println(evie.sit());

        dogs.add(charlie);
        dogs.add(evie);

        for(Dog d : dogs) System.out.println(d);

    }
}
