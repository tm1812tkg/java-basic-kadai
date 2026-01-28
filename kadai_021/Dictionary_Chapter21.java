package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	HashMap<String, String> fruit = new HashMap<String, String>();

	public Dictionary_Chapter21() {
		fruit.put("apple", "りんご");
		fruit.put("peach", "桃");
		fruit.put("banana", "バナナ");
		fruit.put("lemon", "レモン");
		fruit.put("pear", "梨");
		fruit.put("kiwi", "キウィ");
		fruit.put("strawberry", "いちご");
		fruit.put("grape", "ぶどう");
		fruit.put("muscat", "マスカット");
		fruit.put("cherry", "さくらんぼ");
	}

    
    public void searchWords(String[] words) {
        for (String word : words) {
            String result = fruit.get(word);

            if (result != null) {
                System.out.println(word + "の意味は" + result);
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }

}