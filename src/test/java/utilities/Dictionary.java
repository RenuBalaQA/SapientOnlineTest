package utilities;

public class Dictionary {

	//returns true if the Word is available in English dictionary
	public boolean isEnglishWord(String Word) {

		//Dummy dictionary
		String dict[] = { "this","that","cat","rat","mat","dad","find","a","i","java","program","at","is","am","dam" } ;

		int flag=0;
		for(int i=0;i<dict.length;i++) {
			if(Word.equalsIgnoreCase(dict[i]))
			{				
				flag=1;
			}

		}
		if (flag==1) 
			return true;
		else 
			return false;

	}
}

