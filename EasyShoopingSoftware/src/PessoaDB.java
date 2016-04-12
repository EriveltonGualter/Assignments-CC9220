public class PessoaDB {
   private Pessoa pessoas[] = new Pessoa[20];
   
   public PessoaDB(){
	   incluir("101", "Erivelton Gualter", new Data(13,04,1992));
	   incluir("194", "Vicky Kras       ", new Data(19,3,2016));
	   incluir("123", "Bruno Oliveira	", new Data(1,1,2016));
   }
   
   public boolean incluir( String cpf, String nome, Data dataNasc) {
      if (consultar(cpf)!=null)   // CPF já existe 
         return false;
         
      for (int i=0; i<pessoas.length; i++) {
         if (pessoas[i]==null) {
            pessoas[i] = new Pessoa(cpf, nome, dataNasc);
            return true;
         }
      }
      return (false);
   }
   
	public boolean excluir( String cpf) {
		for(int i=0; i<pessoas.length; i++) {
			if((pessoas[i]!=null) && (pessoas[i].getCpf().equals(cpf))){
				pessoas[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public boolean alterar( String cpf_old, String nome) {
		for(int i=0; i<pessoas.length; i++) {
			if((pessoas[i]!=null) && (pessoas[i].getCpf().equals(cpf_old))){
				pessoas[i].setNome(nome);
				return true;
			}
		}
		return false;
	}
   
   public Pessoa consultar(String cpf) {
      for(int i=0; i<pessoas.length; i++) {
         if((pessoas[i]!=null) && (pessoas[i].getCpf().equals(cpf))) {
            return pessoas[i];
         }
      }
      return null;
   }
   
   public Pessoa[] listar() {
	   return pessoas;
   }
}