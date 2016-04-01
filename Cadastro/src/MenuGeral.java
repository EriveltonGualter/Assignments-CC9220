import java.util.Scanner;

public class MenuGeral
{
   public static void main (String args[])
   {
      Scanner input = new Scanner(System.in);
      PessoaInterfaceTexto pessoaInterface = new PessoaInterfaceTexto();
      ProdutoInterfaceTexto produtoInterface = new ProdutoInterfaceTexto();
      PessoaDB dbpessoa = new PessoaDB();
      ProdutoDB dbproduto = new ProdutoDB();
      boolean programa = true;
      
      while(programa){
         System.out.println("\n\n\t MENU PRINCIPAL");
         System.out.println("\t 1 - Consultar Pessoa");
         System.out.println("\t 2 - Consultar Produto");
         System.out.println("\t 3 - Encerrar");
         
         switch( Integer.parseInt(input.nextLine()) ){
            case 1:  // Consultar Pessoa
            	pessoaInterface.PessoaInterface(dbpessoa);
               break;
            case 2:  // Consultar Produto
            	produtoInterface.ProdutoInterface(dbproduto);
               break;
            case 3:  // Encerrar
            	programa = false;
               break;
         }
      }     
   }
}

/* 
 * Criar função menu e passar a pessoa ou produto db 
 * Criar objetos apenas no menu geral de pessoab e produto db
 */