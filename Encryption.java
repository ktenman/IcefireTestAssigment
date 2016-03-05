package ee.icefire.test;

public class Encryption {

	protected static String encrypt(String firstName, String lastName) {
		
		String name = firstName + lastName, key = firstName, encryptedName = "";

    	for (int i = 0; i < name.length(); i++) {
    		int encryptedCharecter = (int) key.charAt(i % key.length());
    		int character = (int) name.charAt(i);
    		int secretNumber = name.length() * 14 + 8;
    		encryptedName += (encryptedCharecter + character) % secretNumber + ", ";
    	}
		return encryptedName.substring(0, encryptedName.length()-2);
	}
	
	protected static String decrypt(String encryptedName, String key) {
		String[] stringSplit = encryptedName.split(", ");
		int[] numbers = new int[stringSplit.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(stringSplit[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			int encryptedCharecter = (int) key.charAt(i % key.length());
			int charecter = (int) numbers[i];
			int decryptedCharacter = charecter - encryptedCharecter;
			if (decryptedCharacter < 0) {
				decryptedCharacter = (((decryptedCharacter % 232) + 232) % 232);
			} else {
				decryptedCharacter = decryptedCharacter % 232;
			}
		numbers[i] = decryptedCharacter;
		}
		String decrypted = "";
		for (int i: numbers) {
			decrypted += (char) i;
		}
		return decrypted;
	}
	
}
