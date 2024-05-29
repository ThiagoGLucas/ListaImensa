public class QuestaoVinteETres {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite um comprimento em metros: ");
		double a = ref.nextDouble();
		
		double cm = a * 100;
		double mm = a * 1000;
		
		System.out.println("O comprimento indicado corresponde a: " + cm + " centímetros " + " e " + mm + " milimetros" );
	}
}
