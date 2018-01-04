package source.chengbin.info.common.util;

import java.util.HashMap;
import java.util.Map;

public class FileUtil {
	public static Map<String, String> contentTypeMap = new HashMap<String, String>();

	static {
		contentTypeMap.put("", "text/plain");

		contentTypeMap.put("abs", "audio/x-mpeg");

		contentTypeMap.put("ai", "application/postscript");

		contentTypeMap.put("aif", "audio/x-aiff");

		contentTypeMap.put("aifc", "audio/x-aiff");

		contentTypeMap.put("aiff", "audio/x-aiff");

		contentTypeMap.put("aim", "application/x-aim");

		contentTypeMap.put("art", "image/x-jg");

		contentTypeMap.put("asf", "video/x-ms-asf");

		contentTypeMap.put("asx", "video/x-ms-asf");

		contentTypeMap.put("au", "audio/basic");

		contentTypeMap.put("avi", "video/x-msvideo");

		contentTypeMap.put("avx", "video/x-rad-screenplay");

		contentTypeMap.put("bcpio", "application/x-bcpio");

		contentTypeMap.put("bin", "application/octet-stream");

		contentTypeMap.put("bmp", "image/bmp");

		contentTypeMap.put("body", "text/html");

		contentTypeMap.put("cdf", "application/x-cdf");

		contentTypeMap.put("cer", "application/x-x509-ca-cert");

		contentTypeMap.put("class", "application/java");

		contentTypeMap.put("cpio", "application/x-cpio");

		contentTypeMap.put("csh", "application/x-csh");

		contentTypeMap.put("css", "text/css");

		contentTypeMap.put("dib", "image/bmp");

		contentTypeMap.put("doc", "application/msword");

		contentTypeMap.put("dtd", "application/xml-dtd");

		contentTypeMap.put("dv", "video/x-dv");

		contentTypeMap.put("dvi", "application/x-dvi");

		contentTypeMap.put("eps", "application/postscript");

		contentTypeMap.put("etx", "text/x-setext");

		contentTypeMap.put("exe", "application/octet-stream");

		contentTypeMap.put("gif", "image/gif");

		contentTypeMap.put("gtar", "application/x-gtar");

		contentTypeMap.put("gz", "application/x-gzip");

		contentTypeMap.put("hdf", "application/x-hdf");

		contentTypeMap.put("hqx", "application/mac-binhex40");

		contentTypeMap.put("htc", "text/x-component");

		contentTypeMap.put("htm", "text/html");

		contentTypeMap.put("html", "text/html");

		contentTypeMap.put("hqx", "application/mac-binhex40");

		contentTypeMap.put("ief", "image/ief");

		contentTypeMap.put("jad", "text/vnd.sun.j2me.app-descriptor");

		contentTypeMap.put("jar", "application/java-archive");

		contentTypeMap.put("java", "text/plain");

		contentTypeMap.put("jnlp", "application/x-java-jnlp-file");

		contentTypeMap.put("jpe", "image/jpeg");

		contentTypeMap.put("jpeg", "image/jpeg");

		contentTypeMap.put("jpg", "image/jpeg");

		contentTypeMap.put("js", "text/javascript");

		contentTypeMap.put("jsf", "text/plain");

		contentTypeMap.put("jspf", "text/plain");

		contentTypeMap.put("kar", "audio/x-midi");

		contentTypeMap.put("latex", "application/x-latex");

		contentTypeMap.put("m3u", "audio/x-mpegurl");

		contentTypeMap.put("mac", "image/x-macpaint");

		contentTypeMap.put("man", "application/x-troff-man");

		contentTypeMap.put("mathml", "application/mathml+xml");

		contentTypeMap.put("me", "application/x-troff-me");

		contentTypeMap.put("mid", "audio/x-midi");

		contentTypeMap.put("midi", "audio/x-midi");

		contentTypeMap.put("mif", "application/x-mif");

		contentTypeMap.put("mov", "video/quicktime");

		contentTypeMap.put("movie", "video/x-sgi-movie");

		contentTypeMap.put("mp1", "audio/x-mpeg");

		contentTypeMap.put("mp2", "audio/x-mpeg");

		contentTypeMap.put("mp3", "audio/x-mpeg");

		contentTypeMap.put("mp4", "video/mp4");

		contentTypeMap.put("mpa", "audio/x-mpeg");

		contentTypeMap.put("mpe", "video/mpeg");

		contentTypeMap.put("mpeg", "video/mpeg");

		contentTypeMap.put("mpega", "audio/x-mpeg");

		contentTypeMap.put("mpg", "video/mpeg");

		contentTypeMap.put("mpv2", "video/mpeg2");

		contentTypeMap.put("ms", "application/x-wais-source");

		contentTypeMap.put("nc", "application/x-netcdf");

		contentTypeMap.put("oda", "application/oda");

		contentTypeMap
				.put("odb", "application/vnd.oasis.opendocument.database");

		contentTypeMap.put("odc", "application/vnd.oasis.opendocument.chart");

		contentTypeMap.put("odf", "application/vnd.oasis.opendocument.formula");

		contentTypeMap
				.put("odg", "application/vnd.oasis.opendocument.graphics");

		contentTypeMap.put("odi", "application/vnd.oasis.opendocument.image");

		contentTypeMap.put("odm",
				"application/vnd.oasis.opendocument.text-master");

		contentTypeMap.put("odp",
				"application/vnd.oasis.opendocument.presentation");

		contentTypeMap.put("ods",
				"application/vnd.oasis.opendocument.spreadsheet");

		contentTypeMap.put("odt", "application/vnd.oasis.opendocument.text");

		contentTypeMap.put("ogg", "application/ogg");

		contentTypeMap.put("otg",
				"application/vnd.oasis.opendocument.graphics-template");

		contentTypeMap
				.put("oth", "application/vnd.oasis.opendocument.text-web");

		contentTypeMap.put("otp",
				"application/vnd.oasis.opendocument.presentation-template");

		contentTypeMap.put("ots",
				"application/vnd.oasis.opendocument.spreadsheet-template ");

		contentTypeMap.put("ott",
				"application/vnd.oasis.opendocument.text-template");

		contentTypeMap.put("pbm", "image/x-portable-bitmap");

		contentTypeMap.put("pct", "image/pict");

		contentTypeMap.put("pdf", "application/pdf");

		contentTypeMap.put("pgm", "image/x-portable-graymap");

		contentTypeMap.put("pic", "image/pict");

		contentTypeMap.put("pict", "image/pict");

		contentTypeMap.put("pls", "audio/x-scpls");

		contentTypeMap.put("png", "image/png");

		contentTypeMap.put("pnm", "image/x-portable-anymap");

		contentTypeMap.put("pnt", "image/x-macpaint");

		contentTypeMap.put("ppm", "image/x-portable-pixmap");

		contentTypeMap.put("ppt", "application/powerpoint");

		contentTypeMap.put("ps", "application/postscript");

		contentTypeMap.put("psd", "image/x-photoshop");

		contentTypeMap.put("qt", "video/quicktime");

		contentTypeMap.put("qti", "image/x-quicktime");

		contentTypeMap.put("qtif", "image/x-quicktime");

		contentTypeMap.put("ras", "image/x-cmu-raster");

		contentTypeMap.put("rdf", "application/rdf+xml");

		contentTypeMap.put("rgb", "image/x-rgb");

		contentTypeMap.put("rm", "application/vnd.rn-realmedia");

		contentTypeMap.put("roff", "application/x-troff");

		contentTypeMap.put("rtf", "application/rtf");

		contentTypeMap.put("rtx", "text/richtext");

		contentTypeMap.put("sh", "application/x-sh");

		contentTypeMap.put("shar", "application/x-shar");

		contentTypeMap.put("shtml", "text/x-server-parsed-html");

		contentTypeMap.put("smf", "audio/x-midi");

		contentTypeMap.put("sit", "application/x-stuffit");

		contentTypeMap.put("snd", "audio/basic");

		contentTypeMap.put("src", "application/x-wais-source");

		contentTypeMap.put("sv4cpio", "application/x-sv4cpio");

		contentTypeMap.put("sv4crc", "application/x-sv4crc");

		contentTypeMap.put("swf", "application/x-shockwave-flash");

		contentTypeMap.put("t", "application/x-troff");

		contentTypeMap.put("tar", "application/x-tar");

		contentTypeMap.put("tcl", "application/x-tcl");

		contentTypeMap.put("tex", "application/x-tex");

		contentTypeMap.put("texi", "application/x-texinfo");

		contentTypeMap.put("texinfo", "application/x-texinfo");

		contentTypeMap.put("tif", "image/tiff");

		contentTypeMap.put("tiff", "image/tiff");

		contentTypeMap.put("tr", "application/x-troff");

		contentTypeMap.put("tsv", "text/tab-separated-values");

		contentTypeMap.put("txt", "text/plain");

		contentTypeMap.put("ulw", "audio/basic");

		contentTypeMap.put("ustar", "application/x-ustar");

		contentTypeMap.put("vxml", "application/voicexml+xml");

		contentTypeMap.put("xbm", "image/x-xbitmap");

		contentTypeMap.put("xht", "application/xhtml+xml");

		contentTypeMap.put("xhtml", "application/xhtml+xml");

		contentTypeMap.put("xml", "application/xml");

		contentTypeMap.put("xpm", "image/x-xpixmap");

		contentTypeMap.put("xsl", "application/xml");

		contentTypeMap.put("xslt", "application/xslt+xml");

		contentTypeMap.put("xul", "application/vnd.mozilla.xul+xml");

		contentTypeMap.put("xwd", "image/x-xwindowdump");

		contentTypeMap.put("wav", "audio/x-wav");

		contentTypeMap.put("svg", "image/svg+xml");

		contentTypeMap.put("svgz", "image/svg+xml");

		contentTypeMap.put("vsd", "application/x-visio");

		contentTypeMap.put("wbmp", "image/vnd.wap.wbmp");

		contentTypeMap.put("wml", "text/vnd.wap.wml");

		contentTypeMap.put("wmlc", "application/vnd.wap.wmlc");

		contentTypeMap.put("wmls", "text/vnd.wap.wmlscript");

		contentTypeMap.put("wmlscriptc", "application/vnd.wap.wmlscriptc");

		contentTypeMap.put("wmv", "video/x-ms-wmv");

		contentTypeMap.put("wrl", "x-world/x-vrml");

		contentTypeMap.put("wspolicy", "application/wspolicy+xml");

		contentTypeMap.put("Z", "application/x-compress");

		contentTypeMap.put("z", "application/x-compress");

		contentTypeMap.put("zip", "application/zip");
		contentTypeMap.put("rar", "application/rar");
		contentTypeMap.put("xls", "application/vnd.ms-excel");

		contentTypeMap.put("doc", "application/vnd.ms-word");

		contentTypeMap.put("ppt", "application/vnd.ms-powerpoint");

	}

	public static String getContentType(String ext) {
		String type=contentTypeMap.get(ext);
		if(type!=null){
			return type;
		}else{
			return contentTypeMap.get(ext.toLowerCase());
		}
	}

}
