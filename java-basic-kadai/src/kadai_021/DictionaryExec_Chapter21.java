package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // 辞書インスタンス生成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる英単語（課題で指定の4語）
        String[] wordsToSearch = {"apple", "banana", "grape", "orange"};

        // 繰り返し：単語を検索して結果を出力（フロー図通り）
        for (String word : wordsToSearch) {
            String result = dictionary.searchWord(word);
            System.out.println(result);
        }
    }
}
