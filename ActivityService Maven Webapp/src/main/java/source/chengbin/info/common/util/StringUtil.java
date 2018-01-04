package source.chengbin.info.common.util;

import java.util.Collection;
import java.util.Iterator;

public class StringUtil {
     
	public static String ZeroBeforeNum(int num,int length){
		int numLength=String.valueOf(num).length();
		int redNum=length-numLength;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<redNum;i++){
			sb.append("0");
		}
		sb.append(String.valueOf(num));
		return sb.toString();
	}
	
	public static String replaceStrToJSON(String source){
		return source.replaceAll(",", "，").replaceAll(":", "：").replaceAll("\"","“");
	}
	
	
	
	
	
	public static String ListToIntSqlStr(Collection list){
		if(list==null ){
			return null;
		}
		StringBuffer sb = new StringBuffer();
		Iterator it=list.iterator();
		int i=0;
		while(it.hasNext()){
			
			if (i > 0) {
				sb.append("," + it.next().toString() + "");
			} else {
				sb.append(it.next().toString());
			}
			i++;
		}
		return sb.toString();
	}
	
	public static String ListToCharSqlStr(Collection<String> list){
		if(list==null){
			return null;
		}
		StringBuffer sb = new StringBuffer();
		Iterator<String> it=list.iterator();
		int i=0;
		while(it.hasNext()){
			if (i > 0) {
				sb.append(",'" + it.next().toString() + "'");
			} else {
				sb.append("'"+it.next().toString()+"'");
			}
			i++;
		}
		return sb.toString();
	}
	
	
}
