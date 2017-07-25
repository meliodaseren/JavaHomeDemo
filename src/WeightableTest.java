public class WeightableTest {
	public static void main(String[] args) {
		
		/* 請運用多型設計讓Powder, Plane, Dog這三個類別藉由
		 * getWeightMethod()方法可以顯示出各自適合的量體重的工具
		 * (如: Powder使用天秤, Plane使用地磅, Dog使用體重計)		*/
		Weightable[] w = new Weightable[3];
		w[0] = new Dog();
		w[1] = new Plane();
		w[2] = new Powder();
		for (int i = 0; i < w.length; i++) {
		      w[i].getWeightMethod();
		}
		
		System.out.println("------------------------");
		
		Dog w1 = new Dog();
		w1.getWeightMethod();
		
		Plane w2 = new Plane();
		w2.getWeightMethod();
		
		Powder w3 = new Powder();
		w3.getWeightMethod();
	}
}
