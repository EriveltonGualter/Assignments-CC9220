public class Produto
{
   // Atributo
	private String nome;
	private int id;
	private double qte;
	private double qte_min;
	private String unidade;
	private double preco_venda;
	private double preco_compra;
	private String classificacao;   
	
   // Construtor
   Produto (int i, String n, double q, double qm, String u, double pv, double pc, String c) {
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
   
   public void setQte (double q) {
	   qte = q;
   }
   
   public void setQte_min (double qm) {
	   qte_min = qm;
   }
   
   public void setUnidade (String u) {
	   unidade = u;
   }
   
   public void setPreco_venda (double pv) {
	   preco_venda = pv;
   }
   
   public void setPreco_compra (double pc) {
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
   
   public double getQte() {
	   return qte;
   }
   
   public double getQte_min() {
	   return qte_min;
   }
   
   public String getUnidade() {
	   return unidade;
   }
   
   public double getPreco_venda() {
	   return preco_venda;
   }
   
   public double getPreco_compra() {
	   return preco_compra;
   }
   
   public String getClassificacao()
   {
      return classificacao;
   }

} // Classe Quadrado
