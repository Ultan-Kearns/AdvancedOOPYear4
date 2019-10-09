package ie.gmit.sw;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class RSACypher extends AbstractCypher implements Cypherable{

	KeyPair keyRing;
	private KeyPair key;
	public RSACypher() throws Throwable {
		super();
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		keyRing = keyGen.generateKeyPair();
		cypher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		key = keyGen.generateKeyPair();

	}
	public byte[] encrypt(byte[] plainText) throws Throwable {
		return (encrypt(plainText,key));
	
	}

	public byte[] decrypt(byte[] cypherText) throws Throwable {
		return(decrypt(cypherText,key));
	}

	public byte[] encrypt(byte[] plainText, KeyPair key) throws Throwable {
		return decrypt(plainText,keyRing.getPublic());
	}

	public byte[] decrypt(byte[] cypherText, KeyPair key) throws Throwable {
		return decrypt(cypherText,keyRing.getPrivate());
	}

}
