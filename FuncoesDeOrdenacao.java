public class FuncoesDeOrdenacao{


	public static void main(String[] args){
	
	
		//Criar um Array com 9 elementos
		//Nome e Nota dos alunos
		
		VetorAlunos[] alunos =
		{
		new  	VetorAlunos("andré", 4),
        new  	VetorAlunos("mariana", 5),
        new  	VetorAlunos("carlos", 8.5f),
        new  	VetorAlunos("paulo" , 9),
        new  	VetorAlunos("jonas", 3), 
        new 	VetorAlunos("juliana", 6.7f),
        new  	VetorAlunos("gui" , 7),
        new  	VetorAlunos("lúcia", 9.3),
        new 	VetorAlunos("ana", 10)
		};
		
		//******************************************TESTE DAS FUNÇÕES
		
		
			//SELECTION SORT
			//selectionSort(alunos);
			
			//INSERCTION SORT
			inserctionSort(alunos);
			
			//INTERCALAÇÃO	
		
		//FIM DOS TESTES
		
		printArray(alunos);
		
	}
	
	
	//ENTRE MAIN
	
	static void inserctionSort(VetorAlunos[] vetor){
	
	int tamanhoArray = vetor.length;
	
	for(int i = 0; i < tamanhoArray; i++){
		//percorrer todo a array, e ver se esse elemento atual é menor ou maior que o elemento a esquerda
		
		//se elemento do arrayAtual for menor, entra no while e vai copiando ele para o elemento da esquerda, e o da esquerda na direita, até 
		//atual = 0
		
		int atual = i;//esta variavel segura meu atual do for, para nao ter que percorrer o vetor desde o inicio
		//caso o atual volte a ser 0
		while(atual != 0 && vetor[atual].getNota() < vetor[atual - 1].getNota()){
			
			VetorAlunos maior = vetor[atual-1];
			VetorAlunos menor = vetor[atual];
			vetor[atual] = maior;
			vetor[atual - 1] = menor;
			atual--;
		}
	}
	
	
	
	}
	
	static void selectionSort(VetorAlunos[] vetor)
	{
		//método void não retorna nada, no entanto as alterações serão feitas automaticamente no próprio vetor que invoca o método.
		
		//*******Variáveis usadas nesta função*******************
		int totalElementosVetor = vetor.length;
		
		
		for(int atual = 0; atual < totalElementosVetor; atual++)
		{
		
		int menor = atual;
			//percorrer todo o vetor para pegar o menorElemento e devolver o índice do menorElemento.
			for(int i = atual; i < totalElementosVetor; i++)
			{
				if(vetor[menor].nota > vetor[i].nota)
				{
					//elemento da esquerda é maior que o elemento da direita,
					// significa que o elemento da direita deverá ser o elemento da esquerda, então
					//troque ele de lugar.
					menor = i;
				}
			}
			//Como queremos copiar somente um único elemento não precisamos criar um Array, e sim somente um único espaço
			VetorAlunos vetorAux = vetor[atual];
			vetor[atual] = vetor[menor];
			vetor[menor] = vetorAux;
		}
  }//fim da função SelectionSort
  
  static void printArray(VetorAlunos[] vetor){
  	for (int i = 0; i <  vetor.length; i++){
  		System.out.println(vetor[i].getNome() + " " + vetor[i].getNota());
  	}
  
  }
	
	
	
	
	
	//FIM ENTRE MAIN
	
	
	
	
	
}


class VetorAlunos{

	String nome;
	double nota;
	
	public VetorAlunos(String nome, double valor){
		this.nome = nome;
		this.nota = valor;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setNota(double nota){
		this.nota = nota;
	}
	
	public double getNota(){
		return this.nota;
	}
}
