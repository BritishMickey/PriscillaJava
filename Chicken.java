public class Chicken{
	private int Scratch;
	
	public Chicken(){
		Scratch = 0;
	}

	public Chicken(int claw){
		Scratch = claw;
	}

	public String toString(){
		return "Scratch";
	}

	public static void main(String[] args) {
		Chicken c = new Chicken();
		Chicken C = new Chicken("rooster"); 
	}
}

