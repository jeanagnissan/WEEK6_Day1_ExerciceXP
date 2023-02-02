package Exercice4;

import java.util.HashMap;
import java.util.Map;


public class Scrabble {
	
	private static Map<String, Integer> letterScrable = new HashMap<String, Integer>();
	
	public Scrabble() {
		letterScrable.put("A", 1);
		letterScrable.put("E", 1);
		letterScrable.put("I", 1);
		letterScrable.put("O", 1);
		letterScrable.put("U", 1);
		letterScrable.put("L", 1);
		letterScrable.put("N", 1);
		letterScrable.put("R", 1);
		letterScrable.put("S", 1);
		letterScrable.put("T", 1);
		
		
		letterScrable.put("D", 2);
		letterScrable.put("G", 2);
		
		letterScrable.put("B", 3);
		letterScrable.put("C", 3);
		letterScrable.put("M", 3);
		letterScrable.put("P", 3);
		
		letterScrable.put("F", 4);
		letterScrable.put("H", 4);
		letterScrable.put("V", 4);
		letterScrable.put("W", 4);
		letterScrable.put("Y", 4);
		
		letterScrable.put("K", 5);
		
		letterScrable.put("J", 8);
		letterScrable.put("X", 8);
		
		letterScrable.put("Q", 10);
		letterScrable.put("Z", 10);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Scrabble().getScore("cabbage");
	}
	
	public static void getScore(String word) {
		int score = 0;
		for(int i = 0; i < word.length(); i++) {
			String key  = (word.charAt(i) + "").toUpperCase();
			if(letterScrable.containsKey(key)) {
				score += letterScrable.get(key);
			}
		}
		System.out.println("Le score est " + score);
	}
	
}

