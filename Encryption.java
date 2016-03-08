package ee.icefire.test;

public class Encryption {

	protected static String encrypt(String firstName, String lastName) {
		
		String name = firstName + lastName, key = firstName, encryptedName = "";

    	for (int i = 0; i < name.length(); i++) {
    		int encryptedCharacter = (int) key.charAt(i % key.length());
    		int character = (int) name.charAt(i);
    		int secretPrimeNumber = name.length() * 14 + 9;
    		encryptedName += (encryptedCharacter + character) % secretPrimeNumber + " ";
    	}
		return encryptedName;
	}
	
	protected static String decrypt(String encryptedName, String key) {
		encryptedName = encryptedName.substring(0, encryptedName.length() - 1);
		String[] stringSplit = encryptedName.split(" ");
		int[] numbers = new int[stringSplit.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(stringSplit[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			int encryptedCharacter = (int) key.charAt(i % key.length());
			int character = (int) numbers[i];
			int decryptedCharacter = character - encryptedCharacter;
			if (decryptedCharacter < 0) {
				decryptedCharacter = (((decryptedCharacter % 233) + 233) % 233);
			} else {
				decryptedCharacter = decryptedCharacter % 233;
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
