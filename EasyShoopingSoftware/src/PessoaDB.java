public class PessoaDB {
   private Pessoa pessoas[] = new Pessoa[20];
   
   public PessoaDB(){
	   incluir("123", "erivelton", "Gerente", "Integral", 24, "senhaerivelton");
	   incluir("456", "vicky", "Caixa", "Diurno", 21, "senhavicky");
	   incluir("789", "erika", "Caixa", "Noturno", 20, "senhaerika");
   }
   
   public boolean incluir( String cpf, String nome, String funcao, String turno, int idade, String senha) {
      if (consultar(cpf)!=null)   // CPF já existe 
         return false;
         
      for (int i=0; i<pessoas.length; i++) {
         if (pessoas[i]==null) {
            pessoas[i] = new Pessoa(cpf, nome, funcao, turno, idade, senha);
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
	
	public boolean alterar(	String cpf, String nome, String funcao, String turno, int idade, String senha) {
		for(int i=0; i<pessoas.length; i++) {
			if((pessoas[i]!=null) && (pessoas[i].getCpf().equals(cpf))){
				pessoas[i].setNome(nome);
				pessoas[i].setFuncao(funcao);
				pessoas[i].setTurno(turno);
				pessoas[i].setIdade(idade);
				pessoas[i].setSenha(senha);
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
   
   public int checkUsuario(String nome, String senha) {
	   int r = 0;
      for(int i=0; i<pessoas.length; i++) {
         if((pessoas[i]!=null) && (pessoas[i].getNome().equals(nome))) {
        	 if ((pessoas[i].getSenha().equals(senha))) {
        		 if (pessoas[i].getFuncao().equals("Gerente")) {
        			 return 3;	// Usuario e Senha Correto -> Gerente
        		 }
        		 else {
        			 return 2;	// Usuario e Senha Correto -> Outros
        		 }
        	 }
        	 else {
        		 return 1; 	// Senha Incorreta
        	 }
         }
         else {
        	 r = 0;	// Usuario Incorreto
         }
      }
      return r;
   }
   
   public Pessoa[] listar() {
	   return pessoas;
   }
}