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
			System.out.println("Sal�rio inv�lido, digite outro valor");
			sal = sc.nextFloat();
			}
		//valor do numero de presta��es
	    System.out.println("Digite o n�mero de presta��es:");
	    prest = sc.nextInt();
	    System.out.println("Porcentagem da entrada:");
	    entrada = sc.nextDouble();
	    System.out.println("Volor total financiado:");
	    totalf = sc.nextDouble();
	    valprest = totalf / prest;
	    aux =  30 * sal / 100;
	    while (valprest > aux) {
	    	System.out.println("Valor da presta��o excede 30% do sal�rio, insira novos valores");
	    	System.out.println("Salario:");
			sal = sc.nextDouble();
			
			while (sal < 0) {
				System.out.println("Sal�rio inv�lido, digite outro valor");
				sal = sc.nextFloat();
				}
			//valor do numero de presta��es
		    System.out.println("Digite o n�mero de presta��es:");
		    prest = sc.nextInt();
		    System.out.println("Porcentagem da entrada:");
		    entrada = sc.nextDouble();
		    System.out.println("Volor total financiado:");
		    totalf = sc.nextDouble();
		    aux =  30 * sal / 100;
	    }
	    // fim valor presta��es
		sc.close();
	}

}
