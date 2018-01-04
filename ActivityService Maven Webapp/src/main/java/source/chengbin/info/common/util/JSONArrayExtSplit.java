package source.chengbin.info.common.util;

import java.util.Iterator;

public class JSONArrayExtSplit extends JSONArrayExt{
	   public String toString() {
		     StringBuffer sb = new StringBuffer();
		     Iterator it = this.getList().iterator();
		     int i = 0;
		     sb.append("[");
		     while (it.hasNext()) {
		       Object value = it.next();
		       if (value != null){
		         if (value instanceof String)
		         {
		           value = "'" + value.toString() + "'";
		         }
		       }
		       else {
		         value = "''";
		       }
		       if (i > 0)
		         sb.append("," + value);
		       else {
		         sb.append(value);
		       }
		       ++i;
		     }
		     sb.append("]");
		     return sb.toString();
		   }
}
