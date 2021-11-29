package oop;
import java.util.*;

abstract class Animal{
    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();
}
class Bird extends Animal{
    public void Bird(){
        Bird b = new Bird();
        System.out.print("Bird loves to ");
        b.eat();
        b.sleep();
        b.makeSound();
    }
    @Override
    public void eat() {
        System.out.print("eat worm ");
    }
    @Override
    public void sleep(){
        System.out.print(", sleep's 12hrs ");
    }
    @Override
    public void makeSound(){
        System.out.print(", chirp chirp");
    }
}
class Cat extends Animal{
    public void Cat(){
        Cat b = new Cat();
        System.out.print("Bird loves to ");
        b.eat();
        b.sleep();
        b.makeSound();
    }
    @Override
    public void eat() {
        System.out.print("eat Bird ");
    }
    @Override
    public void sleep(){
        System.out.print(", sleep's 12hrs ");
    }
    @Override
    public void makeSound(){
        System.out.print(", meow meow");
    }
}
class Dog extends Animal{
   public void Dog(){
        Dog b = new Dog();
        System.out.print("Dog loves to ");
        b.eat();
        b.sleep();
        b.makeSound();
    }
    @Override
    public void eat() {
        System.out.print("eat pampers ");
    }
    @Override
    public void sleep(){
        System.out.print(", sleep's 12hrs ");
    }
    @Override
    public void makeSound(){
        System.out.print(", wuf wuf");
    }
}

public class RunAnimal {
    
    public static void main(String[] args) {
         
        Scanner s = new Scanner(System.in);
        System.out.println("Choose an animal. Press B for Bird , C  for  Cat, or D for Dog : ");
        String input = s.nextLine();
        switch (input) {
            case "B":
            case "b":
                Bird bird = new Bird();
                bird.Bird();
                break;
            case "C":
            case "c":
                Cat cat = new Cat();
                cat.Cat();
                break;
            case "D":
            case "d":
                Dog dog = new Dog();
                dog.Dog();
                break;
            default:
                break;
        }
        
    }
}
