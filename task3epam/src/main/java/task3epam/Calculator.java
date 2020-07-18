package task3epam;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter any two values");
	
	float num1 = input.nextFloat();
	float num2 = input.nextFloat();
	System.out.println("Enter any one of the operation to be performed\n1.Addition\n2.Subration\n3.Multiplication\n4.Division");
	Scanner opp = new Scanner(System.in);
	int operator = opp.nextInt();
	float result=0;
	if(operator<=4 && operator>=1 ) {
		if(operator==1) 
		{
			result=add(num1,num2);
		}
		else if(operator==2) 
		{
			result=sub(num1,num2);
		}
		else if(operator==3) 
		{
			result=mul(num1,num2);
		}
		else 
		{
			result=div(num1,num2);
		}
		
	System.out.println("The Result is "+result);
	}
	else
	{
		System.out.println("Invalid Option Entered Please try again ");
	}
	
	}

public static float div(float num1,float num2) {
	return num1/num2;
	
}

public static float mul(float num1,float num2) {
	return num1*num2;
	
}

public static float sub(float num1,float num2) {
	return num1-num2;
}

public static float add(float num1,float num2) {
	return num1+num2;
	
}	


}