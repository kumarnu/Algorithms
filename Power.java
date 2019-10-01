
public class Power {
	
	public int calculatePower(int a,int n) {
	    int res = 1;
//	    a = a % p;
	    while (n > 0){
	        if ((n & 1) == 1) {
	            res = (res * a) ;
	        }
	        n = n >> 1;
	        a = (a * a) ;
	    }
	    return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power obj = new Power();
		int result = obj.calculatePower(2, 5);
		System.out.println(result);
	}

}
