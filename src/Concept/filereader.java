package Concept;

import java.io.FileReader;

/* syntax
 * jdk 7, any object implements java.lang.AutoColseable or java.io.Closeable can be passed as a parameter to try statement.
 * the close() will be called automatically
try( ){
//open file or resource	
}catch(){
// handle exception
}finally{
//close file or resources
}

try-with source
try(open file or resource here){
}
//after try block, file will close automatically.
*/
public class filereader {
	public static void main(String[] args){
//		String filepath = "c://path";
//		//a
//		FileReader fr1 = new FileReader(file);
//		try( fr1 = new FileReader(filepath);){
//			int aChar1 = fr1.read();
//		}
//		
//		//b
//		try( FileReader fr2 = new FileReader(filepath)){
//			int aChar2 = fr2.read();
//		}
//		
//		//c
//		try( FileReader fr3 = new FileReader(filepath), FileReader fr4 = new FileReader(filepath)){
//			int aChar1 = fr3.read();
//			int aChar2 = fr4.read();
//		}
//		
//		//d
//		try( FileReader fr5 = new FileReader(filepath); FileReader fr6 = new FileReader(filepath)){
//			int aChar1 = fr5.read();
//			int aChar2 = fr6.read();
//		}
		
	}
}
