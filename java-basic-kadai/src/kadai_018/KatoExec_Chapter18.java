package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		 // 太郎
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        taro.setFamilyName("加藤");
        taro.setAddress("東京都中野区〇×");
        taro.setGivenName();
        taro.execIntroduce();

        // 一郎
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        ichiro.setFamilyName("加藤");
        ichiro.setAddress("東京都中野区〇×");
        ichiro.setGivenName();
        ichiro.execIntroduce();

        // 花子
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        hanako.setFamilyName("加藤");
        hanako.setAddress("東京都中野区〇×");
        hanako.setGivenName();
        hanako.execIntroduce();
    }
}
