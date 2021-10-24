import java.util.Scanner;
public class josephus_algo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println("winner is " + jos(n,k));
	}
	
	static int jos(int n, int k) {
		if(n==1) {
			return 1;
		}
		return (jos(n-1,k) + k-1)%n+1;
	}
}
