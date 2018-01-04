package source.chengbin.info.common.util;

import java.io.File;

public class Attchment {
	private String name;
	private File tmpFile;
	private String contentType;
	private String attType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getTmpFile() {
		return tmpFile;
	}

	public void setTmpFile(File tmpFile) {
		this.tmpFile = tmpFile;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getAttType() {
		return attType;
	}

	public void setAttType(String attType) {
		this.attType = attType;
	}

}
