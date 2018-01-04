 package source.chengbin.info.common.util;
 
 import java.util.ArrayList;
 import java.util.Iterator;
import java.util.List;


 
 public class JSONArrayExt
 {
   private List list = new ArrayList();
 
   public static JSONArrayExt fromObject(List list)
   {
     return new JSONArrayExt(list);
   }
 
   public JSONArrayExt()
   {
   }
 
   private JSONArrayExt(List list)
   {
     this.list = list;
   }
   
   
   
   
   
 
   public JSONArrayExt add(boolean obj) {
     this.list.add(Boolean.valueOf(obj));
     return this;
   }
 
   public JSONArrayExt add(int obj) {
     this.list.add(Integer.valueOf(obj));
     return this;
   }
 
   public JSONArrayExt add(long obj) {
     this.list.add(Long.valueOf(obj));
     return this;
   }
 
   public JSONArrayExt add(Object object) {
     this.list.add(object);
 
     return this;
   }
 
   public JSONArrayExt addAll(List list) {
     this.list.addAll(list);
     return this;
   }
   
   public JSONArrayExt addArray(Object[] array){
	   for(int i=0;i<array.length;i++){
		   this.list.add(array[i]);
	   }
	   return this;
   }
   
   
   public JSONArrayExt union(JSONArrayExt two){
	   list.addAll(two.list);
	   return new JSONArrayExt(list);
   }


   
   public List getList(){
	   return this.list;
   }


 
   public String toString() {
     StringBuffer sb = new StringBuffer();
     Iterator it = this.list.iterator();
     int i = 0;
     sb.append("[");
     while (it.hasNext()) {
       Object value = it.next();
       if (value != null){
         if (value instanceof String)
         {
           value = "\"" + value.toString() + "\"";
         }
       }
       else {
         value = "\"\"";
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
