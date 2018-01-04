package org.sqld;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.app.Context;
import org.app.ContextPool;
import org.app.SQLDStaticContext;
import org.springframework.web.context.WebApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



/**
 * 
 * @author chengyuxuan
 *
 */
public class ContextLoadServlet extends HttpServlet {

	public Logger logger = Logger.getLogger(ContextLoadServlet.class);

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		logger.info("start load sqld config");
		logger.info(config);
		String xmlPath = config.getInitParameter("contextConfigLocation");
		logger.info(xmlPath);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		Context context=Context.SQLDContext;
		WebApplicationContext springContext=(WebApplicationContext)config.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		//logger.info("testBean:--------------------"+springContext.getBean("userOptService"));
		ContextPool.getInstance().setAppContext(springContext);
		ContextPool.getInstance().setSqldContext(context);
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
		    InputStream is=config.getServletContext().getResourceAsStream(xmlPath);
			//File file = new File(xmlPath);
			Document doc = db.parse(is);
			Element docElement=doc.getDocumentElement();
			String nameSpace=docElement.getAttribute("package");
			logger.info(nameSpace);
			logger.info(docElement);
			logger.info(docElement);
			NodeList nl = doc.getElementsByTagName("sql");
			int len = nl.getLength();
			for (int i = 0; i < len; i++) {
				Element sql = (Element) nl.item(i);
				String id=sql.getAttribute("id");
				String title=sql.getAttribute("title");
				String text=sql.getTextContent();
				context.put(nameSpace, id, text);
			}
			super.init(config);
			logger.info(context);
			logger.info("end load sqld config");
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
