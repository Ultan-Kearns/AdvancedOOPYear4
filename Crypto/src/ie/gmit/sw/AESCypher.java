package ie.gmit.sw;

import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

public class AESCypher extends AbstractCypher implements Cypherable {
	private Key key;

	public AESCypher() throws Throwable {
		super();
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(128);
		Key key = keyGen.generateKey();
		Cipher cypher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		
	}

	public byte[] encrypt(byte[] plainText) throws Throwable {
		return (encrypt(plainText, keyRing.getPublic()));

	}

	public byte[] decrypt(byte[] cypherText) throws Throwable {
		return (decrypt(cypherText, keyRing.getPrivate()));
	}

	public byte[] encrypt(byte[] plainText, Key key) throws Throwable {
		return decrypt(plainText, key);
	}

	public byte[] decrypt(byte[] cypherText, Key key) throws Throwable {
		return decrypt(cypherText, key);
	}
}
