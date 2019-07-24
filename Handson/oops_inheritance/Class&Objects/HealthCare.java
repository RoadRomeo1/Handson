
public class HealthCare {
    
	private  static String name;
    private  static double height;
    private  static double weight;
    
    public HealthCare(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

    public double computeBmi() {
    	double bmi;
    	bmi=weight/((height/100)*(height/100));
    	return bmi;
    }
    
    public static void main(String[] args) {
	HealthCare hc=new HealthCare("Himanshu vyas", 124, 51.5);
	System.out.println(hc.computeBmi());
    }
}
