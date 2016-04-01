public class Pessoa
{
   // Atributo
   private String cpf;
   private String nome;
   
   // Construtor
   Pessoa (String c, String n) {
      cpf = c;
      nome = n;
   }
   Pessoa() {
   }
   
   // Métodos
   public void setCpf (String a)
   {
      cpf = a;
   }
   
   public void setNome (String b)
   {
      nome = b;
   }
   
   public String getCpf()
   {
      return cpf;
   }
   
   public String getNome()
   {
      return nome;
   }
   
   public void exibirAtributos()
   {
      System.out.printf("\n CPF = %s \n Nome = %s", getCpf(), getNome());
   }
} // Classe Quadrado
