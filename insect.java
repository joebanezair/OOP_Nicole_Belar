class insect{

	public static void main(String[] args) {
		Dragonfly d = new Dragonfly();

		System.out.println("\n\nThe Dragonfly has " + d.getNumberOfWings() + " Wings, and "+ d.getNumberOfLegs() + " Legs");
	}
}
public interface HasWings{
   public int getNumberOfWings();
}

abstract class Insect implements HasWings{
   public abstract int getNumberOfLegs();
   public abstract int getNumberOfWings();
}

class Dragonfly extends Insect{
  public int getNumberOfLegs(){
     return 6; 
  }
  public int getNumberOfWings(){
  	 return 8;
  }
}
