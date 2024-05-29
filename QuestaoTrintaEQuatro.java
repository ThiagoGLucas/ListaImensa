public class QuestaoTrintaEQuatro {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = ref.nextLine();
		
		System.out.println("Digite o nome da sua rua: ");
		String rua = ref.nextLine();
		
		System.out.println("Digite seu numero de telefone: ");
		String telefone = ref.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = ref.nextInt();
		
		System.out.println("Seu nome é: " + nome + ", você tem: " + idade + " anos," + " mora na rua: " + rua + " e seu telefone é : " + telefone);

	}
}
