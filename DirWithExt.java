import java.io.*;

class DirWithExt {
	
	public static void main(String a[]) {
		File file = new File(a[0]);
		if(file.isDirectory()) {
			Extension ext = new Extension(a[1]);
			String arr[] = file.list(ext);
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]);
		}
		try{
			Thread.sleep(20000);
		} catch(Exception e) {
			
		}
	}

}