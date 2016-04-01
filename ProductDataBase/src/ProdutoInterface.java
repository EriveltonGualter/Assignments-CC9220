import java.util.Scanner;

public class ProdutoInterface {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		ProdutoDB listproduto = new ProdutoDB();
		
		String codigo;
		String descricao;
		String preco;
		
		Produto produto = new Produto();
		
		boolean running = true;
		
		while (running){
			System.out.println("\n\n-------------- INTERFACE --------------");
			System.out.println("\t\t 1 - Incluir");
			System.out.println("\t\t 2 - Consultar");
			System.out.println("\t\t 3 - Excluir");
			System.out.println("\t\t 4 - ALterar");
			System.out.println("\t\t 5 - EXIT");
			
			switch(Integer.parseInt(input.nextLine())){
			case 1:
				System.out.println("Entre com codigo: ");
				codigo = input.nextLine();
				System.out.println("Entre com a descricao");
				descricao = input.nextLine();
				System.out.println("Entre com o preco");
				preco = input.nextLine();
				
				if(listproduto.incluir(codigo, descricao, preco)) {
					System.out.println("Inserido com sucesso");
					System.out.println("Codigo: " + codigo);
					System.out.println("Descricao: " + descricao);
					System.out.println("Preco: " + preco);
				}
				else
					System.out.println("ERROR - Codigo ja foi inserido");
				break;
			case 2:
				System.out.println("Consultar codigo: ");
				codigo = input.nextLine();
				produto = listproduto.consultar(codigo);
				if (produto != null) {
					System.out.println("Codigo: " + produto.getCodigo());
					System.out.println("Descricao: " + produto.getDescricao());
					System.out.println("Preco: " + produto.getPreco());
				}
				else
					System.out.println("Produto nao existe");
				break;
			case 3:
				System.out.println("Qual codigo deseja excluir");
				codigo = input.nextLine();
				if(listproduto.excluir(codigo))
					System.out.println("Produto " + codigo + " excluido com sucesso");
				else
					System.out.println("ERROR - produto nao existe");
				break;
			case 4:
				System.out.println("Qual produto deseja alterar: ");
				codigo = input.nextLine();
				System.out.println("Entre com a descricao");
				descricao = input.nextLine();
				System.out.println("Entre com o preco");
				preco = input.nextLine();
				if (listproduto.alterar(codigo, descricao, preco))
					System.out.println("Produto Alterado com sucesso");
				else
					System.out.println("ERROR - Produto nao existe");
				break;
			case 5:
				running = false;
				break;
			}
		}
	}
}
