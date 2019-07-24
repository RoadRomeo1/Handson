import java.util.Scanner;

public class TicTacToe {
	
	static int count=0;
	static Scanner sc=new Scanner(System.in);
    static char arr[][]=new char[3][3];
	
	
	public static void main(String[] args) {
	
	
	while(!(count>0)) {
		TicTacToe.Player1();
		TicTacToe.Player2();
	}
  }
	
	
	public static void Player1() {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
		if() {
			
		}
		
		else{
			
		int row=0,column=0;
	    System.out.print("o,choose your location: ");
		row=sc.nextInt();
		column=sc.nextInt();
		arr[row][column]='O';
		
		}
	}
	
	public static void Player2() {
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
		if() {
			
		}
		else {
		int row=0,column=0;
		System.out.print("X,choose your location: ");
		row=sc.nextInt();
		column=sc.nextInt();
		arr[row][column]='X';
		}
	}
	
}
