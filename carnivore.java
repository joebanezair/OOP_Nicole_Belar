class carnivore implements Carnivore{
         
      public int chew(){
         return 13;
      }

      public void eatGrass(){
         carnivore c = new carnivore();
         System.out.println("\n\nThe "+ c.pieces +" cow eats "+ c.chew() +" pieces of grass");
      }
	
      public static void main(String[] args) {
	    carnivore c = new carnivore();
       c.eatGrass();
	   }
}

public interface Carnivore{
        void eatGrass();
        public int pieces = 10;
        public int chew();
}
