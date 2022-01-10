public class TesteOdernacao extends Ordenacao{


	public static void main(String[] args){
	
	
		
		
		/*Vetor[] notasMauricio = new Vetor[]{
        new  Vetor("andré", 4),
        new  Vetor("mariana", 5),
        new  Vetor("carlos", 8.5f),
        new  Vetor("paulo" , 9)
        };*/
        
        Vetor[] notasAlberto = {
        new  Vetor("andré", 4),
        new  Vetor("mariana", 5),
        new  Vetor("carlos", 8.5f),
        new  Vetor("paulo" , 9),
        new  Vetor("jonas", 3), 
        new Vetor("juliana", 6.7f),
        new  Vetor("gui" , 7),
        new  Vetor("lúcia", 9.3),
        new Vetor("ana", 10)        
    	};
		
		
		Vetor[] rank = intercalaNumeral(notasAlberto, 0, 4, 9);
		
		
		for (int i = 0; i < 9; i++){
			System.out.println(rank[i].nome);
		}
	}

}
