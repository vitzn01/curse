package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Utilitarios {

	private Utilitarios() {
		
	}
	
	
	public final static List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 , 9, 10);
	
	public final static Consumer<Object> print = System.out::println;
	
	public final static Function<Integer, String> IntegerPString = nm -> Integer.toBinaryString(nm);
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	public final static Function<String, Integer> converteParaInt = in -> Integer.parseInt(in, 2);
	public final static UnaryOperator<String> converteString = cv -> new StringBuilder(cv).reverse().toString();
	
	public final static String grito(String n) {return  n + "!!!";
	

		}
	

	static void desafio() {
		nums.stream().map(IntegerPString).map(converteString).map(converteParaInt).forEach(print);
	}
}

