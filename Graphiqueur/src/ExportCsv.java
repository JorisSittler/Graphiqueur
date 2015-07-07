import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportCsv {

	public static void generateCsvFile(String sFileName, Course c) {
		try {
			FileWriter writer = new FileWriter(sFileName);

			for (PointDePassage p : c.parcours) {
				writer.append(p.toString());
				writer.append('\n');
			}

			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readCsv(String file) {
		
		BufferedReader crunchifyBuffer = null;
		
		try {
			String crunchifyLine;
			crunchifyBuffer = new BufferedReader(new FileReader(file));
			
			// How to read file in java line by line?
			while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {
				System.out.println("Raw CSV data: " + crunchifyLine);
				System.out.println("Converted ArrayList data: " + crunchifyCSVtoArrayList(crunchifyLine) + "\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (crunchifyBuffer != null) crunchifyBuffer.close();
			} catch (IOException crunchifyException) {
				crunchifyException.printStackTrace();
			}
		}
	}
	public static ArrayList<String> crunchifyCSVtoArrayList(String crunchifyCSV) {
		ArrayList<String> crunchifyResult = new ArrayList<String>();
		
		if (crunchifyCSV != null) {
			String[] splitData = crunchifyCSV.split("\\s*,\\s*");
			for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
					crunchifyResult.add(splitData[i].trim());
				}
			}
		}
		
		return crunchifyResult;
	}
}