public class Animals {

    public void sound(){
        System.out.println("Animal makes a sound");
    }

    public class Dog extends Animals {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
    
}

public static void main(String[] args) {
    
    Animals myAnimal = new Animals();
    myAnimal.sound(); // Output: Animal makes a sound

    Animals.Dog dog = myAnimal.new Dog();
    dog.sound(); // Output: Dog barks
}
    
}


