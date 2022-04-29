public class FuncoesDeOrdenacao{


	public static void main(String[] args){
	
	
		//Criar um Array com 9 elementos
		//Nome e Nota dos alunos
		
		VetorAlunos guilherme = new VetorAlunos("Guilherme", 7);
		VetorAlunos[] alunos =
		{
		new  	VetorAlunos("jonas", 3),
        new  	VetorAlunos("andré", 4),
        new 	VetorAlunos("mariana", 5),
        new  	VetorAlunos("juliana", 6.7f),
        guilherme,
        new  	VetorAlunos("carlos", 8.5f), 
        new  	VetorAlunos("paulo" , 9),
        new 	VetorAlunos("lúcia", 9.3),
        new  	VetorAlunos("ana", 10)
		};
		
		/*VetorAlunos[] ordAlunos = {
			new  	VetorAlunos("carlos", 8.5f),//0
			new  	VetorAlunos("andré", 4), //1
			new 	VetorAlunos("ana", 10), //2
			new  	VetorAlunos("jonas", 3),  //3
			new 	VetorAlunos("juliana", 6.7f), //4
        	new  	VetorAlunos("mariana", 5),//5
        	new  	VetorAlunos("gui" , 7), //6
        	new  	VetorAlunos("paulo" , 9), //7
			new  	VetorAlunos("lúcia", 9.3)//8
		};*/
		
		//******************************************TESTE DAS FUNÇÕES
		
		
			//SELECTION SORT
			//selectionSort(alunos);
			
			//INSERCTION SORT
			//inserctionSort(alunos);
			
			//INTERCALAÇÃO	
			//ordAlunos = intercala(ordAlunos, 0, 4, ordAlunos.length);

			//MERGESORT
			//mergeSort(ordAlunos, 0, 9);
					
				
		//FIM DOS TESTES
		
		//printArray(ordAlunos);
		
		
		//ALGORITMOS TESTES PARA A CONTAGEM DE NOTAS MAIORES E MENORES QUE UM DETERMINADO ALUNO
		
		//int menor = menores(guilherme, alunos);
		//System.out.println(menor);
		
		//PIVOTA
		
		//quebraNoPivo(alunos, 0 , alunos.length);
		
		//quickSort(alunos, 0, alunos.length);
		//printArray(alunos);
		int x = buscaBinariaString(alunos, 0, 9, "ana");
		System.out.println(x);
	}
	
	
	//ENTRE MAIN
	private static int buscaBinariaString(VetorAlunos[] nomes, int de, int ate, String busca) {

		  if(de > ate) {
			return -1;
		  }
		  int meio = (de + ate) / 2;
		  String nome = nomes[meio].getNome();
		  
		  if(busca.compareTo(nome) == 0) {
			return meio;
		  }
		  if(busca.compareTo(nome) < 0) {
			return buscaBinariaString(nomes, de, meio - 1, busca);
		  }
		  return buscaBinariaString(nomes, meio + 1, ate, busca);
	}
	static int buscaBinaria(VetorAlunos[] notas, int de, int ate, double buscando) {
		
		int meio = (de + ate)/2;
		
		VetorAlunos nota = notas[meio];
		if(de > ate) {
  			return -1;
		}
		if(nota.getNota() == buscando){
			return meio;
		}
		if(nota.getNota() > buscando){
			return buscaBinaria(notas, de, meio -1, buscando);
			
		}
		return buscaBinaria(notas, meio + 1, ate, buscando);
		
	}
	static void quickSort(VetorAlunos[] vetor, int de, int ate){
		int elementos = ate - de;
		if(elementos > 1){
			int posicaoDoPivo = quebraNoPivo(vetor, de, ate);
			quickSort(vetor, de, posicaoDoPivo);
			quickSort(vetor, posicaoDoPivo + 1, ate);
		}
		
		
	}
	
	static int quebraNoPivo(VetorAlunos[] vetor, int inicial, int termino){
	
		VetorAlunos pivo = vetor[termino -1];
		int menoresEncontrados = 0;
		
		for(int analisando = 0; analisando < termino - 1; analisando++){
			
			VetorAlunos atual = vetor[analisando];
			if(atual.getNota() <= pivo.getNota()){
				troca(vetor, analisando, menoresEncontrados);
				menoresEncontrados++;
			}			
		}
		troca(vetor, termino - 1, menoresEncontrados);
		return menoresEncontrados;
	}
	
	static void troca(VetorAlunos[] vetor, int de, int para){
	
		VetorAlunos nota1 = vetor[de];
		VetorAlunos nota2 = vetor[para];
		
		vetor[para] = nota1;
		vetor[de] = nota2;
	}
	
	static int menores(VetorAlunos aluno, VetorAlunos[] vetor){
	
		int tamanhoArray = vetor.length;
		int menores = 0;
		for(int i = 0; i < tamanhoArray; i++){
			if(aluno.getNota() > vetor[i].getNota()){
			
				menores++;
			}		
		}
	
	
		return menores;
	
	}
	static int maiores(VetorAlunos aluno, VetorAlunos[] vetor){
	
		int tamanhoArray = vetor.length;
		int maiores = 0;
		for(int i = 0; i < tamanhoArray; i++){
			if(aluno.getNota() < vetor[i].getNota()){
			
				maiores++;
			}		
		}
	
	
		return maiores;
	
	}
	
	static void mergeSort(VetorAlunos[] vetor, int inicio, int fim){
        
   		//passa o índice do primeiro elemento do vetor, passa a qtd de elementos que existe no vetor
		int qtd = fim - inicio;
        if(qtd > 1){
            
			int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio); 
            
            mergeSort(vetor, meio, fim); 
            
            inter(vetor, inicio, meio, fim);
        }

    }
    static void mergeSort2(VetorAlunos[] vetor, int inicio, int fim){
        System.out.println("Não está pronta essa função, não utilizar!!!!!!");
   		//passa o índice do primeiro elemento do vetor, passa a qtd de elementos que existe no vetor
		int qtd = fim - inicio;//8
        if(qtd > 1){
            
			int meio = (inicio + fim+1) / 2;//4
			
            mergeSort(vetor, inicio, meio-1); 
            
            mergeSort(vetor, meio, fim); 
            
            inter(vetor, inicio, meio, fim);
        }

    }
    static VetorAlunos[] inter(VetorAlunos[] vetor, int inicio, int mediana, int fim){
    
    	VetorAlunos[] vetorFinal = new VetorAlunos[fim - inicio];
    	
    	int atual = 0; //variavel que fará percorrer todo o vetorFinal
		int i = inicio; //variavel que percorre o meio para direita
		int j = mediana; //variavel que percorre da esquerda para a direita
    	
    	while(i < mediana && j < fim){
			if(vetor[i].nota < vetor[j].nota){
				vetorFinal[atual] = vetor[i];
				i++;
			}else{
				vetorFinal[atual] = vetor[j];
				j++;
			}
			atual++;
		}
		
		while(i < mediana){
			vetorFinal[atual] = vetor[i];
			i++;
			atual++;
		}
		
		while(j < fim){
			vetorFinal[atual] = vetor[j];
			j++;
			atual++;
		}			
		for(int contador = 0; contador < atual; contador++){
			vetor[inicio + contador] = vetorFinal[contador];
			
		}
    
    
    
    	return vetor;
    }
	static VetorAlunos[] intercala(VetorAlunos[] vetor, int inicio, int mediana, int fim){
		//Quando passarmos como argumento:
		// a posição inicial da intercalação
		// a posição mediana da intercalação
		// a posição final da intercalação
		// nessa implementação faz necessário adicionar +1 no tamanho do array, pois estamos passando os indices do array
		//e nao a qtd de elementos que este o possui
		int tamanhoArray = fim - inicio + 1;
		VetorAlunos[] vetorFinal = new VetorAlunos[tamanhoArray];
		
		int atual = 0; //variavel que fará percorrer todo o vetorFinal
		int i = inicio;
		int j = mediana;
		while(i < mediana && j <= fim){
			if(vetor[i].nota < vetor[j].nota){
				vetorFinal[atual] = vetor[i];
				i++;
			}else{
				vetorFinal[atual] = vetor[j];
				j++;
			}
			atual++;
		}
		
		while(i < mediana){
			vetorFinal[atual] = vetor[i];
			i++;
			atual++;
		}
		
		while(j <= fim){
			vetorFinal[atual] = vetor[j];
			j++;
			atual++;
		}			
		for(int contador = 0; contador < atual; contador++){
			vetor[inicio + contador] = vetorFinal[contador];
			
		}
		return vetor;
	}
	
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
	
	static int buscaLinear(VetorAlunos[] notas, int de, int ate, double busca) {

		for(int atual = de; atual < ate; atual++) {
    		if(notas[atual].getNota() == busca) {
      			return atual;
    		}
  		}
  		return -1;
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
