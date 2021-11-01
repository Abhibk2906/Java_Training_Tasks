import java.util.Scanner;

public class SwitchOperationTask {

	//5.use switch make cases, apply any loop convenient so that it keeps on asking the user what case u want to implement
	//cases will be:
	//1) Add 2 no’s
	//2) Find average of 2 numbers
	//3) Check even/odd
	//4) Check positive or negative number
	//5) check prime no or not 
	//6) Quit- use exit(0)

		public static void main(String[] args) {
		int choice,i=0;
		Scanner sc=new Scanner(System.in);
		while(i==0) {
			System.out.println("------------------------------------");
		System.out.println("Please Enter your choise of selection \n "
				+ "1) Add 2 no’s\r\n"
				+ "2) Find average of 2 numbers\r\n"
				+ "3) Check even/odd\r\n"
				+ "4) Check positive or negative number\r\n"
				+ "5) check prime no or not \r\n"
				+ "6) Quit");
		choice=sc.nextInt();
		System.out.println("------------------------------------");
		switch(choice) {
		case 1:{
		    int num1,num2;
		    System.out.println("Please enter your two numbers");
		    num1=sc.nextInt();
		    num2=sc.nextInt();
		    System.out.println("The addition of "+num1+" & " +num2+" is "+(num1+num2));   
		}
		break;
		case 2:{
			   int num1,num2;
			    System.out.println("Please enter your two numbers");
			    num1=sc.nextInt();
			    num2=sc.nextInt();
			    float average=(num1+num2)/2;
			    System.out.println("The average of "+num1+" & " +num2+" is "+average);  
		}
		break;
		case 3:{
			int num1;
		    System.out.println("Please enter your number");
		    num1=sc.nextInt();
		    System.out.println("The number "+num1+" is "+(num1%2==0?"even":"odd"));  
		}
		break;
		case 4:{
			int num1;
		    System.out.println("Please enter your number");
		    num1=sc.nextInt();
		    System.out.println("The number "+num1+" is "+(num1>0?"Positive":"Negative"));  
		}
		break;
		case 5:{
		    int num ;
		    System.out.println("Please enter your number");
		    num=sc.nextInt();
		    boolean flag = false;
		    for (int j = 2; j <= num / 2; j++) {
		      if (num % j == 0) {
		        flag = true;
		        break;
		      }
		    }
		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");	
		}
		break;
		case 6:System.exit(0);break;
		default:System.out.println("Invalid");
		}
		System.out.println("------------------------------------");
		System.out.println("Do you want to continue \n"
				+ "0)Yes \r\n"
				+ "1)No ");
		i=sc.nextInt();
		if(i==1)break;
		}
		System.out.println("Thank you!!!!!");
		sc.close();
		}


}
