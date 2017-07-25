public class AnimalPoly extends Animal {
	
	public static void main(String[] args) {
		
		Animal[] animals= new Animal[3];
		
	    animals[0] = new Elephant(3, 800.0f, "Joe");
	    animals[1] = new Animal(2, 25.0f);
	    animals[2] = new Elephant(5, 1200.0f, "How");
	    
	    for (int i = 0; i < animals.length; i++) {
	    	animals[i].speak();
	    	System.out.println("-----------------");
	    }
	}
	
}
