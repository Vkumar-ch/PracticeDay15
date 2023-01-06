package PracticeDay15;

import java.util.Hashtable;
public class HashTable {
	
    public static void main(String[] args) {
	    String input = "To be or not to be";

	    // Split the input string into an array of words
	    String[] words = input.split(" ");

	    // Create a hashtable to store the word frequencies
	    Hashtable<String, Integer> wordCounts = new Hashtable<String, Integer>();

	    // Iterate through the array of words and count the frequency of each word
	    for (String word : words) {
	      word = word.toLowerCase(); // convert word to lowercase
	      if (wordCounts.containsKey(word)) {
	        // If the word has already been encountered, increment the count
	        wordCounts.put(word, wordCounts.get(word) + 1);
	      } else {
	        // If the word is encountered for the first time, set the count to 1
	        wordCounts.put(word, 1);
	      }
	    }

	    // Print out the word frequencies
	    for (String word : wordCounts.keySet()) {
	      System.out.println(word + ": " + wordCounts.get(word));
	    }
	  }


}
