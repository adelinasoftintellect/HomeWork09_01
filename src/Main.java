import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		String[] words = { "yes", "hello", "black", "red", "word", "no", "red", "zebra", "yes", "network", "red",
				"rabbit", "red", "network", "programming", "red", "word", "red", "black", "blue" };

		Map<String, Integer> wordsCount = new HashMap<String, Integer>();
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0;
			}
			wordsCount.put(word, count + 1);
		}

		Set<String> wordKeys = wordsCount.keySet();
		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			System.out.println(word + " -> " + count + " times");
		}
	}
}
