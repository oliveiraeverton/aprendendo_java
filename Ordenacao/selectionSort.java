import java.util.Scanner;

class selectionSort {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int qtdElementos;
    int qtdPessoas;
    int consu;
    int variavelSomaPessoas = 0;
    int variavelSomaConsumo = 0;
    int gasto = 0;
    float gastoTotal = 0;
    int formatado = 0;
    int qtdCidade = 1;
    qtdElementos = input.nextInt();
    while(qtdElementos != 0){
        variavelSomaPessoas = 0;
        variavelSomaConsumo = 0;
        Consumo[] consumo = new Consumo[qtdElementos];
        for(int i = 0; i < qtdElementos; i++){
            
            qtdPessoas = input.nextInt();
            consu = input.nextInt();
            variavelSomaPessoas += qtdPessoas;
            variavelSomaConsumo += consu;
            gasto = consu/qtdPessoas;
            consumo[i] = new Consumo(qtdPessoas, gasto);
        }
        gastoTotal = (float)variavelSomaConsumo/(float)variavelSomaPessoas;

        formatado = (int) (gastoTotal * 100);
        //System.out.println("DEBUGGGG "+formatado);
        gastoTotal = formatado/100f;
        //System.out.println("DEBUGGGG "+gastoTotal);

        
        ordenacao(consumo);
        System.out.println("Cidade# "+ qtdCidade);
        for(int i = 0; i < qtdElementos; i++){
            System.out.printf("%d-%d ", consumo[i].qtdPessoas, consumo[i].metrosCubicos);
        }
        
        
        //System.out.println("DEBUG " + (float)variavelSomaConsumo/(float)variavelSomaPessoas);
        System.out.printf("\nConsumo medio: %.2f m3.\n\n", gastoTotal);
        qtdElementos = input.nextInt();
        qtdCidade++;
    }

      
  }//fim do metodo main


  public static void ordenacao(Consumo[] produtos){
      int indiceMenorElemento;
      for(int i = 0; i < produtos.length; i++){
        indiceMenorElemento = indiceMenor(produtos, i);
        Consumo atual = produtos[i];
        Consumo troca = produtos[indiceMenorElemento];
        produtos[i] = troca;
        produtos[indiceMenorElemento] = atual;
      }
  }
  public static int indiceMenor(Consumo[] produtos, int inicio){
    int menor = inicio;
    int tamanhoArray = produtos.length;

    for(int i = inicio; i < tamanhoArray; i++){
        if(produtos[menor].getMetrosCubicos() > produtos[i].getMetrosCubicos()){
            menor = i;
        }
    }

    return menor;
  }
}

class Consumo{

    public int qtdPessoas;
    public int metrosCubicos;

    public Consumo(int qtdPessoas, int metrosCubicos){

        this.qtdPessoas = qtdPessoas;
        this.metrosCubicos = metrosCubicos;
    }
    public int getQtdPessoas(){
        return qtdPessoas;
    }
    public int getMetrosCubicos(){
        return metrosCubicos;
    }
}
/*
5
2 2
9 35
4 99
2 9
7 200
*/
