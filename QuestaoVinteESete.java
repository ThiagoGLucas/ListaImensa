public class QuestaoVinteESete {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("escreva o preço de um produto: ");
		double a = ref.nextDouble();
		
		double porcentagem = a/100;
		
		if (a < 100) {
			System.out.println("O valor após a inflação é igual a: " + ((porcentagem * 10) + a));
		} else if ( a >= 100) {
			System.out.println("O valor após a inflação é igual a: " + ((porcentagem * 20) + a));
		}
	}
}
