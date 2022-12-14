package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		Consumer<Object> print = System.out::println;
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS ", "\n");
		
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Gol\n"};		
		
		Stream.of(maisLangs).forEach(print);
		
		//dentro de arrays
		Arrays.stream(maisLangs).forEach(print);
		//adicionando mais arrays, além da variável
		Arrays.stream(maisLangs, 0, 4).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "KOTLIN");
	outrasLangs.stream().forEach(print);
	
	System.out.println("\n");
	outrasLangs.parallelStream().forEach(print);
	//	Stream.generate(() -> "a").forEach(print);;
	
	Stream.iterate(0, n -> n + 1).forEach(print);;
	Stream.iterate(1, n -> n + 1);

	} 
}
