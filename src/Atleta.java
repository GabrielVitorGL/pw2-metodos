
public class Atleta {
	
	public double peso, altura, imc;

	public double ObterIMC (double peso0, double altura0) {
		peso = peso0;
		altura = altura0;
		
	    imc = peso / (altura * altura);
	    
	    return (imc);
	}
	
	public void Classificar() {
		if (imc < 18.5)
	    {
	    	System.out.printf("Seu IMC é %.2f e você está abaixo do peso\n", imc);
	    }
	    else if (imc >= 18.5 && imc <= 24.9)
	    {
	    	System.out.printf("Seu IMC é %.2f e você está com peso normal\n", imc);
	    }
	    else if (imc >= 25 && imc <= 29.9)
	    {
	    	System.out.printf("Seu IMC é %.2f e você está com sobrepeso\n", imc);
	    }
	    else if (imc >= 30 && imc <= 34.9)
	    {
	    	System.out.printf("Seu IMC é %.2f e você está com obesidade grau I\n", imc);
	    }
	    else if (imc >= 35 && imc <= 39.9)
	    {
	    	System.out.printf("Seu IMC é %.2f e você está com obesidade grau II\n", imc);
	    }
	    else {
	        System.out.printf("Seu IMC é %.2f e você está com obesidade grau III\n", imc);
	    }
	}
	public void ObterRisco() {
		if (imc < 18.5)
	    {
	    	System.out.println("Muito alto");
	    }
	    else if (imc >= 18.5 && imc <= 24.9)
	    {
	    	System.out.println("Baixo");
	    }
	    else if (imc >= 25 && imc <= 29.9)
	    {
	    	System.out.println("Normal");
	    }
	    else if (imc >= 30 && imc <= 34.9)
	    {
	    	System.out.println("Alto");
	    }
	    else if (imc >= 35 && imc <= 39.9)
	    {
	    	System.out.println("Muito alto");
	    }
	    else {
	    	System.out.println("Muitíssimo alto");
	    }
	}
}