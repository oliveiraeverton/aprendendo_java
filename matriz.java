import java.util.Scanner;

public class Matriz {
    //objeto Scanner
    Scanner input = new Scanner(System.in);

    //declarando a matriz
    int mat[][];

    //construtor da matriz
    public Matriz(int linha, int coluna){
        mat = new int[linha][coluna];
    }

    //ler matriz
    public void leMatriz(){
        for(int i = 0; i < mat.length;i++){
            for(int j = 0; j < mat[0].length ;j++){
                mat[i][j] = input.nextInt();
            }
        }
    }

    public void imprimirMatriz(){
        for(int i = 0; i < mat.length;i++){
            for(int j = 0; j < mat[0].length ;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
    }

    //MaiorLinha
    public void maiorLinha(){
        int linha = input.nextInt();
        int elemento = mat[linha][0];
        int i;
        int indice = 0;
        for(i = 1; i < mat[linha].length; i++){
            if(elemento < mat[linha][i]){
                elemento = mat[linha][i];
                indice = i;
                
            }
        }
        System.out.print(elemento + " " + indice + "\n");
    }

    //somaAcimaDiagonalPrincipal
    public int somaAcimaDiagonalPrincipal(){
        int soma = 0;
        for(int i = 0; i < mat.length;i++){
            for(int j = 0; j < mat[0].length ;j++){
                if(i < j){
                    soma = soma + mat[i][j];
                }
            }
        }
        return soma; 
    }
    public static void main(String[] args){

        Matriz A = new Matriz(4,4);
        A.leMatriz();
        //A.imprimirMatriz();
        int procurarelemento;
        //procurarelemento = input.nextInt();
        A.maiorLinha();
        int soma = A.somaAcimaDiagonalPrincipal();
        System.out.print(soma +"\n");
    }


}
