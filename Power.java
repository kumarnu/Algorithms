
public class Power {
	public int calculatePower(int a,int n, int p) {
	    int res = 1;
	    a = a % p;
	    while (n > 0){
	        if ((n & 1) == 1) {
	            res = (res * a) % p ;
	        }
	        n = n >> 1;
	        a = (a * a) % p;
	    }
	    return res;
	}
	public static void main(String[] args) {
		Power obj = new Power();
		int result = obj.calculatePower(2, 3, 3);
		System.out.println(result);
	}

}
