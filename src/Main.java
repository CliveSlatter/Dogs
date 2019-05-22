public class Main {
    public static void main(String[] args) {
        Dog charlie = new Dog("Charlie","Retriever",7,"male","Pale Yellow");
        Dog evie = new Dog("Evie","Labrador", 5, "female","Black");
        System.out.println(charlie.noise());
        System.out.println(charlie);
        charlie.setColour("Golden Yellow");
        System.out.println(charlie);
        System.out.println(evie);
        System.out.println(charlie.sit());
        System.out.println(evie.sit());
    }
}
