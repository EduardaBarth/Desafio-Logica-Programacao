import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<String> produtos = new ArrayList<String>();
		Valores valores = new Valores();
		Metodos metodos = new Metodos();
		
		System.out.println("Produto: ");
		produtos.add(valores.produto = leitor.next());
		
		System.out.println("Valor: ");
		valores.preco = leitor.nextFloat();
		valores.valorT = valores.valorT + valores.preco;
		
		System.out.println("Deseja cadastrar outro produto? ");
		System.out.println("1- Sim || 2- Não");
		valores.resposta = leitor.nextInt();
		
		if (valores.resposta == 1) {
			for (int j = 0; j < 9; j++) {
				System.out.println("Produto: ");
				produtos.add(valores.produto = leitor.next());
				
				System.out.println("Valor: ");
				valores.preco = leitor.nextFloat();
				valores.valorT = valores.valorT + valores.preco;
				
				System.out.println("Deseja cadastrar outro produto? ");
				System.out.println("1- Sim || 2- Não");
				valores.resposta = leitor.nextInt();
				
				if (valores.resposta == 2) {
					j = 10;
				}
				if(j == 8) {
					System.out.println("!!!");
					System.out.println("Permitido cadastrar até 10 produtos");
					System.out.println("!!!");
					
					metodos.MostrarProdutos(produtos, valores.valorT);
					metodos.NotasMinimas(valores.valorT);
				}
			}
			if (valores.resposta == 2) {
				metodos.MostrarProdutos(produtos, valores.valorT);
				metodos.NotasMinimas(valores.valorT);
			}
		}else {
			metodos.MostrarProdutos(produtos, valores.valorT);
			metodos.NotasMinimas(valores.valorT);
		}
	}
}
