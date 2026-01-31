package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {

		Jyanken_Chapter28 jyannken = new Jyanken_Chapter28();

	
		String myChoice = jyannken.getMyChoice();
		
		String cpuChoice = jyannken.getRandom();
		jyannken.playGame(myChoice, cpuChoice);
	}
}
