>When someone opens the lock the getFullName(String, String) method encrypts the name (firstName + lastName) . The lock opens if the encrypted name is equal to the private key.

'''
for (int i = 0; i < name.length(); i++) {
	int encryptedCharacter = (int) key.charAt(i % key.length());
	int character = (int) name.charAt(i);
	int secretPrimeNumber = name.length() * 14 + 9;
	encryptedName += (encryptedCharacter + character) % secretPrimeNumber + ", ";
}
'''

### Variables Definition:
* **int character** - single character for character encryption
* **int encryptedCharacter** - character string to byte sequence translation
* **int secretNumber** - big prime generated number
* **String encryptedName** - encrypted output that was generated using the algorithm

### Algorithm:
1. Split the name by characters.
2. Convert each individual character to int.
3. Encypt each character string to byte (using modulus operator).
4. Generate big prime number (enhanced security).
5. Concatenate byte values of each character and the corresponding encrypted character.
6. Divide the output with the generated big prime number.
7. Add the remainder value to the encrypted string.
8. Divide the output with the secret prime number.



