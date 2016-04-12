public class ProdutoDB {
   private Produto Produtos[] = new Produto[20];
   
   public ProdutoDB(){
//      incluir("12","Laptop");
//      incluir("23","Mouse");
   }
   
   public boolean incluir( String id, String descricao) {
      if (consultar(id)!=null)   // id já existe 
         return false;
         
      for (int i=0; i<Produtos.length; i++) {
         if (Produtos[i]==null) {
            Produtos[i] = new Produto(id, descricao);
            return true;
         }
      }
      return (false);
   }
   
	public boolean excluir( String id) {
		for(int i=0; i<Produtos.length; i++) {
			if((Produtos[i]!=null) && (Produtos[i].getid().equals(id))){
				Produtos[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public boolean alterar( String id_old, String descricao) {
		for(int i=0; i<Produtos.length; i++) {
			if((Produtos[i]!=null) && (Produtos[i].getid().equals(id_old))){
				Produtos[i].setDescricao(descricao);
				return true;
			}
		}
		return false;
	}
   
   public Produto consultar(String id) {
      for(int i=0; i<Produtos.length; i++) {
         if((Produtos[i]!=null) && (Produtos[i].getid().equals(id))) {
            return Produtos[i];
         }
      }
      return null;
   }
   
   public Produto[] listar() {
	   return Produtos;
   }
}