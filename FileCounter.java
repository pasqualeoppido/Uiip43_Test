/**
 * 
 */
package it.uiip.esercitazione1.esercizio3;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author pasop
 *
 */
public class FileCounter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Reader br = null;
		String path = args[0];
		br =  new FileReader(path);
		int countWords = 0;
		int countLine = 0;
		int totalCharacters = 0;
		int l ;
		
		try {
			while((l = br.read() ) != -1) {
				totalCharacters++;
				if(l == ' ') {
					countWords++;
				}
				if(l == '\n') {
					countLine++;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) {
				br.close();
			}
		}
		System.out.format("Il file contiene %d righe, %d parole e %d caratteri.", countLine, countWords, totalCharacters);
	}
}
