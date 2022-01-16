import java.util.*;
public class Restaurant{
    
    //System.out.println();
    
    public static void main(String[] args) {
      conditions con = new conditions();
      con._conditions();
    }
}
class conditions{
    public String name, resto, bot, intro, order;
    public void welcum(){
      name = name;
    }

    public void _conditions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        
        bot = "Mr. Kuya : ";
        intro = "''Welcome "+this.name+" to Mr. Kuya's eatery kumain kanaba? :";

        System.out.println(bot + intro + this.name +" ''");
        System.out.println("If yes press 'Y'\nIf no press 'N'");
        String YEN = sc.nextLine();
        if(YEN.equals("N") || YEN.equals("n")){
          System.out.println(bot+"Kung GANON!\nCould you please enter your order "+this.name+" para ma customize na namin\nyung order mo.");
          System.out.println(bot+"Mr. Kuya's eatery offers pure customization and quality service\nplease wag po kayong mahiya"+this.name+"\nbecause we Mr Kuya's eatery has everything you need!");
          order = sc.nextLine();
        }else if(YEN.equals("Y") || YEN.equals("y")){
          System.out.println(bot+"Kung GANON!\nCould you please enter your order according to your needs "+this.name+" para ma customize na namin\nyung order mo.");
          System.out.println(bot+"Mr. Kuya's eatery offers pure customization and quality service\nplease wag po kayong mahiya"+this.name+"\nbecause we Mr Kuya's eatery has everything you need!");
          order = sc.nextLine();
        }

        if(order == "" || order == null){
           System.out.println(bot + "Thank you for visiting Mr Kuya's eatery "+this.name+"\nPlease come again!"); 
        }else if(order != "" || order != null){
           System.out.println(bot+"Order comming right up"); 
           System.out.println(bot+"Receipts will be recieved later after our service!"); 
        }

    }

}
