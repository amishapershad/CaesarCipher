import java.util.Scanner;

public class CaesarCipher {
	/*
	   * TODO: define two methods that convert
	   * a character to a character code and vice versa.
	   * Note that the character code needs to be in
	   * range 0-25. 
	   */

	  /*
	   * TODO: define a method that performs the
	   * modulo operation. This method needs to 
	   * handle positive and negative integers 
	   * after shifting. 
	   */

	  /*
	   * TODO: define two methods for encrypting
	   * and decrypting characters using a given constant integer. 
	   * These methods make calls to the methods explained 
	   * above.  
	   */
	
	//public static String result;
	
	
	public static int alphToNum(char s) {
		int base=(int)'a';
		int convertedint= (int) s;
		return convertedint-base;
	}
	
	public static char numToAlph(int mychar) {
		int base1=(int)'a';
		int thischar=mychar+base1;
		char convertedChar= (char) thischar;
		return convertedChar;
	}
	
	
	
	
	public static String encrypt (String s, int x) {
		
		int i = 0;
		
		
		s.toCharArray();
		
		StringBuilder result= new StringBuilder();
		
			
				
				
				for(i=0; i< s.length(); i++) {
					
					int converted= alphToNum(s.charAt(i));
					
					
					int encoded= ((converted + x) % 26 );
					
					char encoded2 = numToAlph(encoded);
					
					result.append(encoded2);
					
					
				}
			
		
		return result.toString();
		
	}
	
	public static String decrypt (String str, int y) {
		
		int i = 0;
		
		str.toCharArray();
		
		StringBuilder newResult= new StringBuilder();
		
			
				
				
				for(i=0; i< str.length(); i++) {
					
					int deconverted= alphToNum(str.charAt(i));
					int base2=(int)'a';
					int decoded=0;
					
					if(((deconverted - y ) % 26  )<0) {
						decoded= ((deconverted - y + 26) % 26  );
					}
					
					else {
						decoded= ((deconverted - y ) % 26  );
					}
					//System.out.println(decoded);
					//char encoded2 = numToAlph(encoded + base);
					char decoded2 = numToAlph(decoded);
					
					newResult.append(decoded2);
					
					
				}
			
		
		return newResult.toString();
		
	}
	
	 public static boolean isThisLowerCase(String mystr){
	        
	        
	        char[] myArray = mystr.toCharArray();
	        
	        for(int i=0; i < myArray.length; i++){
	            
	            
	            if(!Character.isLowerCase( myArray[i] ))
	                return false;
	        }
	        
	        return true;
	 
	  }
	 
	 /*
	  Referenced 'Java Code examples' while writing isThisLowerString 
	  */
	
	
	
}
