## Description
> When someone opens the lock the getFullName(String, String) method encrypts the name (firstName + lastName). The lock opens if the encrypted name is equal to the private key.

## Variables Definition
* **int character** - single character for character encryption
* **int encryptedCharacter** - character string to byte sequence translation
* **int secretNumber** - big prime generated number
* **String encryptedName** - encrypted output that was generated using the algorithm

## Algorithm
```java
private String getFullName(String firstName, String lastName) {
	String name = firstName + lastName, key = firstName, encryptedName = "",
			privateKey = "150 222 220 230 232 194 220 232 210 220 159 212 220 224 213 207 ";
	for (int i = 0; i < name.length(); i++) {
		int encryptedCharacter = (int) key.charAt(i % key.length());
		int character = (int) name.charAt(i);
		int secretPrimeNumber = name.length() * 14 + 9;
		encryptedName += (encryptedCharacter + character) % secretPrimeNumber + " ";
	}
	if (encryptedName.equals(privateKey)) {
		return ALLOWED_VISITORS.get(0);
	}
	return firstName + " " + lastName;
}
```
1. Split the name by characters.
2. Convert each individual character to int.
3. Encypt each character string to byte (using modulus operator).
4. Generate big prime number (enhanced security).
5. Concatenate byte values of each character and the corresponding encrypted character.
6. Divide the output with the generated big prime number.
7. Add the remainder value to the encrypted string.
8. Divide the output with the secret prime number.

## License
<a rel="license" href="http://creativecommons.org/licenses/by/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by/4.0/88x31.png" /></a><br />This <span xmlns:dct="http://purl.org/dc/terms/" href="http://purl.org/dc/dcmitype/Text" rel="dct:type">work</span> and all other materials under https://github.com/ktenman/test are licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/4.0/">Creative Commons Attribution 4.0 International License</a>.


