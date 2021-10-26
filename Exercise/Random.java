package Exercise;

public class Random {

	public static void main(String[] args) {
		Random r = new Random ();
		for (int i = 0; i <10; i++) {
			int randomNo = (int) (Math.random()*100);
			System.out.println(randomNo);
		}
		
		

	}

}
