package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts); // printList é o método que imprimirá uma Lista recebida como parâmetro.
	}
	
	public static void printList(List<?> list) { // Esse método recebe uma List de um tipo qualquer como parâmetro.
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}