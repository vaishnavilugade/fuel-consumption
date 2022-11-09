import java.util.*;
class Truck{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double l,d,k,m,g,f;
		
		System.out.println("\nEnter number of liters to fill the tank:\n");
		l=sc.nextInt();
		System.out.println("\nEnter the distnace:\n");
		d=sc.nextInt();
		System.out.println("\nliters:"+l);
		System.out.println("\ndistnace:"+d);
		k=(l/d)*100;
		m=d*0.6214;
		System.out.println("\n"+d+" KM = "+m+" Miles");
		g=l*0.2642;
		System.out.println("\n"+l+" L = "+g+" gallons");
		f=m/g;
		System.out.println("\nfuel consumption for Miles/gallons:\n"+f);
		System.out.println("\nfuel consumption of Liters/100:\n"+k);
	}
}


		
		