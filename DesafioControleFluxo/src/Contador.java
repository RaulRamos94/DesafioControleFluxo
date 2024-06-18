import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);


		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);

		}catch (ParametrosException e) {
			System.out.println("Erro!");
            System.out.println(e.getMessage());
		}
		
	}

    static void contar(int parametroUm, int parametroDois) throws ParametrosException {
        if(parametroUm > parametroDois){
            throw new ParametrosException("O segundo número deve ser maior que o primeiro");
        }
        for(int i = parametroUm; i <= parametroDois; i++){
            System.out.println("Numero: " + i);
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
    }
}
