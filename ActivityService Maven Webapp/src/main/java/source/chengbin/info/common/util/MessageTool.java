/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package source.chengbin.info.common.util;

import java.security.MessageDigest;

/**
 *
 * @author Administrator
 */
public class MessageTool {
    public final static String getMD5(String strs){
        try{
        MessageDigest md=MessageDigest.getInstance("MD5");
        md.update(strs.getBytes());
        byte[] bytes=md.digest();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<bytes.length;i++){
            String a=Integer.toHexString(Math.abs(new Byte(bytes[i]).intValue())).toUpperCase();
            sb.append(a);
        }
        return sb.toString();
        }catch(Exception e){
         
            e.printStackTrace();
            return null;
        }
    }


    


    public static String getHasCode(byte[] bytes){
        return getHasCode(new String(bytes).hashCode());
    }



    public static String getHasCode(String strs){
         return getHasCode(strs.hashCode());
    }


    public static String getHasCode(int s){
        long a=125000000000L;
        long b=a+s;
        String m=String.valueOf(b);
        return m;
    }
    
    
    public static void main(String[] args){
    	System.out.println(MessageTool.getMD5("000000000"));
    }
    
    





   

}
