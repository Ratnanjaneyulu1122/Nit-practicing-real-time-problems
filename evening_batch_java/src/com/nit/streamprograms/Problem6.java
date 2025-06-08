package com.nit.streamprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Problem6 {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Puppy");
		animals.add("Zeebra");

//		for (String animal : animals) {
//			System.out.print(animal + " ");
//		}
//		System.out.println(animals);
//		animals.forEach(a -> System.out.print(a + " "));
//		for (int i = 0; i < animals.size(); i++) {
//			System.out.print(animals.get(i)+" ");
//		}
//		
//		Iterator<String> itr=animals.iterator();
//		while (itr.hasNext()) {
//			String animal = (String) itr.next();
//			System.out.print(animal);
//		}
		
//		ListIterator<String> litr=animals.listIterator();
//		while (litr.hasNext()) {
//			String animal = (String) litr.next();
//			System.out.print(animal+" ");
//		}
		
//		Stream<String> stream=animals.stream();
//		stream.forEach(animal->System.out.print(animal+" "));
//		
//		Spliterator<String> splitr=animals.spliterator();
//		splitr.forEachRemaining(animal1->System.out.print(animal1+" "));
		
		//printing tryadvance
		Spliterator<String> splitr1=animals.spliterator();
		while (splitr1.tryAdvance(System.out::print)) {  //--->(splitr1.tryAdvance(a->System.out.print(a))
			System.out.print(" ");
		}
	}
}
/*write a java program to create an array list add some animal(Strings) and print out 
 * the collection.
 * test case-> print the elements present in array in same line with between the names.
 */
