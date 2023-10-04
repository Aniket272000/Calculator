package basic;

import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//make a calculator using switch case
		
		Scanner in =new Scanner(System.in);
		int a,b,choice;
		String wish;
		do
		{
			System.out.println("Enter the number");
			a=in.nextInt();
			b=in.nextInt();
			System.out.println("your choices \n 1.addition \n 2.substraction \n 3.multiplication \n 4.division");
			System.out.println("Enter your choice");
			choice=in.nextInt();

			switch(choice)
			{
			case 1:
			{
				System.out.println("Addition of two number is ="+(a+b));
				break;
			}
			case 2:
			{
				System.out.println("Substraction of two number is ="+(a-b));
				break;
			}
			case 3:
			{
				System.out.println("Multiplication of two number is ="+(a*b));
				break;
			}
			case 4:
			{
				System.out.println("Division of two number is ="+(a/b));
				break;
			}
			}
			System.out.println("Do you want to perform more operations Yes/No");
			wish=in.next();
			
		}while(wish.toLowerCase().equals("yes"));
		
		
		
		
	}

  

}
