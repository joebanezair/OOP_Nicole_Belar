/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP;
import java.util.*;
public class RunQuad{
  public static void main(String[] args) {
      try {
          Scanner sc = new Scanner(System.in);
          System.out.println("Press 'R' for Rectangle \nor 'S' for Square. ");
          String input = sc.nextLine();
          if(input.equals("S")||input.equals("s")){
              Square s = new Square();
              s.showDescription();
          }else if(input.equals("R")||input.equals("r")){
              Rectangle r = new Rectangle();
              r.showDescription();
          }else if(input.equals("")||input.equals(null)){
            System.err.println("Please enter a value between R & S");
          }
      } catch (Error e) {
          System.err.println(e);
      }
  }
}

class Quadrilateral{
  public void showDescriptionR(){
      String R = """
                 A rectangle:
                 - has 4 sides
                 - has 4 right angles
                 - all angles 90 degrees 
                 - two Opposite sides are equal
                 - is Quadrilaterals
                 """;
      System.out.println(R);
  }
  public void showDescriptionS(){
      String R = """
                 A square : 
                 - has 4 equal sides
                 - has 4 right angles
                 - all angles 90 degrees
                 - all sides are equal
                 -  is Quadrilateral
                 """;
      System.out.println(R);
  }
}
class Rectangle extends Quadrilateral{
  public void showDescription(){
     super.showDescriptionR();
  }
}
class Square extends Rectangle{
  @Override
  public void showDescription(){
      super.showDescriptionS();
  }
}
//current goal x10
