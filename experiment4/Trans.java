class Parent {
    private int value = 1;
    private void method() {
        System.out.println("I am a private method.");
    }
}

class Child extends Parent {

}

public class Trans {
    public static void main(String[] args) {
        Parent parent = new Child();
    }
}