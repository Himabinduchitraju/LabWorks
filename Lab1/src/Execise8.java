
public class Execise8 {

	static boolean isPowerOfTwo(int n){


		// TODO Auto-generated method stub

		if(n==0)
			return false;
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
				(int)(Math.floor(((Math.log(n) / Math.log(2)))));

	}
	public static void main(String[] args) {
		if(isPowerOfTwo(31))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
