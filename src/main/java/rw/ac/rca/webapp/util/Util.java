/**
 * 
 */
package rw.ac.rca.webapp.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Aphrodice Rwagaju
 * 
 */
public class Util {

	public static String generateHashedString(String psw) {
		String hashedpwd = null;
		MessageDigest m;
		try {
			m = MessageDigest.getInstance("SHA-512");
			m.update(psw.getBytes(), 0, psw.length());
			hashedpwd = new BigInteger(1, m.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return hashedpwd;
	}

	public static String generateHashed512(String st) {
		MessageDigest md;
		String out = "";
		try {
			md = MessageDigest.getInstance("SHA-512");

			md.update(st.getBytes());
			byte[] mb = md.digest();

			for (int i = 0; i < mb.length; i++) {
				byte temp = mb[i];
				String s = Integer.toHexString(new Byte(temp));
				while (s.length() < 2) {
					s = "0" + s;
				}
				s = s.substring(s.length() - 2);
				out += s;
			}
			System.out.println(out.length());
			System.out.println("CRYPTO: " + out);

		} catch (NoSuchAlgorithmException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		return out;
	}
	
	public static String staticGeneratedHash512(String st) {
		MessageDigest md;
		String out = "";
		String message = "password";
		try {
			md = MessageDigest.getInstance("SHA-512");

			md.update(message.getBytes());
			byte[] mb = md.digest();

			for (int i = 0; i < mb.length; i++) {
				byte temp = mb[i];
				String s = Integer.toHexString(new Byte(temp));
				while (s.length() < 2) {
					s = "0" + s;
				}
				s = s.substring(s.length() - 2);
				out += s;
			}
			System.out.println(out.length());
			System.out.println("CRYPTO: " + out);

		} catch (NoSuchAlgorithmException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		return out;
	}

}
