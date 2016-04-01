
public class Produto {
	// Atributes
	private String codigo;
	private String descricao;
	private String preco;
	
	//Constructs
	Produto(){
	}
	Produto(String c, String d, String p){
		codigo = c;
		descricao = d;
		preco = p;
	}
	
	// Methods
	public void setCodigo (String c){
		codigo = c;
	}
	public void setDescricao (String d){
		descricao = d;
	}
	public void setPreco (String p) {
		preco = p;
	}
	public String getCodigo(){
		return codigo;
	}
	public String getDescricao(){
		return descricao;
	}
	public String getPreco(){
		return preco;
	}
}
