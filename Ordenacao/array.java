import java.util.Scanner;
public class array
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do array quer você deseja criar: ");
		int tamanhoArray = input.nextInt();
		
		Produtos[] produtos = new Produtos[tamanhoArray];
		
		System.out.println("Vamos agora inserir os elementos no seu array...\n");
		System.out.println("Digite o nome do PRODUTO e PRECO, separados por espaço");
		
		String nome;
		double preco;
		for(int i = 0; i < produtos.length; i++){
			nome = input.next();
			preco = input.nextDouble();
			
			
			produtos[i] = new Produtos(nome, preco);
			
		}
			
		Ordenacao(produtos);
		for(int i = 0; i < tamanhoArray; i++){
			System.out.println(produtos[i].nome+" "+produtos[i].preco);
		}		
		
		//int indiceDoMenorPreco = buscaMenorElemento(produtos);
		//System.out.println(produtos[indiceDoMenorPreco].nome + " " +produtos[indiceDoMenorPreco].preco);
		//System.out.println(produtos[0].nome + " " +produtos[0].preco);
		//System.out.println(produtos[1].nome + " " +produtos[1].preco);
		
	}//fim Main
	
	
	//*******************************************INICIO DAS FUNCOES
	
	
	 
	
	
	
	
	public static int buscaMenorElemento(Produtos[] produtos)
		{
			
			int atual = 1;
			int maisBarato = 0;
			
			
			int tamanhoArray = produtos.length;
			while(atual < tamanhoArray)
			{
			
				if(produtos[atual].preco < produtos[maisBarato].preco)
				{
					maisBarato = atual;
				}
				atual++;	
			}
			return maisBarato;
			
		}
		
		
		
		
	public static void Ordenacao(Produtos[] produtos){
	
		int tamanhoArray = produtos.length;
		int indiceMenor = 0;
		
		for(int i = 0; i < tamanhoArray; i++){
			for(int j = i; j < tamanhoArray; j++){
				if(produtos[j].preco < produtos[i].preco){
					indiceMenor = j;
				}
			}
			Produtos produtoAtual = produtos[i];
			Produtos produtoMenor = produtos[indiceMenor];
			
			produtos[i] = produtoMenor;
			produtos[indiceMenor] = produtoAtual;
		
		}
	
	}
	
	//*******************************************FIM DAS FUNCOES
}//fim Classe



//inicio das Classes
class Produtos
{


	public String nome;
	public double preco;
	public Produtos(String nome, double preco)
	{
		this.nome = nome;
		this.preco = preco;
	}
}

/*
banana 7,99
maca 8,99
mamao 9,99
goiaba 4,99
*/
