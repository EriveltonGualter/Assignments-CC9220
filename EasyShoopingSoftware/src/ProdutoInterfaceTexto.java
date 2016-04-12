import java.util.Scanner;

public class ProdutoInterfaceTexto
{
   public void ProdutoInterface (ProdutoDB dbproduto)
   {
      Scanner input = new Scanner(System.in);
      String id;
      String descricao;
      Produto Produto = new Produto();
      boolean programa = true;
      
      while(programa){
         System.out.println("\n\n\t CONSULTA PRODUTO");
         System.out.println("\t 1 - Incluir");
         System.out.println("\t 2 - Consultar");
         System.out.println("\t 3 - Alterar");  // Alterar apenas o descricao
         System.out.println("\t 4 - Exluir");   // Atribuir null na posição
         System.out.println("\t 5 - Listar todos");
         System.out.println("\t 6 - Encerrar");
         
         switch( Integer.parseInt(input.nextLine()) ){
            case 1:  // Incluir
               System.out.print( "Entre com o id: " );
               id = input.nextLine();
               System.out.print( "Entre com o descricao: " );
               descricao = input.nextLine();
               
               if(dbproduto.incluir(id,descricao))
                  System.out.println("\nProduto Incluida com sucesso");
               else
                  System.out.print( "\n\n	falha na inclusão \n\n	Produto já existente" );
               break;
               
            case 2:  // Consultar
               System.out.print( "Entre com o id: " );
               id = input.nextLine();
               Produto = dbproduto.consultar(id);
               if (Produto != null) {
            	   String descricao_cons = Produto.getDescricao();
            	   String id_cons = Produto.getid();
            	   System.out.printf("\n descricao : %s", descricao_cons);
            	   System.out.printf("\n id  : %s", id_cons);
               }
               else {
                  System.out.print( "\nProduto não existente" );
               }
               break;
               
            case 3:  // Alterar
            	System.out.print( "Entre com o id que deseja alterar: " );
                String id_old = input.nextLine();
                System.out.print( "Entre com o novo descricao: " );
                descricao = input.nextLine();
                
                if (dbproduto.alterar(id_old, descricao))
                	System.out.print(" Dados alterado com sucesso");
                else
                	System.out.print(" id que deseja alterar nao existe");
               break;
            
            case 4:  // Excluir
            	System.out.print( "Entre com o id que deseja excluir: " );
            	String id_ex = input.nextLine();
            	if (dbproduto.excluir(id_ex)) 
            		System.out.printf("\n Produto excluida com sucesso");          
            	else
            		System.out.printf("\n id não se encontra no banco de dados");
            	break;
            
            case 5:  // Listar Todos
            	System.out.println("\t  descricao \t  id ");  
            	for(int i=0; i<dbproduto.listar().length; i++) {
            		Produto plist = dbproduto.listar()[i];
            		if (plist != null) {
						String descricao_cons = plist.getDescricao();
						String id_cons = plist.getid();
						System.out.printf("\n\t %s", descricao_cons);
						System.out.printf("\t\t %s", id_cons);
            		}
            	}
               break;
            
            case 6:  // Encerrar
            	programa = false;
               break;
         }
      }     
   }
}