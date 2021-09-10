package app.compare.fruit;

import java.util.Comparator;

public class Fruit {
	private int no;
	private String name;
	private int price;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	class FruitComparator implements Comparator<Fruit>{

		@Override
		public int compare(Fruit o1, Fruit o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
	}
	class FruitComparatorDesc implements Comparator<Fruit>{

		@Override
		public int compare(Fruit o1, Fruit o2) {
			// TODO Auto-generated method stub
			return o2.name.compareTo(o1.name);
		}
		
	}
	
	
}