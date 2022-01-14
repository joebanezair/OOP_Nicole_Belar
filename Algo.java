import java.util.*;
public class Algo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String name, rambo = "Rambo";
    AlgoExtension algo = new AlgoExtension();
    System.out.println("\n\n Hi I am Mr. "+rambo+" and you are?!\n"
                         +" Enter your name : ");
    name = sc.nextLine();
		String _string = rambo+" : "+ name + " welcome to STI bakery how can I help you? ";
    System.out.println(_string);
    
    String help, num;
    help = sc.nextLine();
 
    if(help.equals(" ") || help == null){
        System.out.println(rambo + " : Are you sure? " + name);
        System.out.println(algo.good);
        System.out.println(rambo + " : Please enter the number of your choice ! ");
        num = sc.nextLine();

        if(num == "1"){num = "Cakeme";
        System.out.println(rambo+" : Thank you Mr. "+name+" for choosing our "+num+" which is 'THE BEST MEAL OF THE DAY!'");
        System.out.println(rambo+" : The receipts will be given later!");}
        if(num == "2"){num = "ChingScream";
        System.out.println(rambo+" : Thank you Mr. "+name+" for choosing our "+num+" which is 'THE BEST MEAL OF THE DAY!'");
        System.out.println(rambo+" : The receipts will be given later!");}
        if(num == "3"){num = "Nigfloat";
        System.out.println(rambo+" : Thank you Mr. "+name+" for choosing our "+num+" which is 'THE BEST MEAL OF THE DAY!'");
        System.out.println(rambo+" : The receipts will be given later!");}
        if(num == "4"){num = "Katipunero's Choice"; 
        System.out.println(rambo+" : Thank you Mr. "+name+" for choosing our "+num+" which is 'THE BEST MEAL OF THE DAY!'");
        System.out.println(rambo+" : The receipts will be given later!");}
        else{System.out.println(rambo+" : Thank you for viewing STI bakery come again !");}
       
    }else if(help != null || help != " "){
        System.out.println(rambo +": Alright just give me the details so that we can accomodate you to figure out your order?");
        System.out.println(rambo +": We'd loved to give you your special order that is customized within your demands Mr "+name+" !");
        System.out.println(algo.okay);
        System.out.println(rambo + " : Please enter the number of your choice ! ");
        
        num = sc.nextLine(); 
    
        if(num.equals("1")){num = "Cakeme";
        System.out.println(rambo+" : Thank you Mr. "+name+" for choosing our "+num+" which is 'THE BEST MEAL OF THE DAY!'");
        System.out.println(rambo+" : The receipts will be given later!");}
        if(num.equals("2")){num = "ChingScream";
        System.out.println(rambo+" : Thank you Mr. "+name+" for choosing our "+num+" which is 'THE BEST MEAL OF THE DAY!'");
        System.out.println(rambo+" : The receipts will be given later!");}
        if(num.equals("3")){num = "Nigfloat";
        System.out.println(rambo+" : Thank you Mr. "+name+" for choosing our "+num+" which is 'THE BEST MEAL OF THE DAY!'");
        System.out.println(rambo+" : The receipts will be given later!");}
        if(num.equals("")){num = "Katipunero's Choice"; 
        System.out.println(rambo+" : Thank you Mr. "+name+" for choosing our "+num+" which is 'THE BEST MEAL OF THE DAY!'");
        System.out.println(rambo+" : The receipts will be given later!");}
        else{System.out.println(rambo+" : Thank you for viewing STI bakery come again !");}

    }
	}
}

public class AlgoExtension{

	public String okay = """ 

        We'll provide you the choices that are rated within your demands

        these are the 5 star food ratings that we will provide you
        since you're our special customer.
        1 - Cakeme
        2 - ChingScream
        3 - Nigfloat 
        4 - Katipunero's Choice 
        """;

       public String good = """ 

        It's nice to hear your story!
        But right now STI Bakery will provide you our special choices that are rated within your demands
        Thank you for comming in!!

        these are the 5 star food ratings that we will provide you
        since you're our special customer.

        1 - Cakeme
        2 - ChingScream
        3 - Nigfloat 
        4 - Katipunero's Choice 

        """;
}
