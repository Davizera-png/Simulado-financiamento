import java.util.Scanner;
public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		int prest, opcao, entrada;	
		double sal, totalf, aux, valprest, valentra, valfin, prestfinal;
		String nome;

		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.println("Nome do cliente:");
		nome = sc.nextLine();
		System.out.println("Salario:");
		sal = sc.nextDouble();
		
		while (sal < 0) {
			System.out.println("Salário inválido, digite outro valor");
			sal = sc.nextFloat();
			}
		//valor do numero de prestações
	    System.out.println("Digite o número de prestações:");
	    prest = sc.nextInt();
	    System.out.println("Porcentagem da entrada:");
	    entrada = sc.nextInt();
	    System.out.println("Volor total financiado:");
	    totalf = sc.nextDouble();
	    valprest = totalf / prest;
	    aux = totalf * (100 - entrada) / 100.0 / prest ;
	    while (aux > 0.3 * sal) {
	    	System.out.println("Valor da prestação excede 30% do salário, insira novos valores");
	    	System.out.println("Salario:");
			sal = sc.nextDouble();
			
			while (sal < 0) {
				System.out.println("Salário inválido, digite outro valor");
				sal = sc.nextFloat();
				}
			//valor do numero de prestações
		    System.out.println("Digite o número de prestações:");
		    prest = sc.nextInt();
		    System.out.println("Porcentagem da entrada:");
		    entrada = sc.nextInt();
		    System.out.println("Volor total financiado:");
		    totalf = sc.nextDouble();
		    aux = totalf * (100 - entrada) / 100.0 / prest ;
	    }
	    // fim valor prestações
	    //processo menu
	    valentra = entrada * totalf / 100;
	    valfin = totalf - entrada;
	    prestfinal = totalf - valentra / prest;
	     do {
	    	 System.out.println("Menu: ");
		    	System.out.println("1 - Mostrar o valor da entrada");
		    	System.out.println("2 - Mostrar o valor finnanciado");
		    	System.out.println("3 - Mostrar o valor de cada prestação");
		    	System.out.println("4 - Sair");
		    	opcao = sc.nextInt();
		    	if (opcao < 0 && opcao > 4) {
		    		System.out.println("Opção inválida, insira uma opção válida");
		    		} else if (opcao == 1) {
		    						    		System.out.println("ENTRADA = R$ "+ valentra);
			    		
			    		} else if (opcao == 2) {
				    		System.out.println("VALOR FINANCIADO = R$ "+ valfin);
				    		} else if (opcao == 3) {
					    		System.out.println("VALOR DE CADA PRESTAÇÃO = R$ "+ prestfinal);
					    		}
		    	
	     }
	    while (opcao != 4);

	    
		sc.close();
	}

}
