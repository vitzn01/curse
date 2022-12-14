package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> ap =  Arrays.asList("ana", "luca", "Ana");


		System.out.println("Usando o Foreach...");
		for(String nome: ap) {
			System.out.println(nome);
			
		}
		
		System.out.println("\nUsando iterator...");
	
		Iterator<String> it = ap.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
		Stream<String> stream = ap.stream();
		
		System.out.println("\nUsando Stream...");
		stream.forEach(System.out::println); //laço interno
	}
}
