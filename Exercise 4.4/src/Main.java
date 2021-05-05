
public class Main {

	public static void main(String[] args) {
		
		Mango m = new Mango("Mango",4.99, 150); 
		System.out.println(m);
		System.out.println(); 

		GreenMango gm = new GreenMango("Sour Mango", 2.99, 60, "Green", "Oblong with Prominent Break"); 
		System.out.println(gm);
		System.out.println();
		
		YellowMango ym = new YellowMango("Honey Mango", 1.99, 200, "Sweet", "Harumanis", 0.05); 
		System.out.println(ym);
		System.out.println();
		
		Papaya p = new Papaya("Papaya", "Reduce the risk of Heart Disease", 2.5, 13.5);
		System.out.println(p);
		
		
	}

}