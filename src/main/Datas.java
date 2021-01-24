package main;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Datas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadas = LocalDate.of(2021, Month.OCTOBER, 5);
		System.out.println(olimpiadas);
		
		int anos = olimpiadas.getYear();
		
		
		Period period = Period.between(hoje, olimpiadas);
		System.out.println(period); 
	}

}
