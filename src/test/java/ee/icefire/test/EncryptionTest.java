package ee.icefire.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncryptionTest {

	@Test
	public void testEncryption() {
		String encryptedName = Encryption.encrypt("Konstantin", "Tenman"), key = "Konstantin";
		assertEquals("KonstantinTenman", Encryption.decrypt(encryptedName, key));
	}

}
