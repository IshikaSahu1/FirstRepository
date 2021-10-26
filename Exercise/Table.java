package Exercise;

public class Table {

	public static void main(String[] args) {
	int [][] table =new int [11][11];
	for(int i = 2; i <=10;i++) {
		for(int j = 1; j<=10;j++) {
			table[i][j] = i*j;
			System.out.println(table[i][j]);
		}
	}

	}

}
