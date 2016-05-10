public class Produto
{
   // Atributo
	private String nome;
	private int id;
	private int qte;
	private int qte_min;
	private int unidade;
	private int preco_venda;
	private int preco_compra;
	private String classificacao;
   
   
   // Construtor
   Produto (int i, String n, int q, int qm, int u, int pv, int pc, String c) {
      id = i;
      qte = q;
      qte_min = qm;
      unidade = u;
      preco_venda = pv;
      preco_compra = pc;
      classificacao = c;
      nome = n;
   }
   Produto() {
   }
   
   // Métodos
   public void setNome(String n){
	   nome = n;
   }
   
   public String getNome() {
	   return nome;
   }
   
   public void setId (int a)
   {
      id = a;
   }
   
   public void setQte (int q) {
	   qte = q;
   }
   
   public void setQte_min (int qm) {
	   qte_min = qm;
   }
   
   public void setUnidade (int u) {
	   unidade = u;
   }
   
   public void setPreco_venda (int pv) {
	   preco_venda = pv;
   }
   
   public void setPreco_compra (int pc) {
	   preco_compra = pc;
   }
      
   public void setClassificacao (String b)
   {
      classificacao = b;
   }
   
   public int getid()
   {
      return id;
   }
   
   public int getQte() {
	   return qte;
   }
   
   public int getQte_min() {
	   return qte_min;
   }
   
   public int getUnidade() {
	   return unidade;
   }
   
   public int getPreco_venda() {
	   return preco_venda;
   }
   
   public int getPreco_compra() {
	   return preco_compra;
   }
   
   public String getClassificacao()
   {
      return classificacao;
   }

} // Classe Quadrado
