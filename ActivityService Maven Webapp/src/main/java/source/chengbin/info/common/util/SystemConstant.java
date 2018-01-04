package source.chengbin.info.common.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;



public class SystemConstant {
   public static JSONObjectExt dictAllJson=null;
   
   public static final String SOPT_INSERT="ins";
   public static final String SOPT_UPDAT="upd";
   public static final String SOPT_DELETE="del";
   public static final String SOPT_SUBMIT="sub";
   public static final String SOPT_REJECT="rej";
   
   public static Object getInputData(HttpServletRequest request,String key){
	   if(request.getAttribute(key)!=null){
		   return request.getAttribute(key);
	   }
	   if(request.getParameter(key)!=null){
		   return request.getParameter(key);
	   }
	   if(request.getSession().getAttribute(key)!=null){
		   return request.getSession().getAttribute(key);
	   }
	   return null;
   }
   
   
   
   
   
   
   
   
   
}
