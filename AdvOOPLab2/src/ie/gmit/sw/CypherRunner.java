package ie.gmit.sw;

public class CypherRunner {

	public static void main(String[] args) throws CypherException {
		CaeserCypher cc = new CaeserCypher();
		cc.setKey(7);
		String message = "ATTACK THE CASTLE WALLS AFTER DRINKS";
		String enc = cc.encrypt(message);
		System.out.println(enc);
		System.out.println(cc.decrypt(enc));
	}

}
