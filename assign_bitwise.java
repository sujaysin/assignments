import java.util.*;
public class Asssign_bitwise;
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,result;
		System.out.println("Enter two no:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		result=n1|n2;

		System.out.println("bitwise OR:" + result);

	    result=n1&n2;
		System.out.println("Bitwise And:"+ result);

		result=n1^n2;
		System.out.println("Bitwise Xor:"+ result);
		}
		}
