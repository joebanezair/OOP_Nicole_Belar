import java.util.*;
class adjacent{
	public static void main(String[] args) {
		ArrayList<ArrayList> adjlist = new ArrayList<>();
		char[] vertices = {'A','B','C','D','E','F','G'};
		int num = 7;

		for(int i = 0; i < num; i++){
			adjlist.add(new ArrayList<>());
		} 
		adjlist.get(0).add('B');
		adjlist.get(0).add('C');

		adjlist.get(1).add('A');

		adjlist.get(2).add('D');
		adjlist.get(2).add('E');

		adjlist.get(3).add('C');
		adjlist.get(3).add('E');

		adjlist.get(4).add('F');
		adjlist.get(4).add('G');

		adjlist.get(5).add('E');
		adjlist.get(5).add('D');
    
		adjlist.get(6).add('D');

		int v = 0;
		System.out.println("\n\nOutput :");
		for(int i = 0; i < num; i++, v++){
			System.out.println(vertices[v] + " : " + adjlist.get(i));
		}
		System.out.println("\n\n\n\n");
		
	}
}
