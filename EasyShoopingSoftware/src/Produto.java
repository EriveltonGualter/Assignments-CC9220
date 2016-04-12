public class Produto
{
   // Atributo
   private String id;
   private String Descricao;
   
   // Construtor
   Produto (String i, String d) {
      id = i;
      Descricao = d;
   }
   Produto() {
   }
   
   // Métodos
   public void setid (String a)
   {
      id = a;
   }
   
   public void setDescricao (String b)
   {
      Descricao = b;
   }
   
   public String getid()
   {
      return id;
   }
   
   public String getDescricao()
   {
      return Descricao;
   }
   
   public void exibirAtributos()
   {
      System.out.printf("\n id = %s \n Descricao = %s", getid(), getDescricao());
   }
} // Classe Quadrado
