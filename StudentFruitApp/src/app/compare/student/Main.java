package app.compare.student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101,"Kim",23);
		list.add(s1);
		Student s2 = new Student(103,"Lee",25);
		list.add(s2);
		Student s3 = new Student(107,"Hong",23);
		list.add(s3);
		Student s4 = new Student(109,"Choi",20);
		list.add(s4);
		Student s5 = new Student(201,"Bae",21);
		list.add(s5);
		Student s6 = new Student(206,"Paik",22);
		list.add(s6);
		Student s7 = new Student(207,"Lim",25);
		list.add(s7);
		Student s8 = new Student(301,"Cho",26);
		list.add(s8);
		Student s9 = new Student(401,"Park",29);
		list.add(s9);
		Student s10 = new Student(601,"Kim",28);
		list.add(s10);
		
		Collections.sort(list);
		for(Student s: list)
		{
			System.out.println(s);
		}
		System.out.println("Student List (reverse ordered by name)");
		Collections.sort(list,Collections.reverseOrder());
		for(Student s: list)
		{
			System.out.println(s);
		}
	}

}
