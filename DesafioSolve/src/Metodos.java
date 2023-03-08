import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

	Valores valores = new Valores();
	
	public void MostrarProdutos(ArrayList<String> produtos, float valorT) {
		valores.valorT = valorT;
		
		System.out.println("----------------------------");
		System.out.println("Produtos do carrinho:");
		for (int i2 = 0; i2 < produtos.size(); i2++) {
			System.out.println(produtos.get(i2));
		}
		
		System.out.println("----------------------------");
		System.out.println("Valor total: " + valores.valorT);
		System.out.println("----------------------------");
		System.out.println("Deve ser, no minímo, nessas notas: ");
	}
	
	public void NotasMinimas(float valorT) {
		valores.valorT = valorT;
		int nota50;
		int nota20;
		int nota10;
		int nota5;
		int nota1;
		if(valorT >= 100) {
			int nota100 = (int)valorT/100;
			System.out.println(nota100 + "de notas de 100");
			if (valorT%100 > 0) {
				float resto100 = (int)valorT%100;
				nota50 = (int) (resto100/50);
				System.out.println(nota50 + "de notas de 50");
				if (resto100%50 > 0) {
					float resto50 = resto100%50;
					nota20 = (int) (resto50/20);
					System.out.println(nota20 + "de notas de 20");
					if (resto50%20 > 0) {
						float resto20 = resto50%20;
						nota10 = (int) (resto20/10);
						System.out.println(nota10 + "de notas de 10");
						if (resto20%10 > 0) {
							float resto10 = resto20%10;
							nota5 = (int) (resto10/5);
							System.out.println(nota5 + "de notas de 5");
							if (resto10%5 > 0) {
								float resto5 = resto10%5;
								nota1 = (int) (resto5/1);
								System.out.println(nota1 + "de notas de 1");
							}
						}
					}
				}
			}
		}else {
			nota50 = (int) (valorT/50);
			System.out.println(nota50 + "de notas de 50");
			if (valorT%50 > 0) {
				float resto50 = valorT%50;
				nota20 = (int) (resto50/20);
				System.out.println(nota20 + "de notas de 20");
				if (resto50%20 > 0) {
					float resto20 = resto50%20;
					nota10 = (int) (resto20/10);
					System.out.println(nota10 + "de notas de 10");
					if (resto20%10 > 0) {
						float resto10 = resto20%10;
						nota5 = (int) (resto10/5);
						System.out.println(nota5 + "de notas de 5");
						if (resto10%5 > 0) {
							float resto5 = resto10%5;
							nota1 = (int) (resto5/1);
							System.out.println(nota1 + "de notas de 1");
						}
					}
				}
			}
		}
	}
	
}
