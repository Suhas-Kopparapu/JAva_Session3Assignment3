package Assignments;

import java.util.Scanner;



public class Randomnum {

public void validation(int arg1){
	int m = (int) Math.random();
	
	
	if(((m>=0)&&(m<=(arg1-1)))){
		System.out.println("The number is required random number in the range");
	}
	
}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    Randomnum r1 = new Randomnum();
  Scanner sc1 = new Scanner(System.in);  
  System.out.println("Enter the number");
    int n = sc1.nextInt();
    r1.validation(n);
	}
	

}
