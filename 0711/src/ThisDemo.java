
public class ThisDemo {

	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.setName("현대소나타");
		sonata.setPrice(30_000_000);	
		System.out.printf("이름 =  "+ sonata.getName(),sonata.getPrice());
		Car matiz = sonata.clone(); //주소복사
		System.out.println(matiz.getName());
	}

}
