
public class ProdutoDB {
	private Produto listProduto[] = new Produto[20]; 
	
	ProdutoDB() {
	}
	
	public boolean incluir(String c, String d, String p) {
		if (consultar(c) != null)
			return false;
		for( int i=0; i<listProduto.length; i++) {
			if (listProduto[i] == null){
				listProduto[i] = new Produto(c,d,p);
				break;
			}
		}
		return true;
	}
	
	public Produto consultar (String c){
		for (int i=0; i<listProduto.length; i++){
			if (listProduto[i] != null && listProduto[i].getCodigo().equals(c))
				return listProduto[i];
		}
		return null;
	}
	
	public boolean excluir (String c) {
		for (int i=0; i<listProduto.length; i++) {
			if (consultar(c) != null && listProduto[i].getCodigo().equals(c)) {
				listProduto[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public boolean alterar (String c, String nd, String np){
		for( int i=0; i<listProduto.length; i++) {
			if (consultar(c) != null && listProduto[i].getCodigo().equals(c)) {
				listProduto[i].setDescricao(nd);
				listProduto[i].setPreco(np);
			}
		}
		return false;
	}
}