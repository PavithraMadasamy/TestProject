import java.util.Scanner;

public class PrimePalin {
	public static void main(String[] args) {
		int c=0,result=0,remainder;
		System.out.println("enter the input");
		Scanner scan = new Scanner(System.in);
	int input=scan.nextInt();
	int original=input;
	for(int i=1; i<=input; i++) {
	if(input%i==0) {
		c++;
	}
}
if(c==2)
{
	System.out.println("PRime");
}
else
{
	System.out.println("not a prime");
}
		while(input!=0)
		{
			remainder=input%10;
			result=result*10+remainder;
			input=input/10;
		}
		if(original==result)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a Palindrome");
		}
		scan.close();
	}

}

