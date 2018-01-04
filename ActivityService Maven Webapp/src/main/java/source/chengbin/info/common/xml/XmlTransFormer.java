package source.chengbin.info.common.xml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;

import org.dom4j.io.XMLResult;
import org.jboss.logging.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

public class XmlTransFormer {
	/**
	 * org.w3c.document
	 * 
	 * @param document
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws TransformerConfigurationException
	 * @throws TransformerException
	 */
	public static byte[] XmlToBytes(Document document) {
        Logger logger=Logger.getLogger(XmlTransFormer.class);
		ByteArrayOutputStream byteOutPutStream = new ByteArrayOutputStream(1024 * 8);
		try {
			SAXTransformerFactory sff = (SAXTransformerFactory) SAXTransformerFactory
					.newInstance();
			XMLResult xmlResult = new XMLResult(byteOutPutStream);
			Transformer tw = sff.newTransformer();
			tw.transform(new DOMSource(document), xmlResult);
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
		} catch (TransformerConfigurationException e) {
			logger.error(e.getMessage());
		} catch (TransformerException e) {
			logger.error(e.getMessage());
		}
		return byteOutPutStream.toByteArray();
	}
	
	
	
	
	public static Document createEmptyXml(){
		Logger logger=Logger.getLogger(XmlTransFormer.class);
		DOMResult domResult=new DOMResult();
		try{
		SAXTransformerFactory sff = (SAXTransformerFactory) SAXTransformerFactory
				.newInstance();
		TransformerHandler th = sff.newTransformerHandler();
		th.setResult(domResult);
		Transformer transformer = th.getTransformer();
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8"); // 编码格式是UTF-8
		transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // 换行
		th.startDocument(); // 开始xml文档
		th.startElement("", "", "root", null);
		th.endElement("", "", "root");
		th.endDocument();
		}catch(TransformerConfigurationException e){
			 logger.error(e.getMessage());
		}catch(SAXException e){
			logger.error(e.getMessage());
		}
		return (Document)domResult.getNode();
	}
	
	
}
