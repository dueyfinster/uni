package ch1;

public class ex1_1 {

	ex1_1 (String name){
		int topLength = name.length();
		int bottomLength = name.length();
		
		System.out.println("");
		System.out.println("");
		
		System.out.print("+");
		while(topLength!=0){
			System.out.print("-");
			topLength--;
		}
		System.out.print("+");
		
		System.out.println("");
		System.out.print("|");
		System.out.print(name);
		System.out.print("|");
		
		System.out.println("");
		System.out.print("+");
		while(bottomLength!=0){
			System.out.print("-");
			bottomLength--;
		}
		System.out.print("+");
		
	}
	
	
	public static void main(String[] args) {
		ex1_1 ex = new ex1_1("Neil");
		ex1_1 ex1 = new ex1_1("Rebecca");
		ex1_1 ex2 = new ex1_1("Gareth");
	}
}
