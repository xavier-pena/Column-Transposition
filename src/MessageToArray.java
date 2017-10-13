
import java.util.ArrayList;
import java.util.Scanner;


/**
 * 
 * @author xpena898
 *a lot 
 *of useless code to remove but it works
 *
 *remove: array list, transposition type (is the same as columns), fill array(nice try :/)
 *
 */

public class MessageToArray {
	
	private String message;
	private char [][] anArray;
	private int rows;
	private int columns;
	private int transpositionType;
	//private ArrayList<Character> letters = new ArrayList<Character>();//now unnecessary
	private String encryptedMessage;
	private String DecryptedMessage;
	
	
	public MessageToArray(String m, int t){
		
		message = m;
		transpositionType=t;
		
		
	}
	
	
	public void findRowsAndColumns(String eOrD){
		
		
		if(eOrD.equalsIgnoreCase("Encrypting")){
		
		Scanner read = new Scanner(message);
		read.useDelimiter("");
		
		int totalLetters = 0;
		
		
		while(read.hasNext()){
			
			
			//letters.add(read.next().charAt(0));//not necessary
			
			if(Character.isLetter(read.next().charAt(0))){
			totalLetters++;
			}
			System.out.print(totalLetters);//test Letter count
			
		}
		
		
		System.out.println("");
		int remainder = totalLetters % transpositionType;
		
		System.out.println("remainder: " + remainder);
		
		if (!(remainder == 0)){
		remainder = transpositionType - remainder;
		}
		
		System.out.println("new remainder: " + remainder);
		
		totalLetters+=remainder;
		rows = totalLetters/transpositionType;
		columns = transpositionType;//dont need to have both
		
		System.out.println("letter count: " + totalLetters);
		System.out.println("rows: " + rows);
		
		}
		
		
		else if (eOrD.equalsIgnoreCase("Decrypting")){//have to switch the rows and columns
			
			Scanner read = new Scanner(message);
			read.useDelimiter("");
			
			int totalLetters = 0;
			
			
			while(read.hasNext()){
				
				
				//letters.add(read.next().charAt(0));//not necessary
				
				if(Character.isLetter(read.next().charAt(0))){
				totalLetters++;
				}
				System.out.print(totalLetters);//test Letter count
				
			}
			
			
			System.out.println("");
			int remainder = totalLetters % transpositionType;
			
			//System.out.println("remainder: " + remainder);
			
			if (!(remainder == 0)){
			remainder = transpositionType - remainder;
			}
			
			//System.out.println("new remainder: " + remainder);
			
			totalLetters+=remainder;
			rows = totalLetters/transpositionType;
			columns = transpositionType;//dont need to have both
			
			
			//easy way to alternate
			columns = rows;
			rows = transpositionType;
		
			
			
			System.out.println("letter count: " + totalLetters);
			//System.out.println("rows: " + rows);
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	public void initializeArray(){//have to know total letters before you initialize array
		
		System.out.println(rows + " " + columns);//test if rows and columns are correct
		
		anArray = new char[rows][columns];
		
		
		Scanner in = new Scanner(message);
		
		
		in.useDelimiter("");
		
		
		int i=0;
		int j=0;
		
		while(in.hasNext()){
			
			
			System.out.print(i + "" + j);//test i and j
		
			
			anArray[i][j]=in.next().charAt(0);
			
			System.out.print(anArray[i][j]);//test if input
			
			
			
			j++;
			if(j >columns-1){
				i++;
				j=0;
				if (i > rows-1){
					
					j=0;
				}
			}
			
			
			
		
			
		}
		
		System.out.println("");
		System.out.println("");
		
	}//closes initialize
	
	
	
	
	
	public void displayEcryption(){
		
		System.out.println("");
		System.out.println("Your message:");
		
		for(int i = 0; i <rows; i ++){
			
			for(int j = 0; j < columns; j++ ){
				
				
				
				if(anArray[i][j] ==0){
					anArray[i][j]='x';
					
				}
				System.out.print(anArray[i][j]);
				
			}
			
			System.out.println("");
			
		}
		
		
		System.out.println("");
		System.out.println("Encrypted:");
		
		for(int i = 0; i <columns; i ++){
			
			for(int j = 0; j < rows; j++ ){
				
				
				System.out.print(anArray[j][i]);
				if(encryptedMessage == null){
				encryptedMessage = Character.toString(anArray[j][i]);
				}
				else
					encryptedMessage+=anArray[j][i];
				
				
			}
			
			//System.out.println("");

			
		}
		
		
		
		
		
	}//closes display
	
	
	
	
	
	
	
	public void displayDecryption(){
		
		System.out.println("");
		System.out.println("Your message:");
		
		for(int i = 0; i <rows; i ++){
			
			for(int j = 0; j < columns; j++ ){
				
				
				
				if(anArray[i][j] ==0){
					anArray[i][j]='x';
					
				}
				System.out.print(anArray[i][j]);
				
			}
			
			System.out.println("");
			
		}
		
		
		System.out.println("");
		System.out.println("Decrypted:");
		
		for(int i = 0; i <columns; i ++){
			
			for(int j = 0; j < rows; j++ ){
				
				
				
				System.out.print(anArray[j][i]);
				if(DecryptedMessage == null){
				DecryptedMessage = Character.toString(anArray[j][i]);
				}
				else
					DecryptedMessage+=anArray[j][i];
				
				
			}
				
			}
			
			//System.out.println("");

			
		
		
		
		
		
		
	}//closes display
	
	
	
	public String getEncryptedMessage(){
	
		return encryptedMessage;
	
	
	
	}
	public String getDecryptedMessage(){
		
		return DecryptedMessage;
	
	
	
	}
	
	
	
	

}
