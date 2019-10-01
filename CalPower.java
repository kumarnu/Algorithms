
public class CalPower {
	public int calculatePower(int a,int n) {
	    int res = 1;
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
		CalPower obj = new CalPower();
		int result = obj.calculatePower(2, 3);
		System.out.println(result);
	}

}
