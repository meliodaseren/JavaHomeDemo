/* 產生一個class，名為Animal.java */

public class Animal{
	
	/* 此類別有兩個成員變數分別為age(年紀 - 幾歲 - 型別int)	*
	 * weight(體重 – 公斤重 – 型別float)				*/
	private int age; 
	private float weight;
	
	/* 預設建構子 */
	public Animal() {
		super();	// 父類別 Object
	}
	
	/* 設定建構子 */
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}
	
	/* 有一成員方法名為speak()，用以列印上述兩個值 */
	public void speak() {
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
	}
	
	/* 可以使用右鍵Source呼叫Getters和Setters */	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	/* 在main()裡透過建構子產生一個Animal，年紀和體重分別為2歲、5.0公斤，	*
	 * 並列印此Animal的成員變數值									*/
	public static void main (String args[]) {
		
		Animal animal1 = new Animal(2 , 5.0f);
		animal1.speak();
		
		System.out.println("====三年過去……====");
		
		animal1.setAge(5);
		animal1.setWeight(25.0f);
		
		animal1.speak();
		
	}
	
} 
