package src.oops;

public class OOPS {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();

        SoundMaker sounder = new Dog();
        sounder.produceSound();

        Student student = new Student();
        student.setName("Alice");
        student.setAge(20);
        System.out.println("Student: " + student.getName() + ", " + student.getAge());

        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}