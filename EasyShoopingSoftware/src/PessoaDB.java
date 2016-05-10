public class PessoaDB {
   private Pessoa pessoas[] = new Pessoa[20];
   
   public PessoaDB(){
	   incluir("101", "Erivelton Gualter", "Programmer", "Integral", 24);
	   incluir("194", "Vicky Kras       ", "Caixa", "Tarde", 21);
	   incluir("123", "Bruno Oliveira	", "Carregador", "Diurno", 22);
   }
   
   public boolean incluir( String cpf, String nome, String funcao, String turno, int idade) {
      if (consultar(cpf)!=null)   // CPF já existe 
         return false;
         
      for (int i=0; i<pessoas.length; i++) {
         if (pessoas[i]==null) {
            pessoas[i] = new Pessoa(cpf, nome, funcao, turno, idade);
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
	
	public boolean alterar(	String cpf, String nome, String funcao, String turno, int idade) {
		for(int i=0; i<pessoas.length; i++) {
			if((pessoas[i]!=null) && (pessoas[i].getCpf().equals(cpf))){
				pessoas[i].setNome(nome);
				pessoas[i].setFuncao(funcao);
				pessoas[i].setTurno(turno);
				pessoas[i].setIdade(idade);
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