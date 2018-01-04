package source.chengbin.info.common.util;

import java.util.Iterator;

public class JSONObjectExtSplit extends JSONObjectExt{
	  
	
	public String toString() {
		    StringBuffer sb = new StringBuffer();
		    Iterator it = this.getMap().keySet().iterator();
		    int i = 0;
		    sb.append("{");
		    while (it.hasNext()) {
		      String keystr = it.next().toString();

		      Object value = this.getMap().get(keystr);

		      if (value != null) {
		        if (value.getClass().isInstance(new String())){
		          value = "'" + value.toString() + "'";
		        }
		      }
		      else {
		        value = "''";
		      }

		      if (i > 0)
		        sb.append(",'" + keystr + "':" + value);
		      else {
		        sb.append("'" + keystr + "':" + value);
		      }
		      ++i;
		    }

		    sb.append("}");

		    return sb.toString();
		  }
}
