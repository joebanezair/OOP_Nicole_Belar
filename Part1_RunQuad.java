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
              
              String description = """
                 A square : 
                 - has 4 equal sides
                 - has 4 right angles
                 """;
              System.out.print(description);
              
              s.showDescription();
          }else if(input.equals("R")||input.equals("r")){
              Rectangle r = new Rectangle();
              
              String description = """
                 A Rectangle : 
                 - 2 opposite sides are equal.
                 - has 4 right angles
                 """;
              System.out.print(description);
              
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
  public void showDescription(){
      String description = """
                 - has 4 sides
                 - is quadrilaterall
                 """;
      System.out.print(description);
  }
}
class Rectangle extends Quadrilateral{
  public void showDescription(){
      super.showDescription();
  }
}
class Square extends Rectangle{
  @Override
  public void showDescription(){
      super.showDescription();
  }
}
//current goal x10
