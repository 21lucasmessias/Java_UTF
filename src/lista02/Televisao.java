package lista02;

public class Televisao {
	int canal;
	
	public void subirCanal() {
		canal = canal == 100 ? 0 : canal + 1;
	}
	
	public void descerCanal() {
		canal = canal == 0 ? 0 : canal - 1; 
	}

	@Override
	public String toString() {
		return "Televisao [canal=" + canal + "]";
	}
}
