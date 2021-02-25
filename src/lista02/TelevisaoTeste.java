package lista02;

public class TelevisaoTeste {
	public static void main(String[] args) {
		Televisao televisao1 = new Televisao();
		
		System.out.println(televisao1);
		
		televisao1.subirCanal();
		System.out.println(televisao1);

		televisao1.subirCanal();		
		System.out.println(televisao1);

		televisao1.descerCanal();
		
		System.out.println(televisao1);
		televisao1.descerCanal();
		
		System.out.println(televisao1);
	}
}
