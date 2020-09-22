import java.util.*;
import java.lang.*;

class UC4{

	static final int nowork=0;
	static final int check=1;
	static final int part=2;
	static final int wageph=20;
	//static final int days=2;

	public static void main(String[] args){
	//variables
	// static final int check=1;
	// static final int wageph=20;
	//Scanner sc=new Scanner(System.in);
	// static final int part=2;
	int hours;
	// double ec= Math.floor(Math.random() * 10)%3;
	int totalwage=0;
	//for(int i=0; i<days; i++){
		double ec= Math.floor(Math.random() * 10)%3;
		switch((int) ec){
			case check:
				hours=8;
				break;
			case part:
				hours=4;
				break;
			case nowork:
				hours=0;
				break;
			default:
				hours=0;
		}
		int total=hours*wageph;
		// System.out.println("Wage today is: "+total);
		// totalwage+=total;
	//}
	// int total=hours*wageph;
	System.out.println("Wage earned in total would be: "+total);

	// if(ec==check){
	// 	int hours=8;
	// 	int total=wageph*hours;
	// 	System.out.println("Present & total is: "+total);
	// }else if(ec==part){
	// 	int input;
	// 	System.out.println("Enter no of hours worked: ");
	// 	input=sc.nextInt();
	// 	System.out.println("Employee worked part time for: "+input+" hours and total is: "+(input*wageph));
	// }
	// else{
	// 	System.out.println("Absent and total is 0.");
	// }/*
	// if(ec==check){
	// 	System.out.println("Present");
	// }else{
	// 	System.out.println("Absent");
	// }
	// System.out.println("HEllo World!");
	// */
	}
}
