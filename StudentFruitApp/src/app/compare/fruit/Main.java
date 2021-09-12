package app.compare.fruit;

import java.util.ArrayList;
import java.util.Collections;

import app.compare.fruit.Fruit.FruitComparator;
import app.compare.fruit.Fruit.FruitComparatorDesc;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit f1 = new Fruit(101,"Strawberry",1000);
		list.add(f1);
		Fruit f2 = new Fruit(102,"Banana",3000);
		list.add(f2);
		Fruit f3 = new Fruit(201,"Apple",4000);
		list.add(f3);
		Fruit f4 = new Fruit(401,"Blueberry",4500);
		list.add(f4);
		Fruit f5 = new Fruit(501,"Watermelon",3500);
		list.add(f5);
		Fruit f6 = new Fruit(601,"Melon",5600);
		list.add(f6);
		Fruit f7 = new Fruit(203,"Kiwi",7000);
		list.add(f7);
		Fruit f8 = new Fruit(506,"Orange",1700);
		list.add(f8);
		Fruit f9 = new Fruit(701,"Tangerine",1600);
		list.add(f9);
		Fruit f10 = new Fruit(801,"Strawberry",1000);
		list.add(f10);
		
		Collections.sort(list, new FruitComparator());
		
		for(Fruit a : list)
		{
			System.out.println(a);
		}
		System.out.println("Fruit LIst (ordered by name)");
		Collections.sort(list, new FruitComparatorDesc());
		for(Fruit a : list)
		{
			System.out.println(a);
		}
	}

}
