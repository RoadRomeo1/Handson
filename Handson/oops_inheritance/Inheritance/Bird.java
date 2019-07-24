
public class Bird extends Animal{
   public void fly() {
	System.out.println("Flying Mode...");
   }
   
   public static void main(String[] args) {
	Animal a=new Animal();
	a.eat();
	a.sleeping();
	Bird b=new Bird();
	b.eat();
	b.sleeping();
	b.fly();
}
}
