package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = 
				(Double n1, Double n2) -> (n1 + n2) / 2;
		
				System.out.println(media.apply(10.2,10.1));
		
		BiFunction<Double, Double, String> resultado =(n1, n2) -> {
				double notaFinal = (n1 + n2) / 2;
				return notaFinal >= 7 ? "Aprovado " : "reprovado";
		};
		
		System.out.println(resultado.apply(8.8, 5.7));
		
		Function<Double, String> conceito =
				m -> m >= 7 ? "aprovado" : "Reprovado";
	
				System.out.println(media.andThen(conceito).apply(9.7,7.7));
	
	}
	
}