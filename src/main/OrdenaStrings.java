package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// Comparator<String> comparador = new ComparadorPorTamanho();
		// Collections.sort(palavras, comparador);

//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//
//			if (s1.length() > s2.length())
//				return 1;
//
//			return 0;
//
//		});

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(palavras);

		for (String string : palavras) {
			System.out.println(string);
		}

		palavras.forEach(p -> System.out.println(p));

	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;

		if (s1.length() > s2.length())
			return 1;

		return 0;
	}

}