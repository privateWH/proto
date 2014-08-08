package proto.fileupload;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class HelloWorld {
	public static void main(String[] args){
		ServletFileUpload upload = new ServletFileUpload();
		System.out.println("Hello World");
	}
}
