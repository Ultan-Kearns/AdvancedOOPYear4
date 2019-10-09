package ie.gmit.sw;

public class CaeserCypher implements CypherKey {
	private int key;
	public String encrypt(String plaintext) throws CypherException{
		return new String(encrypt(plaintext.getBytes()));
	}
	public byte[] encrypt(byte[] plaintext) throws CypherException{
		for(int i = 0; i < plaintext.length; i++)
		{
			plaintext[i] = plaintext[i + getKey()];
		}
		return plaintext;
	}
	public CharSequence decrypt(String cypherText) throws CypherException{
		return new String(decrypt(cypherText.getBytes()));

	}
	public byte[] decrypt(byte[] cypherText) throws CypherException{
		for(int i = 0; i < cypherText.length; i++)
		{
			cypherText[i] = cypherText[i - getKey()];
		}
		return cypherText;
	}
}

