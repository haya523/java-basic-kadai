package kadai_028;

import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分の手を入力
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String input = scanner.nextLine().toLowerCase();

        if (!input.equals("r") && !input.equals("s") && !input.equals("p")) {
            System.out.println("無効な入力です。r, s, p のいずれかを入力してください。");
            return null;
        }

        return input;
    }

    // 対戦相手の手を乱数で選ぶ
    public String getRandom() {
        int random = (int)(Math.random() * 3);
        switch (random) {
            case 0: return "r";
            case 1: return "s";
            case 2: return "p";
            default: return null;
        }
    }

    // じゃんけんの勝負を行う
    public void playGame(String myChoice, String opponentChoice, Map<String, String> handMap) {
        // 手の表示
        System.out.println("自分の手は" + handMap.get(myChoice) + ", 対戦相手の手は" + handMap.get(opponentChoice));

        // 勝敗判定
        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
