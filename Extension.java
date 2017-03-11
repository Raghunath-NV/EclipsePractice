import java.io.*;

class Extension implements FilenameFilter {

	String ext;

	Extension(String ext) {
		this.ext = ext;
	}

	public boolean accept(File dir, String name) {
		return name.endsWith(ext);
	}	
}