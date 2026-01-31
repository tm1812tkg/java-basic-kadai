package kadai_018;

abstract public class Kato_Chapter18 {

	String familyName = "加藤";
	String givenName;
	String address = "住所は東京都中野区〇×です";



	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
	}

	abstract public void eachIntroduce();

	public void execIntroduce() {
		commonIntroduce();
		System.out.println(address);
		eachIntroduce();
	}
}
