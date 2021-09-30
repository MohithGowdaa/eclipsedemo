package emp;
import java.util.Scanner;
public class employee {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.println("Enter your Eid");
		String a=sca.nextLine();
		
		System.out.println("Enter your name");
		String b=sca.nextLine();
		
		System.out.println("Enter your designation");
		String c=sca.nextLine();
		
		System.out.println("Enter your salary");
		float d=sca.nextFloat();
		
		System.out.println("Enter your grade");
		char e=sca.next().charAt(0);
		sca.nextLine();
		
		System.out.println("Enter your city");
		String f=sca.nextLine();
		
		System.out.println("Eid: "+a+" name: "+b+" designation: "+c+" salary: "+d+" grade:"+e+" city: "+f);
		
		

	}

}
