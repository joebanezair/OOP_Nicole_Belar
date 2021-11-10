import java.util.*;
public class CollegeList{

	public static void main(String[] args) {
		  Person prsn = new Person();
		  Employee empl = new Employee();
		  Student stdt = new Student();
		  Faculty fclt = new Faculty();
		  Scanner sc = new Scanner(System.in);

		  String f = "Faculty", e = "Employee", 
        s = "Student", enter;
        /*name,contact, salary, department*/
		  System.out.println("Press E for Employee, F for Faculty, or S for student: "); 
		  enter = sc.nextLine();
		  if(enter.equals("E")){
		  System.out.println("Type "+e+"'s name, contact number, department, and salary.\nPress Enter after every input");
		  
		  System.out.print("Name : ");
		  String name = sc.nextLine(); 
		  prsn.setName(name);
        System.out.print("Contact : ");
		  String contact = sc.nextLine();
		  prsn.setContactNum(contact);
        System.out.print("Department : ");
		  String department = sc.nextLine();
		  empl.setDepartment(department);
        System.out.print("Salary : ");
		  double salary = sc.nextDouble();
		  empl.setSalary(salary);
		   
        System.out.println("-------------------------------------------");

		  System.out.println("Name :"+prsn.getName());
		  System.out.println("Contact :"+prsn.getName());
		  System.out.println("Salary :"+empl.getSalary());
		  System.out.println("Department :"+empl.getDepartment());
      System.out.println("Regular :"+fclt.isRegular(true));

		  }else if(enter.equals("F")) {
		  	System.out.println("Type "+f+"'s name, contact number, salary, and department.\nPress Enter after every input");

        System.out.print("Name : ");
		  String name = sc.nextLine(); 
		  prsn.setName(name);
        System.out.print("Contact : ");
		  String contact = sc.nextLine();
		  prsn.setContactNum(contact);
        System.out.print("Department : ");
		  String department = sc.nextLine();
		  empl.setDepartment(department);
        System.out.print("Salary : ");
		  double salary = sc.nextDouble();
		  empl.setSalary(salary);

		  System.out.println("-------------------------------------------");

		  System.out.println("Name :"+prsn.getName());
		  System.out.println("Contact :"+prsn.getName());
		  System.out.println("Salary :"+empl.getSalary());
		  System.out.println("Department :"+empl.getDepartment());
        System.out.println("Regular :"+fclt.isRegular(true));
         
		  }else if(enter.equals("S")){
		  System.out.println("Type "+s+"'s name, "+s+" number, "+s+" program, and "+s+" year level.\nPress Enter after every input");
        System.out.print("Name : ");
		  String name = sc.nextLine(); 
		  prsn.setName(name);

        System.out.print("Student number : ");
		  String contact = sc.nextLine(); 
		  prsn.setContactNum(contact);

        System.out.print("Enter Program : ");
		  String program = sc.nextLine(); 
		  stdt.setProgram(program);

		  System.out.print("Enter Year Level : "); 
		  int year = sc.nextInt(); 
		  stdt.setYearLevel(year);

		  System.out.println("-------------------------------------------");

		  System.out.println("Name :"+prsn.getName());
		  System.out.println("Student Number :"+prsn.getContactNum());
		  System.out.println("Program :"+stdt.getProgram());
		  System.out.println("Year Level :"+stdt.getYearLevel());
      System.out.println("Regular :"+fclt.isRegular(true));

		  }/*method*/}

		  /*class*/}

class Person{ // Person
   private String name;
   private String contactNum;
   public String getName(){ return name; }
   public void setName(String n){ this.name = n; }
   public void setContactNum(String c){ this.contactNum = c; }
   public String getContactNum(){ return contactNum; }}

class Employee{ // Employee 
   private double salary;
   private String department;
   public double getSalary(){ return salary; }
   public void setSalary(double s){ this.salary = s;}
   public String getDepartment(){ return department; }
   public void setDepartment(String d){ this.department = d; }}

class Student{ // Student
   private String program;
   private int yearLevel;
   public String getProgram(){ return program; }
   public void setProgram(String p){ this.program = p; }
   public void setYearLevel(int y){ this.yearLevel = y; }
   public int getYearLevel(){ return yearLevel; }}

class Faculty{ // Faculty
   private boolean status;
   public boolean isRegular(boolean b){this.status = b;
   return status;}}
