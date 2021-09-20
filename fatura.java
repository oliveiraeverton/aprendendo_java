import java.util.Scanner;

public class Fatura{
      public  String item;
      public  int quantidade;
      public  double preco;

    Scanner input = new Scanner(System.in);
    //CONSTRUTOR
    public Fatura(){
        
    }

    public void setValores(String item, int quantidade, double preco) {
	    this.item = item;
	    this.quantidade = quantidade;
	    this.preco = preco;
    }

    public void lerItem(){
        String texto = input.nextLine();
        int quant = input.nextInt();
        double pre = input.nextDouble();
        setValores(texto, quant, pre);
    }
    public double getPrecoTotal(){
        
        double total;
        total = this.quantidade * this.preco;
        return total;
    }



    public static void main(String[] args){

        Fatura fatura = new Fatura();
        fatura.lerItem();
        //fatura.setValores("NOTEBOOK", 2, 2300.55);
        //System.out.println(fatura.item);
        //System.out.println(fatura.quantidade);
        //System.out.println(fatura.preco);

        double pagar = fatura.getPrecoTotal();
        System.out.printf("%d x %s = %.1f", fatura.quantidade, fatura.item, pagar);
    }
}
