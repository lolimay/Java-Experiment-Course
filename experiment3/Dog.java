public class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("Wang...Wang...");
    }
    @Override
    String getAnimalName() {
        return "Dog";
    }
}