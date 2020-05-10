public class AdamNumber {

	public static void main(String[] args) {
		int sqrNum,revNum=0,revSqr,digit,safe,revSqrNum=0;
		int num=14;
		safe=num;
		while(num!=0)
		{	
		digit=num%10;
		revNum=revNum*10+digit;
		num=num/10;
	    }
		num=safe;
		//System.out.println("Reversed number is"+revNum);
		revSqr=revNum*revNum;
		sqrNum=num*num;
		while(sqrNum!=0)
		{
			digit=sqrNum%10;
			revSqrNum=revSqrNum*10+digit;
			sqrNum=sqrNum/10;	
		}
		if(revSqr==revSqrNum)
			System.out.println("Adams");
		else
			System.out.println("Not Adams");
	}
}
