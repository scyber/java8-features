package das_lambda;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;

public class LambdaDirFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String pathToDir = "/opt/download";
			System.out.println("Filter subdirectory from PATH " +  pathToDir);
			File[] files = new File(pathToDir).listFiles();
			ArrayList<File> dirs = getDirecroiesList(files);
			

	}
	public static ArrayList<File> getDirecroiesList (File[] files) {
		ArrayList<File> dirs = new ArrayList<>();
		
		for (File f: files ) {
			new Thread(()-> { if(f.isDirectory()) dirs.add(f); }).start();
        }
		/*//System.out.println(dirs.size());
		
		for(File d: dirs) {
			System.out.println(d.getName());
		}*/
		
		return dirs;
	}

}
