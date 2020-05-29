import java.util.Scanner;
public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		int prest;	
		double sal, entrada, totalf, aux, valprest;
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
	    entrada = sc.nextDouble();
	    System.out.println("Volor total financiado:");
	    totalf = sc.nextDouble();
	    valprest = totalf / prest;
	    aux =  30 * sal / 100;
	    while (valprest > aux) {
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
		    entrada = sc.nextDouble();
		    System.out.println("Volor total financiado:");
		    totalf = sc.nextDouble();
		    aux =  30 * sal / 100;
	    }
	    // fim valor prestações
		sc.close();
	}

}
