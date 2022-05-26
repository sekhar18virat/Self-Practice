

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PuzzleAndWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given a set of words and set of puzzle words. 
//	 For a particular given puzzle word we need to find the number of words that satisfy the given condition
//		The first character of the puzzle word should be present in the word.
//		All the characters of the word should be present in the puzzle word.
//		No characters other than puzzle word characters should be present.
//		Let us consider the set of the words as follows 
		
		List<String> words = new ArrayList<>();
		words.add("aaaa");
		words.add("abcd");
		words.add("aghi");
		words.add("bcda");
		
//		Let us consider the puzzle words as follows
		List<String> puzzleWords = new ArrayList<>();
		puzzleWords.add("abdgc");
		puzzleWords.add("cagh");
		
//		Approach : 
		
//		 For the given list of words we are going to mask them by mapping them to a-z.
//		if the character is present then we mark it as 1 else zero and then we store the values in the hashmap. that 
//		has all characters and words that contains the characters. 
		findWordsCountForPuzzle(words, puzzleWords);
	}

	private static void findWordsCountForPuzzle(List<String> words, List<String> puzzleWords) {
		// TODO Auto-generated method stub
//		hashMap to store the words that store the bit masking of the words to certain character
		Map<Character, Set<Integer>> charWordMapping = new HashMap<>();
//		Storing the values from a to z in the hashMap
		for(int i = 0; i < 26; i++) {
			charWordMapping.put((char) ('a' + i), new HashSet<Integer>());
		}
//		Iterating the word list 
		for(String word : words) {
//			integer to store the mask value 
			int mask = 0;
//			Iterating the character by character to store the mask value 
			for(char ch : word.toCharArray()) {
				int bit = ch - 'a';
				mask = mask | 1 << bit;
			}
//			Adding the mask to the correspodning character 
			for(char ch : word.toCharArray()) {
				Set<Integer> mapValues = charWordMapping.get(ch);
				mapValues.add(mask);
				charWordMapping.put((char)ch, mapValues);
			}
		}
//		System.out.println(charWordMapping.toString());
////		Arraylist to store the string and its corresponding count 
//		map to store the puzzle word and its count
		Map<String, Integer> puzzleWordCount = new HashMap<>();
		for(String word : puzzleWords) {
			int count = 0;
			int mask = 0;
//			calculating the mask for the puzzle word
			for(char ch : word.toCharArray()) {
				int bit = ch - 'a';
				mask|= 1 << bit;
			}
//			obtaining the set that has starting character of the puzzle 
			Set<Integer> wordMasks = charWordMapping.get(word.charAt(0));
//			Iterating the set and finding the mask and integer value to get the count
			for(Integer i : wordMasks) {
				if((mask & i) == i) {
					count+=1;
				}
			}
			puzzleWordCount.put(word, count);
		}
//		printing the value
		System.out.println(puzzleWordCount.toString());
	}

}
