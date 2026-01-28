package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {

		Dictionary_Chapter21 dic = new Dictionary_Chapter21();

		String[] words = { "apple", "banana", "grape", "orange" };

		for (String word : words) {
			String result = dic.fruit.get(word);

			if (result != null) {
				System.out.println(word + "の意味は" + result);
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}

	}

}
