
public class TestaAtleta {
	public static void main(String[] args) {
		double peso, altura;
		peso = 68;
		altura = 1.74;
		
		Atleta atleta = new Atleta();
		atleta.ObterIMC(peso, altura);
		atleta.Classificar();
		atleta.ObterRisco();
	}
}
