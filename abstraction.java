abstract class Animal {
    public abstract void sound();

    public void sleep(){
        System.out.println("zzz");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
    public void eat(){
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
    public void eat() {
        System.out.println("Cat is eating");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        dog.eat();
        dog.sleep();

        cat.sound();
        cat.eat();
        cat.sleep();
    }
}
