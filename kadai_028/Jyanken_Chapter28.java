package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	HashMap<String, String> hand = new HashMap<String, String>();

	public Jyanken_Chapter28() {

		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
	}

	public String getMyChoice() {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			String input = scanner.next();

			if (input.equals("r") || input.equals("s") || input.equals("p")) {

				System.out.println(input);
				scanner.close(); //returnより先にクローズする
				return input;

			} else {
				System.out.println("r s p から選択してください");
				continue;
			}
		}
	}

	public String getRandom() {

		String[] hands = { "r", "s", "p" };

		String cpuHand = hands[(int) Math.floor(Math.random() * 3)];

		return cpuHand;
	}

	public void playGame(String myChoice, String cpuChoice) {

		String myHand = hand.get(myChoice);
		String cpuHand = hand.get(cpuChoice);

		//自分手と相手の手を出力
		System.out.println("自分の手は" + myHand + ",対戦相手の手は" + cpuHand);

		//自分の手と相手の手を比較してじゃんけんの結果を出力
		if (myChoice.equals("s") && cpuChoice.equals("p") ||
				myChoice.equals("r") && cpuChoice.equals("s") ||
				myChoice.equals("p") && cpuChoice.equals("r")) {
			System.out.println("自分の勝ちです");
		} else if (myChoice.equals("s") && cpuChoice.equals("s") ||
				myChoice.equals("r") && cpuChoice.equals("r") ||
				myChoice.equals("p") && cpuChoice.equals("p")) {
			System.out.println("あいこです");
		} else {
			System.out.println("自分の負けです");
		}

	}
}