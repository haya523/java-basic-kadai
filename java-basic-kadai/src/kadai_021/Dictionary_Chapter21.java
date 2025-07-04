package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    // 辞書の定義（キー：英単語、値：日本語訳）
    private HashMap<String, String> dictionary;

    // コンストラクタ：辞書に10語を追加
    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 単語を検索し結果を返す
    public String searchWord(String word) {
        if (dictionary.containsKey(word)) {
            return word + "の意味は" + dictionary.get(word) + "です。";
        } else {
            return word + "は辞書に存在しません。";
        }
    }
}
