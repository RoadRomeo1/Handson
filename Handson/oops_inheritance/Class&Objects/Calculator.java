
public class Calculator {

	public static int getPower(int n1,int n2) {
		int res=1;
		
		for(int i=0;i<n2;i++) {
			res=res*n1;
			}
		
		return res;
	}
	
    public static double getPowerDouble(double n1,double n2) {
    	double power=Math.pow(n1, n2);
    	return power;
    	
    }
	
	public static void main(String[] args) {
	    System.out.println(Calculator.getPower(3,3));
	    System.out.println(Calculator.getPowerDouble(12.2, 2));
    } 
  }
