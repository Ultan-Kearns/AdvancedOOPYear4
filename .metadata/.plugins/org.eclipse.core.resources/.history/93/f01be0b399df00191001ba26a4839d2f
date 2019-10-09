package ie.gmit.sw;

import java.security.Key;
import java.security.KeyPair;

import javax.crypto.Cipher;

public abstract class AbstractCypher {
	protected Cipher cypher;
	KeyPair keyRing;
	public AbstractCypher() {
		super();
		this.cypher = cypher;
	}

	public byte[] encrypt(byte[] plainText, Key key) throws Throwable {
		getCypher().init(getCypher().ENCRYPT_MODE, key);
		return (plainText);
	
	}

	public byte[] decrypt(byte[] cypherText, Key key) throws Throwable {
		return decrypt(cypherText,keyRing.getPrivate());
	}

	Cipher getCypher() {
		return cypher;
	}

	void setCypher(Cipher cypher) {
		this.cypher = cypher;
	}
	public abstract byte[] encrypt(byte[] plainText) throws Throwable;
	public abstract byte[] decrypt(byte[] plainText) throws Throwable;

}