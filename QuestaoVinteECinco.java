public class QuestaoVinteECinco {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em Farenheit: ");
		int a = ref.nextInt();
		
			System.out.println("A temperatura em celsius é igual a: " + ((a - 32) / 1.8));
		}
		
	}
