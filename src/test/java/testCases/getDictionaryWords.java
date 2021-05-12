package testCases;

import java.util.ArrayList;
import java.util.Scanner;

import org.testng.annotations.Test;

import utilities.Dictionary;
import utilities.EnglishWords;

public class getDictionaryWords {

	@Test
	public void getDictionaryWord() {

		Dictionary dict=new Dictionary();
		ArrayList<String> allWords = new ArrayList<String>() ;
		ArrayList<String> dictionaryWords = new ArrayList<String>() ;
		Scanner myObj=null;

		try {
			myObj = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter Albhabets to get words");
			String strInput = myObj.nextLine();  // Read user input

			//get all words possible
			allWords=EnglishWords.getWords(strInput);
			for(String s:allWords) {
				//check if words are dictionary words
				if(dict.isEnglishWord(s)) {
					dictionaryWords.add(s);

				}
			}
			if(dictionaryWords.size()==0) {
				System.out.println("No dictionary word available");
			}
			else {

				for(String s:dictionaryWords) {
					System.out.println(s);
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			myObj.close();	
		}



	}


}
