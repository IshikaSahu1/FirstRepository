package Exercise;

public class Prime {

	int n = 5;
		 static  void prime (int n ) {
			 int i,m=0, flag=0;
			 m= n/2;
			 if (n==0||n==1) {
				 System.out.println(n + "is not prime number");
			 }else {
				 for (i=n; i<=m;i++) {
					 if (n%i==0) {
						 System.out.println(n + "is not prime number");
						 flag = 1;
						 break;
						 
					 }
				 }
				 if(flag==0) {System.out.println(n + "is prime number");}
			 }
		 }
		  public static void main (String [] args) {
			 
	}
}

