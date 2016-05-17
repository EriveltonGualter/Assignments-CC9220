
public class DBListaTemp {
	   private ListaTemp Listas[] = new ListaTemp[20];
	   
	   public DBListaTemp(){
	   }

	   public int incluir(int id, String Nome, double qte, double preco) {      
	      for (int i=1; i<Listas.length; i++) {
	         if (Listas[i]==null) {
	        	 Listas[i] = new ListaTemp( id, Nome, qte, preco);
	            return i;
	         }
	      }
	      return 0;
	   }
	   
		public boolean excluir( int id) {
			for(int i=0; i<Listas.length; i++) {
				if((Listas[i]!=null) && (Listas[i].getId() == id)){
					Listas[i] = null;
					return true;
				}
			}
			return false;
		}
		
		public boolean alterar(int id, String Nome, double qte, double preco) {      
			for(int i=0; i<Listas.length; i++) {
				if((Listas[i]!=null) && (Listas[i].getId() == id)){
					Listas[i].setId(id);
					Listas[i].setNome(Nome);
					Listas[i].setQte(qte);
					Listas[i].setPreco(preco);
					return true;
				}
			}
			return false;
		}
	   
	   public ListaTemp consultar(int id) {
	      for(int i=0; i<Listas.length; i++) {
	         if((Listas[i]!=null) && (Listas[i].getId() == id)) {
	            return Listas[i];
	         }
	      }
	      return null;
	   }
	   
	   public ListaTemp[] listar() {
		   return Listas;
	   }
	}