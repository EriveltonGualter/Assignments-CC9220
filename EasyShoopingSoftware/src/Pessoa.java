public class Pessoa
{
   // Atributo
   private String cpf;
   private String nome;
   private String funcao;
   private String turno;
   private int idade;
   private String senha;

   // Construtor
   Pessoa (String c, String n, String f, String t, int i, String s) {
      cpf = c;
      nome = n;
      funcao = f;
      turno = t;
      idade = i;
      senha = s;
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
   
   public void setFuncao (String f){
	   funcao = f;
   }
   
   public void setTurno (String t) {
	   turno = t;
   }
   
   public void setIdade (int i) {
	   idade = i;
   }
   
   public void setSenha(String s) {
	   senha = s;
   }
   
   public String getSenha() {
	   return senha;
   }
   
   public String getCpf()
   {
      return cpf;
   }
   
   public String getNome()
   {
      return nome;
   }
   
   public String getFuncao(){
	   return funcao;
   }
   
   public String getTurno() {
	   return turno;
   }
   
   public int getIdade() {
	   return idade;
   }
} // Classe Quadrado
