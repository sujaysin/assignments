import java.util.*;
public class Assign_ternary;
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.in);
		int x,y,z,res;

		System.out.println("Enter two no:");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();

		System.out.println(x>y&&x>z);
		System.out.println(x<y||y>z);

		res = (x > y) ? x : y;
		System.out.println("max value is:" + res);



	}
}