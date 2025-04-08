package src.oops;

public class Dog extends Animal implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
    
    @Override
    public void produceSound() {
        makeSound();
    }
}