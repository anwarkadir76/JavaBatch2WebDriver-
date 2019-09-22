package selenium.EncodedAndDecoded.tests;

import org.apache.commons.codec.binary.Base64;

public class EncodedandDecoded {

	public static void main(String[] args) {
	
		
		String  str="test123";
		
		byte[]  encodedString=Base64.encodeBase64(str.getBytes());//change the test123 code to byte 
		
		System.out.println("encode String:"  +  new  String (encodedString));
		
		//decoded string 
		
		byte[] decodedString=Base64.decodeBase64(encodedString);
		
		System.out.println("decoded string:" + new String(decodedString));

	}

}
