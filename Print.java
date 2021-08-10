/**System.out.print** Não pula linha no final da instrução;

**System.out.println** Pula a linha no final da instrução;
*/

public class TestaDiferentePrints{

	public static void main(String[] args){
		
	System.out.println("Um linha"); /* QUANDO EXECUTA O PRINT, ELE PULA A LINHA */
	System.out.print("Segunda linha"); /* O PRINT ACONTECE NA LINHA DE BAIXO, POIS FOI PULADO PELA INSTRUÇÃO ACIMA */
	System.out.print("   Continuação da segunda linha..."); /* O PRINT ACIMA NÃO PULA A LINHA, POIS NÃO HÁ INSTRUÇÃO ln */
	System.out.println("Terceira linha ??");	/* o PRINT ACONTECE NA LINHA DE CIMA, POIS A INSTRUÇÃO DE CIMA NÃO PULA LINHA, MAS ESSE INSTRUÇÃO PULA A LINHA NO FINAL */
		

	}

}
