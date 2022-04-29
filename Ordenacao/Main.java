import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner input = new Scanner(System.in);
    	
    	int lacos = input.nextInt();
    	int cidade = 1;
    	double calculo = 0;
    	while(lacos!=0) {
    		
    		Cidade[] city = new Cidade[lacos];
    		int people = 0;
    		int consumo = 0;
    		
    		for(int i = 0; i < lacos; i++) {
    			people = input.nextInt();
    			consumo = input.nextInt();
    			city[i] = new Cidade(people, consumo);
    		}
    		int x = pessoasTotais(city);
    		int y = aguasTotais(city);
    		calculo = (float)x/y;
    		System.out.println("pessoasTotais = " + pessoasTotais(city) + " aguasTotais = " + aguasTotais(city) +" // ="+calculo);
    		
    		System.out.println("Digite o valor do novo laço: ");
    		lacos = input.nextInt();
    	}
    }
    static int pessoasTotais(Cidade[] cidade) {
		int tamanhoArray = cidade.length;
		int somaPessoas = 0;
		
		for(int i = 0; i < tamanhoArray; i++) {
			somaPessoas += cidade[i].pessoas;
		}
		return somaPessoas;
	}
	
	static int aguasTotais(Cidade[] cidade) {
		int tamanhoArray = cidade.length;
		int somaAgua = 0;
		for(int i = 0; i < tamanhoArray; i++) {
			somaAgua += cidade[i].agua;
		}
		return somaAgua;
	}
 
}

class Cidade{
	
	int pessoas;
	int agua;
	
	public Cidade(int pessoas, int agua) {
		this.pessoas = pessoas;
		this.agua = agua;
	}
	
	
	
}
