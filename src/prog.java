import java.util.Scanner;
public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		float sal;
		String nome;

		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.println("Nome do cliente:");
		nome = sc.nextLine();
		System.out.println("Salario:");
		sal = sc.nextFloat();
		
		while (sal < 0) {
			System.out.println("Salário inválido, digite outro valor");
			sal = sc.nextFloat();}
		
		
		sc.close();
	}

}
