import java.util.*;;
public class  Assign_opt
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner (System.in);
	 int n1,n2;
	 System.out.println("enter two no:");
	 n1=sc.nextInt();
	 n2=sc.nextInt();

	 n1-=n2;
	 System.out.println("the value is:"+ n1);

	 n1+=n2;
	 System.out.println("the value is:" + n1);

	 n1*=n2;
	 System.out.println("the value is:" + n1);

	 n1/=n2;
	 System.out.println("the value is:" + n1);

	 n1%=n2;
	 System.out.println("the value is:" + n1);


 }