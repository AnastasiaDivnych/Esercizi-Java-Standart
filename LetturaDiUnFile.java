package LetturaFile;

import java.io.*;

public class LetturaDiUnFile {
	public static void main (String[] args) throws IOException {
		File inputFile = new File("C:/Users/anast/Desktop/es.txt");
		BufferedReader reader = new BufferedReader (new FileReader(inputFile));
		String lineToRemove = "Bella Ciao";
		String lineToRemove1 = "--- ASDASDASDASd";
		String lineToRemove2 = "# oierjmgiuergjneirg";
		String lineToRemove3 = "Song Discussions is protected by U.S. Patent 9401941. Other patents pending.";
		String lineToRemove4 = "Read more: Mirah - Bella Ciao Lyrics | MetroLyrics";
		String currentLine;
		String oldword = "bella";
		String newword = "Bella";
		String newline;
		while((currentLine = reader.readLine())!= null) {
			String trimmedLine = currentLine.trim();
			
			if(trimmedLine.equals(lineToRemove)) continue;
			if(trimmedLine.equals(lineToRemove1)) continue;
			if(trimmedLine.equals(lineToRemove2)) continue;
			if(trimmedLine.equals(lineToRemove3)) continue;
			if(trimmedLine.equals(lineToRemove4)) continue;

			if(currentLine.contains(oldword)) {
				newline = currentLine.replace(oldword, newword);
				System.out.println(newline);	
			}
			else {
				System.out.println(currentLine);
				}
			}
		}	
	}
