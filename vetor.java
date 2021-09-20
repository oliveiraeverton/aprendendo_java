import java.util.Scanner;

public class Vetor {
    //objeto Scanner
    Scanner input = new Scanner(System.in);

    //declarando a vetor
    int vet[];

    //construtor do vetor
    public Vetor(){
        int tamanho;
        tamanho = input.nextInt();
        vet = new int[tamanho];
    }

    //entrada do valor
    public void mostra(){
        int tamanho;
        tamanho = vet.length;
        double entrada;
        entrada = input.nextDouble();
        for(int i = 0; i < tamanho; i++){
            
            System.out.printf("vet[%d] = %.2f\n", i, entrada);
            entrada = entrada/2.0;
        }
        
        
    }


    public static void main(String[] args){

        Vetor A = new Vetor();
        A.mostra();
        
    }


}
