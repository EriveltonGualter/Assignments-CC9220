import java.util.Scanner;

public class PessoaInterfaceTexto
{
   public void PessoaInterface (PessoaDB dbpessoa)
   {
      Scanner input = new Scanner(System.in);
      String cpf;
      String nome;
      String d;
      String m;
      String a;
      Pessoa pessoa = new Pessoa();
      boolean programa = true;
      	
      while(programa){
         System.out.println("\n\n\t CONSULTA PESSOA");
         System.out.println("\t 1 - Incluir");
         System.out.println("\t 2 - Consultar");
         System.out.println("\t 3 - Alterar");  // Alterar apenas o nome
         System.out.println("\t 4 - Exluir");   // Atribuir null na posição
         System.out.println("\t 5 - Listar todos");
         System.out.println("\t 6 - Encerrar");
         
         switch( Integer.parseInt(input.nextLine()) ){
            case 1:  // Incluir
               System.out.print( "Entre com o CPF: " );
               cpf = input.nextLine();
               System.out.print( "Entre com o nome: " );
               nome = input.nextLine();
               System.out.print( "Entre com a Data de nascimento:\n " );
               System.out.print( "\n Dia: " );
               d = input.nextLine();
               System.out.print( "\n Mes: " );
               m = input.nextLine();
               System.out.print( "\n Ano: ");
               a = input.nextLine();
               
               Data data = new Data(Integer.parseInt(d),Integer.parseInt(m),Integer.parseInt(a));
               if(dbpessoa.incluir(cpf,nome,data))
                  System.out.println("\nPessoa Incluida com sucesso");
               else
                  System.out.print( "\n\n	falha na inclusão \n\n	Pessoa já existente" );
               break;
               
            case 2:  // Consultar
               System.out.print( "Entre com o CPF: " );
               cpf = input.nextLine();
               pessoa = dbpessoa.consultar(cpf);
               if (pessoa != null) {
            	   String nome_cons = pessoa.getNome();
            	   String cpf_cons = pessoa.getCpf();
            	   String data_cons = pessoa.getData();
            	   String dias = pessoa.getDias();
            	   System.out.printf("\n nome : %s", nome_cons);
            	   System.out.printf("\n CPF  : %s", cpf_cons);
            	   System.out.printf("\n Data de Nascimento  : %s", data_cons);
            	   System.out.printf("\n Dias ate a data atual : %s", dias);
               }
               else {
                  System.out.print( "\nPessoa não existente" );
               }
               break;
               
            case 3:  // Alterar
            	System.out.print( "Entre com o CPF que deseja alterar: " );
                String cpf_old = input.nextLine();
                System.out.print( "Entre com o novo nome: " );
                nome = input.nextLine();
                
                if (dbpessoa.alterar(cpf_old, nome))
                	System.out.print(" Dados alterado com sucesso");
                else
                	System.out.print(" CPF que deseja alterar nao existe");
               break;
            
            case 4:  // Excluir
            	System.out.print( "Entre com o CPF que deseja excluir: " );
            	String cpf_ex = input.nextLine();
            	if (dbpessoa.excluir(cpf_ex)) 
            		System.out.printf("\n Pessoa excluida com sucesso");          
            	else
            		System.out.printf("\n CPF não se encontra no banco de dados");
            	break;
            
            case 5:  // Listar Todos
            	System.out.println("\t  Nome \t  CPF \t Data \t total de Dias");  
            	for(int i=0; i<dbpessoa.listar().length; i++) {
            		Pessoa plist = dbpessoa.listar()[i];
            		if (plist != null) {
						String nome_cons = plist.getNome();
						String cpf_cons = plist.getCpf();
						String data_cons = plist.getData();
						String dias_cons = plist.getDias();
						System.out.printf("\n\t %s", nome_cons);
						System.out.printf("\t\t %s", cpf_cons);
						System.out.printf("\t\t %s", data_cons);
						System.out.printf("\t\t %s dias", dias_cons);
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