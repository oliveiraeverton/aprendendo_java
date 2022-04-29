class Ordenacao{

	
	public static void selectionSort(Vetor[] produtos){
      int indiceMenorElemento;
      for(int i = 0; i < produtos.length; i++){
        indiceMenorElemento = indiceMenor(produtos, i);
        Vetor atual = produtos[i];
        Vetor troca = produtos[indiceMenorElemento];
        produtos[i] = troca;
        produtos[indiceMenorElemento] = atual;
      }
  }
  public static int indiceMenor(Vetor[] produtos, int inicio){
    int menor = inicio;
    int tamanhoArray = produtos.length;

    for(int i = inicio; i < tamanhoArray; i++){
        if(produtos[menor].idade > produtos[i].idade){
            menor = i;
        }
    }

    return menor;
  }
  
  public static void inserctionSort(Vetor[] produtos){
  	int tamanhoArray = produtos.length;
  	for(int i = 0; i < tamanhoArray; i++){
  	
  		int analise = i;//posição atual
  		
  		//Se analise = 0, não existe nada mais para a esquerda
  		//Out of Range
  		//Então precisa de uma outra condição dentro do while
  		//Que analise > 0
  		while(analise > 0 && produtos[analise].idade < produtos[analise-1].idade){
  		
  			Vetor menorElemento = produtos[analise]; //MENOR ELEMENTO
  			Vetor maiorElemento = produtos[analise-1]; //MAIOR ELEMENTO
  			produtos[analise] = maiorElemento;//ONDE DEVE FICAR O MAIOR ELEMENTO
  			produtos[analise-1] = menorElemento;//ONDE DEVE FICAR O MENOR ELEMENTO
  			
  			analise--;//decrementa a posição atual para ver se existe alguém na esqueda que é maior que o Elemento analisado
  		}
  	}
  }
  
  public static Vetor[] merge(Vetor[] v1, Vetor[] v2){
  //intercala dois array de tamanhos diferentes, desde que estejam ordenadas
  	int total = v1.length + v2.length;
  	Vetor[] v3 = new Vetor[total];
  	
  	int i = 0; //para v1
  	int j = 0; //para v2
  	int k = 0; //para v3
  	while(i <  v1.length && j < v2.length){
  		if(v1[i].idade < v2[j].idade){
  			v3[k] = v1[i];
  			i++;
  		}else{
  			v3[k] = v2[j];
  			j++;
  		}
  		k++;
  	}
  	while(i <  v1.length){
  		v3[k] = v1[i];
  		k++;
  		i++;
  	
  	}
  	while(j < v2.length){
  		v3[k] = v2[j];
  		j++;
  		k++;
  	
  	}
  	
  	return v3;
  }
  
  public static Vetor[] intercalaNumeral(Vetor[] v1, int inicio, int meio, int fim){
  //intercala dois array de tamanhos diferentes, desde que estejam ORDENADOS
  //passa um array grande, no qual sabemos onde difere os valores no meio
  //tamanho total do novo array
  	int total = fim - inicio;
  	Vetor[] v3 = new Vetor[total];
  	
  	int newArray = 0; 
  	int arrayInicio = inicio;
  	int arrayMeio = meio;
  	while(arrayInicio <  meio && arrayMeio < fim){
  		if(v1[arrayInicio].idade < v1[arrayMeio].idade){
  			v3[newArray] = v1[arrayInicio];
  			arrayInicio++;
  		}else{
  			v3[newArray] = v1[arrayMeio];
  			arrayMeio++;
  		}
  		newArray++;
  	}
  	while(arrayInicio <  meio){
  		v3[newArray] = v1[arrayInicio];
  		newArray++;
  		arrayInicio++;
  	
  	}
  	while(arrayMeio < total){
  		v3[newArray] = v1[arrayMeio];
  		arrayMeio++;
  		newArray++;
  	
  	}
  	
  	//for para recopiar os elementos para o original
  	for(int i = 0; i < newArray; i++){
  		v1[i + inicio] = v3[i];
  	}
  	return v1;
  }
  
  
  private static void intercalaAlfabetica(String[] nomes, int inicio, int meio, int termino) {
	//ordena por ordem alfabética
    int total = termino - inicio;
    String[] resultado = new String[total];
    int atual = 0;
    int atual1 = inicio;
    int atual2 = meio;

    while(atual1 < meio && atual2 < termino) {
        String nome1 = nomes[atual1];
        String nome2 = nomes[atual2];
        if(nome1.compareTo(nome2) < 0) {
            resultado[atual] = nome1;
            atual1++;
        } else {
            resultado[atual] = nome2;
            atual2++;
        }
        atual++;
    }

    while(atual1 < meio) {
        resultado[atual] = nomes[atual1];
    atual1++;
    atual++;
    }

    while(atual2 < termino) {
        resultado[atual] = nomes[atual2];
    atual2++;
    atual++;
    }

    for (int contador = 0; contador < atual; contador++) {
        nomes[inicio + contador] = resultado[contador];
    }
    
  }
  
  
}

class Vetor{

	String nome;
	double idade;
	
	public Vetor(String nome, double valor){
		this.nome = nome;
		this.idade = valor;
	}
}
