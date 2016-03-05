# testAssigment

When someone opens the lock, then getFullName(String, String) method encrypts the name (firstName+lastName). If the encrypted name equals with the private key, then lock opens.

### Encryption algorithm

* It is splitting the name by the characters and cast every character to integer.
* For every letter the code generates a character from the key.
* The secret number is a very big number, because the lock must be very secure.
* To get the residue, we need to sum int values of character and encrypted character.
* After we divide it with the secret number

