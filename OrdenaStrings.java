package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("java");
		palavras.add("alura");
		palavras.add("testes");
		

		Consumer<String> consumer = new ImprimeNaLinha(); 
		palavras.forEach(consumer);
	}

	
}
class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}