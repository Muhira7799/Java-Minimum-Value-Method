
public class MinValue {

	
	    
	    public static int minValue(int n1, int n2) {
	        if (n1 > n2) {
	            return n2;
	        } else {
	            return n1;
	        }
	    }

	    public static void main(String[] args) {
	        // Calling static method directly or via object
	        int result = MinValue.minValue(10, 20);
	        System.out.println("Minimum value is: " + result);
	    }
	}