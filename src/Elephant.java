/* Elephant繼承Animal */

public class Elephant extends Animal {
	
	private String name;
	
	/* 預設建構子 */
	public Elephant() {
		super();	// 父類別 Animal
	}
	
	/* 設定建構子 */
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}
	
	/* 改寫 */
	@ Override
	public void speak() {
		super.speak();
		System.out.println("Name: " + name);
	}
	
	/* 在main()裡透過建構子產生兩個Animal
	 * 其一為Animal，其年紀和體重分別為3歲、8.0公斤
	 * 另一為Elephant，其年紀、體重和種類名稱分別為8歲、1200.0公斤、大象	*/
	public static void main(String[] args) {
		Animal a1 = new Animal(3, 8.0f);
		Elephant e1 = new Elephant(8, 1200.0f, "Joe");
		
		a1.speak();
		System.out.println("---------------");
		e1.speak();
	}
	
}
