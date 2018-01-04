package source.frame.dao.plus;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.app.Context;
import org.app.ContextPool;

public class VelocityEngineDao {

	private VelocityEngine velocityEngine = new VelocityEngine();

	public VelocityEngineDao() {
		velocityEngine.init();
	}

	/**
	 * 返回VelocityEngine引擎
	 * 
	 * @return
	 */
	public VelocityEngine getVelocityEngine() {
		return this.velocityEngine;
	}

	/**
	 * 返回按照字符进行替换的结果
	 * 
	 * @param content
	 *            要替换的源字符串
	 * @param context
	 *            上下文内容
	 * @return
	 */
	public String getVelocityResult(String content, VelocityContext context) {
		StringWriter writer = new StringWriter();
		velocityEngine.evaluate(context, writer, "", content); // 关键方法
		return writer.toString();
	}

	
	/**
	 * 替换字符内容，按照Velocity的格式进行
	 * @param content
	 * @param context
	 * @return
	 */
	public String getVelocityResult(String content, Map<String, Object> context) {
		VelocityContext veContext = new VelocityContext();
		Iterator<String> it = context.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			Object value = context.get(key);
			veContext.put(key, value);
		}
		StringWriter writer = new StringWriter();
		velocityEngine.evaluate(veContext, writer, "", content); // 关键方法
		return writer.toString();
	}
	
	
	
	public String getVelocityResult(String namespace,String id,Map<String,Object> context){
		VelocityContext veContext = new VelocityContext();
		Iterator<String> it = context.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			Object value = context.get(key);
			veContext.put(key, value);
		}
		StringWriter writer = new StringWriter();
		velocityEngine.evaluate(veContext, writer, "", getSqldById(namespace,id)); // 关键方法
		return writer.toString();
	}
	
	
	
	private String getSqldById(String namespace,String id){
		Context context=ContextPool.getInstance().getSqldContext();
		return (String)context.get(namespace, id);
	}
	
	

}
