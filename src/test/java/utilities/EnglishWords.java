package utilities;

import java.util.ArrayList;

public class EnglishWords {

	public static ArrayList<String> possibleWords=new ArrayList<String>();

	//to generate all possible words from alphabets of a given string
	public static ArrayList<String> getWords(String str)
	{
		if(str.length()==1) {
			possibleWords.add(str);
		}
		else if(str.length()>1) {
			int lastIndex = str.length() - 1;

			String last = str.substring(lastIndex);

			String rest = str.substring(0, lastIndex);

			// Perform permutation on the rest string and
			// merge with the last character
			ArrayList<String> words=new ArrayList<String>();
			words = merge(getWords(rest), last);
			for (String s1 : words) {
				possibleWords.add(s1);
			}

		}

		ArrayList<String> listAfterDuplicateRemoval = new ArrayList<String>();

		// Traverse through the first list
		for (String item : possibleWords) {

			// If this element is not present in newList
			// then add it
			if (!listAfterDuplicateRemoval.contains(item)) {

				listAfterDuplicateRemoval.add(item);
			}
		}

		return listAfterDuplicateRemoval;


	}

	
	//to add character to all possible positions in string
	public static ArrayList<String> merge(ArrayList<String> list, String c) {

		ArrayList<String> result = new ArrayList<String>();

		for (String s : list) {

			// For each string, insert the last character to all possible positions
			// and add them to the new list
			for (int i = 0; i <= s.length(); ++i) {
				String possibleString = new StringBuffer(s).insert(i, c).toString();
				result.add(possibleString);
			}
		}
		result.add(c);
		return result;
	}


}
