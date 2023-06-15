package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts); // printList � o m�todo que imprimir� uma Lista recebida como par�metro.
	}
	
	public static void printList(List<?> list) { // Esse m�todo recebe uma List de um tipo qualquer como par�metro.
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}