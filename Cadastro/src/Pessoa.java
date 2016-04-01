public class Pessoa
{
   // Atributo
   private String cpf;
   private String nome;
   private Data dataNasc;
   
   // Construtor
   Pessoa (String c, String n, Data dt) {
      cpf = c;
      nome = n;
      dataNasc = dt;
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
   
   public void setData(int d, int m, int a){
	   dataNasc.setDia(d);
	   dataNasc.setMes(m);
	   dataNasc.setAno(a);
   }
   
   public String getData(){
	   return (dataNasc.getData());
   }
   
   public String getDias(){
	   return (dataNasc.getDias());
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
