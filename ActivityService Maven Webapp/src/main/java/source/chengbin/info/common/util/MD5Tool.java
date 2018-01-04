package source.chengbin.info.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Tool {

	private MessageDigest digest = null;

	public MD5Tool(String digest) throws NoSuchAlgorithmException {
		this.digest = MessageDigest.getInstance(digest);
	}

	public MD5Tool() throws NoSuchAlgorithmException {
		this("MD5");
	}

	public String getMd5String(byte[] b) {
		this.digest.reset();
		this.digest.update(b);
		byte[] dest=this.digest.digest();
		int i;
		StringBuffer buf = new StringBuffer("");
		for (int offset = 0; offset <dest.length; offset++) {
			i = dest[offset];
			if (i < 0)
				i += 256;
			if (i < 16)
				buf.append("0");
			buf.append(Integer.toHexString(i));
		}
		return buf.toString().toUpperCase();
	}
	
	
	
	public static void main(String[] args) {
		
	try{
		MD5Tool med5Tool= new MD5Tool();
		System.out.println(med5Tool.getMd5String("chengbinTM".getBytes("UTF-8")));
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}
