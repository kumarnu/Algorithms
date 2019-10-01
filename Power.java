
public class Power {
	
	public int calculatePower(int a,int n) {
	    int result = 1;
	    while (n > 0){
	        if ((n & 1) == 1) {  //& is bit-wise operator
	            result = (result * a) ;
	        }
	        n = n >> 1;  // right shift
	        a = (a * a) ;
	    }
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power obj = new Power();
		int result = obj.calculatePower(2, 5);
		System.out.println(result);
	}

}
