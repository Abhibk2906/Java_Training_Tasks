package casestudy2;

import java.util.*;

public class EnjoyRide {

  private static void calculateFair(int nadult, 
		  int nchild, int rhour, int aprice, 
		  int cprice) {
		  double adultFair=nadult*aprice;
		  double childFair=nchild*cprice;
		  double totalFair=adultFair+childFair;
		  System.out.println("Total hours of ride: "+rhour+
				"\nAdult Ride Fair: "+adultFair+
				"\nChild Ride Fair: "+childFair+
				"\nTotal Ride Fair: "+totalFair);
		System.out.println("------------------------------------");
		
	}
	public static void main(String[] args) {
		int nadult,i=0,nchild,ride,rhour;
		Scanner sc=new Scanner(System.in);
		while(i==0) {
			System.out.println("------------------------------------");
			System.out.println("Enter How Many Adults?");
			nadult=sc.nextInt();
			System.out.println("------------------------------------");
			System.out.println("Enter How Many Children?");
			nchild=sc.nextInt();
			System.out.println("------------------------------------");
			System.out.println("Enter how many hours you want to ride");
			rhour=sc.nextInt();
			System.out.println("------------------------------------");
			System.out.println("Choose any One ride \n"
					+ "1.Alibaba \n"
					+ "2.Alphine Slide \n"
					+ "3.bumper Cars \n"
					+ "4.ballon Race");
			ride=sc.nextInt();
			System.out.println("------------------------------------");
			switch(ride) {
			case 1:{
				int aprice=50,cprice=40;
				calculateFair(nadult,nchild,rhour,aprice,cprice);
			}break;
			case 2:{
				int aprice=60,cprice=30;
				calculateFair(nadult,nchild,rhour,aprice,cprice);
			}break;
			case 3:{
				int aprice=45,cprice=25;
				calculateFair(nadult,nchild,rhour,aprice,cprice);
			}break;
			case 4:{
				int aprice=70,cprice=60;
				calculateFair(nadult,nchild,rhour,aprice,cprice);
			}break;
			default:System.out.println("Please Choose Correct Ride!!!");
			}
			System.out.println("Do You Want To Continue Fair Ride Calculation\n"
					+ "0)Yes \r\n"
					+ "1)No ");
			i=sc.nextInt();
			if(i==1)break;
			}
		System.out.println("Enjoy Your Ride!!!");
		sc.close();
		}

	
}
