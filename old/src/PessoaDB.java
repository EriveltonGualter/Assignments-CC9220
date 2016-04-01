public class PessoaDB {
   private Pessoa pessoas[] = new Pessoa[20];
   
   public PessoaDB(){
      incluir("23","Eri");
      incluir("20","Vicky");
   }
   
   public boolean incluir( String cpf, String nome) {
      if (consultar(cpf)!=null)   // CPF já existe 
         return false;
         
      for (int i=0; i<pessoas.length; i++) {
         if (pessoas[i]==null) {
            pessoas[i] = new Pessoa(cpf, nome);
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
	
	public boolean alterar( String cpf_old, String cpf, String nome) {
		for(int i=0; i<pessoas.length; i++) {
			if((pessoas[i]!=null) && (pessoas[i].getCpf().equals(cpf_old))){
				pessoas[i].setCpf(cpf);
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