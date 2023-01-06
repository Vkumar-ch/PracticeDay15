package PracticeDay15;

   public class BinarySearch {
	
	    public static boolean binarySearch(String[] words, String word) {
			int low = 0;
			int high = words.length - 1;
			while (low <= high) {
				int mid = (low + high) / 2;
				int result = word.compareTo(words[mid]);
				if (result == 0) {
					return true;
				} else if (result < 0) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			return false;
		}

		public static void main(String[] args) {
			String[] words = { "Sai", "Mayur", "Shubham", "Vinod", "Prakash" };
			System.out.println(binarySearch(words, "Sai")); // true
			System.out.println(binarySearch(words, "Vinod")); // true
			System.out.println(binarySearch(words, "Kumar")); // false
			
		}
	

}
