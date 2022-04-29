public class testeA
{


    public static void main(String[] args)
    {

        
        VetorAlunos guilherme = new VetorAlunos("Guilherme", 7);
        
        VetorAlunos[] alunos =
        {
          new      VetorAlunos("andré", 4),
          new      VetorAlunos("mariana", 5),
          new      VetorAlunos("carlos", 8.5f),
          new      VetorAlunos("paulo" , 9),
          new      VetorAlunos("jonas", 3), 
          new     VetorAlunos("juliana", 6.7f),
          guilherme,
          new      VetorAlunos("lúcia", 9.3),
          new     VetorAlunos("ana", 10)
        };

        int menor = menores(guilherme, alunos);
        System.out.println(menor);
    }
    
    
   
    
    static int menores(VetorAlunos aluno, VetorAlunos[] vetor)
    {
    
      int tamanhoArray = vetor.length;
      int menores = 0;
      for(int i = 0; (i < tamanhoArray && aluno.getNota() > vetor[i].getNota()) || i < tamanhoArray; i++){
          menores++;        
      }
    
    
      return menores;
    
    }
  
}


class VetorAlunos
{

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
