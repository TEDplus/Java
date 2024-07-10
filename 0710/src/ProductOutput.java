
public class ProductOutput {

	public void output(Product[] array) {
		System.out.println("                                <<상품별 판매 이익금 및 이익률표>>                                 ");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("상품명            수량         판매단가         매입단가         운송료        이익금         이익율"     );
		System.out.println("-------------------------------------------------------------------------------------------");
		for(Product p : array) {
			System.out.printf("%-20s%\t%,");
		}
	}

}
