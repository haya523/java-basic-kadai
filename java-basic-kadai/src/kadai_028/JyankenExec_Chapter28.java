package kadai_028;

import java.util.HashMap;
import java.util.Map;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        Jyanken_Chapter28 game = new Jyanken_Chapter28();

        // じゃんけんの手のMapを作成
        Map<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        String myChoice = game.getMyChoice();
        if (myChoice == null) {
            return; // 入力が不正な場合は終了
        }

        String opponentChoice = game.getRandom();

        game.playGame(myChoice, opponentChoice, handMap);
    }
}
