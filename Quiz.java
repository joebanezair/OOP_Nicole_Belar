import java.util.*;
  public class Quiz{
      public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Exam exam = new Exam();
      Essay essay = new Essay();
      exam.Exam(); 

      System.out.println("Write your essay about how badass Joebanezair is : ");
      String ess = essay.essay = scan.nextLine();
      if(ess.equals("")||ess.equals(null)){
      	System.out.println("Status finished : "+exam.isFinished(false));  
      	System.out.println("You failed to pass the exam!");
      }else{
      	System.out.println("Status finished : "+exam.isFinished(true));
      	System.out.println("* Congratulations you finished the Exam! *");
      	System.out.println("Your answer : "+ ess);
      }
     

}/*line after class*/}

class Exam extends Quiz{
      String message, period, level;
      double price; 
      boolean status;
      
      public Exam(){
      message = "\nGood luck! \n- - output - -\n";}

	  public Exam(String period, String level){
	  this.period = period;
	  this.level = level;}

	  public void Exam(){
	  Midterm midterm = new Midterm();
	  Scanner scan = new Scanner(System.in);
	  System.out.println("\n\nSTI Exam");
	  System.out.print("Enter Period :"); period = scan.nextLine();
	  System.out.print("Enter level : "); level = scan.nextLine();
	  System.out.print("Exam entrance fee: "); price = scan.nextDouble();
      
      System.out.println("\n- - output - -\nPrice of the Exam : "+price);
      System.out.println("We're in the '"+period+"' period.");
      System.out.println("The level of exam is : "+level);
      System.out.print(period);//Getting Midterm
      midterm.Midterm();
      System.out.println(message);

	  /*line after method*/}

	  public double getPrice(double price){
	  this.price = price;
      return price;}

	  public boolean isFinished(boolean status){
	  this.status = status;
      return status;} 
      /*line after class*/ }

class Midterm extends Exam{
      void Midterm(){
      System.out.print(" ");
      System.out.print("exam has started.");}}

class Essay extends Quiz{
  	  String essay;
	  public void Essay(String essay){
      this.essay = essay;
      }  /*line after class*/}
