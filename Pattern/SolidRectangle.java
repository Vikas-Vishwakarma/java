import java.util.Scanner;

public class SolidRectangle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Column: ");
		int col = sc.nextInt();
		System.out.print("Enter number of Row: ");
		int row = sc.nextInt();
		sc.close();

		for(int i = 1; i <= row;i++) {
			for(int j = 1; j <= col;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
