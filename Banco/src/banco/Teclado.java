import java.io.DataInputStream;

public class Teclado{

	public int lerInteiro(String msg){
		System.out.println(msg);
		DataInputStream Ent = new DataInputStream(System.in);
		String linha="";

		try {
			linha = Ent.readLine();
		}
		catch (Exception erro){
			System.out.println ("Erro de Leitura");
		}

		return Integer.valueOf(linha).intValue();
	}
		

	public float lerReal(String msg){
		System.out.println(msg);
		DataInputStream Ent = new DataInputStream(System.in);
		String linha="";

		try {
			linha = Ent.readLine();
		}
		catch (Exception erro){
			System.out.println ("Erro de Leitura");
		}

		return Float.valueOf(linha).floatValue();
	}

	public String lerStrings(String msg){
		System.out.println(msg);
		DataInputStream Ent = new DataInputStream(System.in);
		String linha="";

		try {
			linha = Ent.readLine();
		}
		catch (Exception erro){
			System.out.println ("Erro de Leitura");
		}

		return linha;
	}
}