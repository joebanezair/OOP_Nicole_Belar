/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

import java.util.*;
public class Quiz{
    
  public static String name, mode, hungry;
  public static void main(String[] args) {
      
    thr_sm tree = new thr_sm();
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter your name: ");
    name = s.nextLine();
    System.out.println("Press 1, 2, 3 to select your game mode.\n1. Story\n2. Survival \n3. Strategy");
    mode = s.nextLine();
    //rule-switch case 
    switch (mode){
        case "1" -> tree.game1();
        case "2" -> tree.game2();
        case "3" -> tree.game3();
    }
    //rule-switch case 
  }
}

//-- 3 interfaces --//
interface game1{ public void game1(); }
interface game2{ public void game2(); }
interface game3{ public void game3(); }
//-- 3 interfaces --//

//-- classes implementing 3 interfaces --//
class thr_sm implements game1, game2, game3{
    // game1
    @Override
    public void game1(){
        Scanner s = new Scanner(System.in);
        System.out.println("'"+Quiz.name+"' you're now in Story Mode."
             + "\nYour task is to determine the criminal in the Story."
             + "\nNote: You Might Die"
             + "\nIf you saw a criminal holding a knife against you and you have a gun,"
             + "\nwill you shoot the guy?"
             + "\nPress '1' for YES and '2' for NO");
        Quiz.hungry = s.nextLine();//getting the string above
        switch(Quiz.hungry){
          case "1" -> 
              System.out.println("Not good '"+Quiz.name+"', you've shoted the hostage,"
                        +"\nyou're going to die in 20 seconds \n");
          case "2" -> System.out.println("Well done '"+Quiz.name+"', you're not going to die the sniper already killed the criminal\n");
        }
    }
    // game1
    
    // game2
    @Override
    public void game2(){
       Scanner s = new Scanner(System.in);
       System.out.println("'"+Quiz.name+"' you're now in Hunger Games."
             + "\nYour task is to answer this one question."
             + "\nNote: You Might Die\nQuestion: Are you hungry?"
             + "\nPress '1' for YES and '2' for NO");
       Quiz.hungry = s.nextLine();//getting the string above
       switch(Quiz.hungry){
          case "1" -> System.out.println("Not good '"+Quiz.name+"', you're hungry means you're going to die in 20 seconds \n");
          case "2" -> System.out.println("Well done '"+Quiz.name+"', you're not hungry means you're alive \n");
       }
    }
    // game2

    // game3
    @Override
    public void game3(){
       Scanner s = new Scanner(System.in);
       System.out.println("'"+Quiz.name+"' you're now in Plant vs Zombies."
             + "\nYour task is to answer this one question."
             + "\nNote: You Might Die\nQuestion: A Zombie is approaching, the apple is given, will you eat the plant?"
             + "\nPress '1' for YES and '2' for NO");
       Quiz.hungry = s.nextLine();//getting the string above
       switch(Quiz.hungry){
          case "1" -> System.out.println("Not good '"+Quiz.name+"', you're hungry means you're going to die in 20 seconds \n");
          case "2" -> System.out.println("Well done '"+Quiz.name+"', you're not hungry means you're alive \n");
       }
    }
    // game3
}
 
