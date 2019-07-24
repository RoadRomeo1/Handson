
public class Box {
	private static double height;
	private static double width;
	private static double depth;
	
public Box(double height, double width, double depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

public static double getVolume(){
	double volume=height*width*depth;
	return volume;
}


public static void main(String[] args) {
	Box b=new Box(12,24,56.4);
    System.out.println("Volume: "+b.getVolume());	
	
}
}
