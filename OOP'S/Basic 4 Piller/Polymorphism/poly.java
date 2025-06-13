class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
    
    void eat(String food) {
        System.out.println("Animal eats " + food);
    }

    void eat(String food, int times) {  // Overloaded
        System.out.println("Animal eats " + food + " " + times + " times");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}

public class poly {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.speak();  // Outputs: Dog barks
        myCat.speak();  // Outputs: Cat meows

        myDog.eat("bone");  // Outputs: Animal eats bone
        myCat.eat("fish", 3);  // Outputs: Animal eats fish 3 times
    }
}