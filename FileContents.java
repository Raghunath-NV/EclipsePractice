import java.io.*;

class FileContents {
	
	public static void main(String a[]) {
		File file = new File(a[0]);
		System.out.println(file.isDirectory() ? "DIR" : "FILE");
		if(file.isDirectory()) {
			String arr[] = file.list();
			for(int i=0;i<arr.length;i++) {
				File obj = new File(a[0] + "/" + arr[i]);
				System.out.println(arr[i] + (obj.isFile()?" IS FILE..." : " IS DIR..."));
			}
		}
		else {
			System.out.println("Read ?" + file.canRead());
			System.out.println("Write ?" + file.canWrite());
			System.out.println("Size: " + file.length());
		}
		
	}

}