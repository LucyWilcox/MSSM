import java.io.Console;
import java.util.Scanner;

public class Hangman {
	static Scanner sc=new Scanner (System.console().reader());
	static boolean doner;
	static String correct = "";
	static String gallows = "";
	static boolean match = false;
	static int numwrong;
	
	public static void main(String args[]){
		
		
		String theWord=chooseWord();
		
		while(doner==false){
			
			char theLetter=guessLetter();
			boolean tfMatch=testIt(theWord, theLetter);
			String theCorrect=correctLetters(tfMatch, theLetter);
			int theNumWrong=gallow(theLetter, tfMatch);
			int theNumLeft=countWrongGuesses(theNumWrong);
			String theKnown=soFar(theCorrect,theWord);
			boolean theDone=done(theNumWrong, theWord);
			boolean theDonet=donet(theKnown, theWord);
		
			
			//System.out.println(tfMatch? "true":"false");
			//System.out.println(theWord);
			//System.out.println(theLetter);
			System.out.println("You have:"+theNumLeft+" guesses left");
			System.out.println(theKnown);
	
		}
	}

	public static String chooseWord(){
		System.out.println("Player two enter a word:");
		String word=sc.nextLine();

		
		
		word=word.toUpperCase();
		//System.out.println(word);
	

		return word;
	}
	
	
	public static char guessLetter(){
		
		System.out.println("Player one guess a letter:");
		String sletter=sc.nextLine();
		
		char letter=sletter.charAt(0);
		
		
		letter=Character.toUpperCase(letter);
		
	
		
		return letter;
	}
	
	public static boolean testIt(String word, char letter){
		
		
		for(int c= 0; c<word.length(); c++){
			char actual=word.charAt(c);
			
			match=false;
			
			if(actual==letter){
				match=true;
				return match;
			
			}
			
		}
		return match;
	}
	
	public static String correctLetters(boolean match, char letter){
		
		
		if(match==true){
		correct= correct+letter;
		
		}
		
		
		return correct;
	}
	
	
	public static int gallow(char letter, boolean match){
		
		
		
		if(match==false){
		
		gallows= gallows+letter;
		
		numwrong=gallows.length();
		
		}
		
		numwrong=gallows.length();
		return numwrong;
		
		
	}
	
	public static int countWrongGuesses(int numwrong){
		int numguesses=6;
		
		int numleft=numguesses-numwrong;
		
		
		return numleft;
	}
	

	
	public static String soFar(String correct, String word){
		
		int length= word.length();
		int clength=correct.length();
		String known="";
		for(int c=0;c<length;c++){
			boolean addit=false;
			char cletter=word.charAt(c);
			
			for(int p=0; p<clength; p++){
				char gletter=correct.charAt(p);
				
				
				if(gletter==cletter){
					addit=true;
					}

			
				}
			if(addit==true){
				known=known+cletter;
			}
			
			if(addit==false){
				known=known+" _";
			}
		}
		
		
		return known;
	}
	
	public static boolean done(int numwrong, String word){
		
		if(numwrong>=6){
			doner=true;
			System.out.println("You lost, the word was:"+word);
			return doner;
		}
		return doner;
	}
	
	public static boolean donet(String known, String word){
		if(known.compareTo(word)==0){
			System.out.println("You won!");
			doner=true;
			
			return doner;
		}
		
		return doner;
	}
	
	
}


