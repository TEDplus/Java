public class Product {
		
		private String notebook, bolpen, books, pencil, file, diskette, paper;//Field, 속성(Attribute, Property, State)
		private int quantity;	
		private int sales_price;
		private int purchase_price;
		private int transportation;
		private int tot;
		private double avg;
		private char grade;
		
		public void print() {
			System.out.printf("%-10s%5d%5d%5d%5d%7.1f%5c%n",
					quantity, sales_price, purchase_price, transportation, tot, avg, grade);
		}