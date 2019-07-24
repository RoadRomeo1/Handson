
public class Fruit {
   private String name;
   private String taste;
   private String size;
   
   public void eat() {
	   System.out.println("Eating "+name+" and it's "+taste+" which is "+size+" sized.");
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getTaste() {
	return taste;
}

public void setTaste(String taste) {
	this.taste = taste;
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}
   
   
   
}
