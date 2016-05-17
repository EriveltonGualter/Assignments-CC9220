public class ProdutoDB {
   private Produto Produtos[] = new Produto[20];
   
   public ProdutoDB(){
	   incluir("Agua Minalba 1L", 100, 10, "Unidade", 1.5, 2.3,"Alimentos e Bebida");
	   incluir("Arroz Camil", 1, 50, "Unidade", 2.8, 5, "Alimentos e Bebida");
	   incluir("Maçã Argentina", 32.5, 2, "kg", 3.90, 6.20, "Alimentos e Bebida");
	   incluir("computador", 1, 2, "Unidade", 1000, 1002, "usado");
	   incluir("Detergente X", 40, 5, "Unidade", 2.6, 4.2, "Produtos de Limpeza");
	   incluir("Amaciante 2L", 25, 3, "Unidade", 3.2, 5.6, "Produtos de Limpeza");
   }

   public int incluir(String nome, double f, int qte_min, String unidade, double d, double e, String classificacao) {       
      for (int i=1; i<Produtos.length; i++) {
         if (Produtos[i]==null) {
            Produtos[i] = new Produto( i, nome, f, qte_min, unidade, d, e, classificacao);
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
	
	public boolean alterar(int id, String nome, int qte, int qte_min, String unidade, float preco_venda, float preco_compra, String classificacao) {
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