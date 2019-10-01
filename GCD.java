
public class GCD {
	
	int GreatestCD(int x, int y) {
		if (y == 0) {
			return x;
		}
		
		return GreatestCD(y, x%y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD obj = new GCD();
		int result = obj.GreatestCD(130, 8);
		System.out.println(result);
	}

}
