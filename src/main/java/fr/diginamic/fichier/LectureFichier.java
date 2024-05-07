package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		Path pathFile = Paths.get("E:/CDA Curs/recensement.csv");
		
		List<String> fLects = Files.readAllLines(pathFile);
		for (String flect: fLects) {
			System.out.println(flect);
		}
		
	}

}
