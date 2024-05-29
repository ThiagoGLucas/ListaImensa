public class QuestaoVinteESeis {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int a = ref.nextInt();
		
		System.out.println("Digite outro numero inteiro: ");
		int b = ref.nextInt();
		
		int soma = a + b;
			System.out.println("A soma dos dois números é igual a: " + soma);
			
			System.out.println("O produto do primeiro numero multiplicado pelo quadrado do segundo é igual a: " + (b * b) * a);
		
			System.out.println("O quadrado do primeiro numero é igual a: " + (a*a));

			System.out.println((Math.sqrt((a * a) + (b * b))));
			
			System.out.println(Math.sin(a-b));
			
			System.out.println(Math.abs(a));
			
		}
		
	}
