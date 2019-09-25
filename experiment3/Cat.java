public class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("Miao...Miao...");
    }
    @Override
    String getAnimalName() {
        return "Cat";
    }
}