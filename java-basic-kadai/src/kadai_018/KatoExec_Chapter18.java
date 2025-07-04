package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		 // 加藤太郎
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        taro.familyName = "加藤";
        taro.address = "東京都中野区〇×";
        taro.setGivenName();
        taro.execIntroduce();

        // 加藤一郎
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        ichiro.familyName = "加藤";
        ichiro.address = "東京都中野区〇×";
        ichiro.setGivenName();
        ichiro.execIntroduce();

        // 加藤花子
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        hanako.familyName = "加藤";
        hanako.address = "東京都中野区〇×";
        hanako.setGivenName();
        hanako.execIntroduce();
    }
}	