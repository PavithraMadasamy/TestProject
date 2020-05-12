import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scan =new Scanner(System.in);
		int num = scan.nextInt();
		int counter=0;
		for(int i=1; i<=num;i++) {
			if(num%i==0)
				counter++;
		}
		if(num==1)
			System.out.println("It is neither a prime nor a composite number");
		else if(counter==2)
			{
				System.out.println("It is a prime");
			}
			else 
				System.out.println("It is a composite number");
	
		
		scan.close();
	}

}
