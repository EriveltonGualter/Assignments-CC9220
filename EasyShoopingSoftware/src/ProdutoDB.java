public class ProdutoDB {
   private Produto Produtos[] = new Produto[20];
   
   public ProdutoDB(){
	   incluir("Caneta", 3, 2, 4, 2, 4, "Novo");
	   incluir("penrive", 12, 123, 3, 12, 45, "Novo");
	   incluir("computador", 12, 2, 1, 1000, 1002, "usado");
   }

   public int incluir(String nome, int qte, int qte_min, int unidade, int preco_venda, int preco_compra, String classificacao) {       
      for (int i=1; i<Produtos.length; i++) {
         if (Produtos[i]==null) {
            Produtos[i] = new Produto( i, nome, qte, qte_min, unidade, preco_venda, preco_compra, classificacao);
            return i;
         }
      }
      return 0;
   }
   
	public boolean excluir( int id) {
		for(int i=0; i<Produtos.length; i++) {
			if((Produtos[i]!=null) && (Produtos[i].getid() == id)){
				Produtos[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public boolean alterar(int id, String nome, int qte, int qte_min, int unidade, int preco_venda, int preco_compra, String classificacao) {
		for(int i=0; i<Produtos.length; i++) {
			if((Produtos[i]!=null) && (Produtos[i].getid() == id)){
				Produtos[i].setNome(nome);
				Produtos[i].setQte(qte);
				Produtos[i].setUnidade(unidade);
				Produtos[i].setPreco_venda(preco_venda);
				Produtos[i].setPreco_compra(preco_compra);
				Produtos[i].setClassificacao(classificacao);
				return true;
			}
		}
		return false;
	}
   
   public Produto consultar(int id) {
      for(int i=0; i<Produtos.length; i++) {
         if((Produtos[i]!=null) && (Produtos[i].getid() == id)) {
            return Produtos[i];
         }
      }
      return null;
   }
   
   public Produto[] listar() {
	   return Produtos;
   }
}