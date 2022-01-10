public class buscaMenor
{
	
	public static void main(String[] args)
	{
	
		Produtos produtos[] = new Produtos[5];
		produtos[0] = new Produtos("Lamborghini", 1000000);
		produtos[1] = new Produtos("Jipe", 46000);
		produtos[2] = new Produtos("Brasília", 16000);
		produtos[3] = new Produtos("Smart", 46000);
		produtos[4] = new Produtos("Fusca", 17000);
		
		//double precos[] = new double[5];
		//precos[0] = 1000000;
		//precos[1] = 46000;
		//precos[2] = 16000;
		//precos[3] = 46000;
		//precos[4] = 17000;
		
		int maisBarato = buscaMenorElemento(produtos);
		System.out.println("O carro mais barato é: " + produtos[maisBarato].nome + " no valo de: " + produtos[maisBarato].preco);
	
		
		
	}//fim Main
	
	
	//INICIO DAS FUNCOES DESTE PROGRAMA
	//************************************************************************************************
	public static int buscaMenorElemento(Produtos[] produtos)
		{
			//este método devolve o índice do array
			//do menor preço de um determinado produto no array
			//NAO PODE SER NO ARGUMENTO Produtos produtos, pois neste caso, seria para passar somente uma única classe, e com
			//Produtos[] produtos, estamos passando um array da Classe produtos 
			int atual = 1;
			int maisBarato = 0;
			
			//precisamos determinar a quantidade de elementos que nossa variável atual percorrerá no array
			//usando .length ela devolve o tamanho do array
			int tamanhoArray = produtos.length;
			while(atual < tamanhoArray)
			{
			//entra com 0 torna-se 1
			//entra com 1 torna-se 2
			//entra com 2 torna-se 3
			//entra com 3 torna-se 4
			//entra com 4 torna-se 5 (OUT OF RANGE)
			//ATUAL++ NÃO PODE FICAR AQUI
				if(produtos[atual].preco < produtos[maisBarato].preco)
				{
					maisBarato = atual;
				}
				atual++;	
			}
			return maisBarato;
		}
		
		/*private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
    		int maisBarato = inicio;
    		for(int atual = inicio; atual <= termino; atual++){
        		if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
            		maisBarato = atual;
            	}
    		}
    		return maisBarato
		}*/
		//***************************************************************************************
		//FIM DAS FUNCOES DESTE PROGRAMA
		
		
}//fim Classe





//***************************************************
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


	/*Lamborghini 1000000
		Jipe 46000
		Brasília 16000
		Smart 46000
		Fusca 17000*/
