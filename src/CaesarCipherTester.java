import java.util.Scanner;

public class CaesarCipherTester {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(" This program encrypts and decrypts messages using the Caecar Cipher."
				+ "\n Would you like to encode or decode a message?");
		
		String response = in.nextLine();
		
		if (response.equals("decode") || response.equals("encode"))	{
			
			
				
				if(response.equals("encode")) {
					Scanner scan=new Scanner(System.in);
					
					System.out.println("Enter the string to encode: ");
					
					String str=in.nextLine();
					
					if(CaesarCipher.isThisLowerCase(str)) {
					
			for (int z=0; z<26;z++) {
				
			System.out.println("n=" + z + ": " + CaesarCipher.encrypt(str,z)+ '\n');
			
			}
				}
					else {
						System.out.println("String must consist of lowercase characters only");
					}
				}
				else {
					Scanner scan=new Scanner(System.in);
					
					System.out.println("Enter the string to decode: ");
					
					String str=in.nextLine();
					
					
					for (int r=0; r<26;r++) {
						
						System.out.println("n=" + r + " " + CaesarCipher.decrypt(str,r)+ '\n');
						
						}
				}
		}
			
		else {
			
			System.out.println("Valid options are encode or decode");
		
		}
	
	}
	
}
