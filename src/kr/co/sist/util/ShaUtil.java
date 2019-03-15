package kr.co.sist.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.tomcat.util.codec.binary.Base64;


public class ShaUtil {
	
	private static Base64 base64 = new Base64();
	
	public static String shaEncoding(String plaintext) {
		String ciphertext = "";
		if(plaintext != null || !"".equals(plaintext)) {
			
			try {
				//1. �˰����� ����� �� �ִ� ��ü ���
				MessageDigest md = MessageDigest.getInstance("SHA-1");
				//2. ��(plaintext)�� ��ȣ��(ciphertext) ��ȯ
				md.update(plaintext.getBytes());
				//3. ��ȯ�� ��ȣ��(ciphertext)���
				ciphertext = new String(base64.encode(md.digest()));
				
			} catch (NoSuchAlgorithmException nsae) {
				//����� �� ���� �˰��� �϶� ���� �߻�
				nsae.printStackTrace();
			}//end catch
		}//end if
		
		return ciphertext;
	}//shaEncoding
	
	public static void main(String[] args) {
		System.out.println(shaEncoding("abcd"));
	}//main
}//class