package name;
import java.io.*;

public class MergeStates {

	

		
		public static void main(String[] args) {
			
			// the source
			String sourceFileAKPath = "C:/Users/econometrican/Desktop/namesbystate/AK.txt";
			String sourceFileALPath = "C:/Users/econometrican/Desktop/namesbystate/AL.txt";
			String sourceFileARPath = "C:/Users/econometrican/Desktop/namesbystate/AR.txt";
			String sourceFileAZPath = "C:/Users/econometrican/Desktop/namesbystate/AZ.txt";
			String sourceFileCAPath = "C:/Users/econometrican/Desktop/namesbystate/CA.txt";
			String sourceFileCOPath = "C:/Users/econometrican/Desktop/namesbystate/CO.txt";
			String sourceFileCTPath = "C:/Users/econometrican/Desktop/namesbystate/CT.txt";
			String sourceFileDCPath = "C:/Users/econometrican/Desktop/namesbystate/DC.txt";
			String sourceFileDEPath = "C:/Users/econometrican/Desktop/namesbystate/DE.txt";
			String sourceFileFLPath = "C:/Users/econometrican/Desktop/namesbystate/FL.txt";
			String sourceFileGAPath = "C:/Users/econometrican/Desktop/namesbystate/GA.txt";	       
			String sourceFileHIPath = "C:/Users/econometrican/Desktop/namesbystate/HI.txt";
			String sourceFileIAPath = "C:/Users/econometrican/Desktop/namesbystate/IA.txt";
			String sourceFileIDPath = "C:/Users/econometrican/Desktop/namesbystate/ID.txt";
			String sourceFileILPath = "C:/Users/econometrican/Desktop/namesbystate/IL.txt";
			String sourceFileINPath = "C:/Users/econometrican/Desktop/namesbystate/IN.txt";
			String sourceFileKSPath = "C:/Users/econometrican/Desktop/namesbystate/KS.txt";
			String sourceFileKYPath = "C:/Users/econometrican/Desktop/namesbystate/KY.txt";
			String sourceFileLAPath = "C:/Users/econometrican/Desktop/namesbystate/LA.txt";
			String sourceFileMAPath = "C:/Users/econometrican/Desktop/namesbystate/MA.txt";
			String sourceFileMDPath = "C:/Users/econometrican/Desktop/namesbystate/MD.txt";	       
			String sourceFileMEPath = "C:/Users/econometrican/Desktop/namesbystate/ME.txt";
			String sourceFileMIPath = "C:/Users/econometrican/Desktop/namesbystate/MI.txt";
			String sourceFileMNPath = "C:/Users/econometrican/Desktop/namesbystate/MN.txt";
			String sourceFileMOPath = "C:/Users/econometrican/Desktop/namesbystate/MO.txt";
			String sourceFileMSPath = "C:/Users/econometrican/Desktop/namesbystate/MS.txt";
			String sourceFileMTPath = "C:/Users/econometrican/Desktop/namesbystate/MT.txt";	
			String sourceFileNCPath = "C:/Users/econometrican/Desktop/namesbystate/NC.txt";
			String sourceFileNDPath = "C:/Users/econometrican/Desktop/namesbystate/ND.txt";
			String sourceFileNEPath = "C:/Users/econometrican/Desktop/namesbystate/NE.txt";
			String sourceFileNHPath = "C:/Users/econometrican/Desktop/namesbystate/NH.txt";	       
			String sourceFileNJPath = "C:/Users/econometrican/Desktop/namesbystate/NJ.txt";
			String sourceFileNMPath = "C:/Users/econometrican/Desktop/namesbystate/NM.txt";
			String sourceFileNVPath = "C:/Users/econometrican/Desktop/namesbystate/NV.txt";
			String sourceFileNYPath = "C:/Users/econometrican/Desktop/namesbystate/NY.txt";			
			String sourceFileOHPath = "C:/Users/econometrican/Desktop/namesbystate/OH.txt";
			String sourceFileOKPath = "C:/Users/econometrican/Desktop/namesbystate/OK.txt";
			String sourceFileORPath = "C:/Users/econometrican/Desktop/namesbystate/OR.txt";
			String sourceFilePAPath = "C:/Users/econometrican/Desktop/namesbystate/PA.txt";			
			String sourceFileRIPath = "C:/Users/econometrican/Desktop/namesbystate/RI.txt";
			String sourceFileSCPath = "C:/Users/econometrican/Desktop/namesbystate/SC.txt";	       
			String sourceFileSDPath = "C:/Users/econometrican/Desktop/namesbystate/SD.txt";
			String sourceFileTNPath = "C:/Users/econometrican/Desktop/namesbystate/TN.txt";
			String sourceFileTXPath = "C:/Users/econometrican/Desktop/namesbystate/TX.txt";
			String sourceFileUTPath = "C:/Users/econometrican/Desktop/namesbystate/UT.txt";
			String sourceFileVAPath = "C:/Users/econometrican/Desktop/namesbystate/VA.txt";
			String sourceFileVTPath = "C:/Users/econometrican/Desktop/namesbystate/VT.txt";
			String sourceFileWAPath = "C:/Users/econometrican/Desktop/namesbystate/WA.txt";
			String sourceFileWIPath = "C:/Users/econometrican/Desktop/namesbystate/WI.txt";
			String sourceFileWVPath = "C:/Users/econometrican/Desktop/namesbystate/WV.txt";
			String sourceFileWYPath = "C:/Users/econometrican/Desktop/namesbystate/WY.txt";
									
			
			// the target 
			String mergedFilePath = "C:/Users/econometrican/Desktop/namesbystate/states_all.txt";
	 
			File[] files = new File[51];
			
			files[0] = new File(sourceFileAKPath);
			files[1] = new File(sourceFileALPath);
			files[2] = new File(sourceFileARPath);
			files[3] = new File(sourceFileAZPath);
			files[4] = new File(sourceFileCAPath);
			files[5] = new File(sourceFileCOPath);
			files[6] = new File(sourceFileCTPath);
			files[7] = new File(sourceFileDCPath);
			files[8] = new File(sourceFileDEPath);
			files[9] = new File(sourceFileFLPath);
			files[10] = new File(sourceFileGAPath);
			files[11] = new File(sourceFileHIPath);
			files[12] = new File(sourceFileIAPath);
			files[13] = new File(sourceFileIDPath);
			files[14] = new File(sourceFileILPath);
			files[15] = new File(sourceFileINPath);
			files[16] = new File(sourceFileKSPath);
			files[17] = new File(sourceFileKYPath);
			files[18] = new File(sourceFileLAPath);
			files[19] = new File(sourceFileMAPath);
			files[20] = new File(sourceFileMDPath);
			files[21] = new File(sourceFileMEPath);
			files[22] = new File(sourceFileMIPath);
			files[23] = new File(sourceFileMNPath);
			files[24] = new File(sourceFileMOPath);
			files[25] = new File(sourceFileMSPath);
			files[26] = new File(sourceFileMTPath);
			files[27] = new File(sourceFileNCPath);
			files[28] = new File(sourceFileNDPath);
			files[29] = new File(sourceFileNEPath);
			files[30] = new File(sourceFileNHPath);
			files[31] = new File(sourceFileNJPath);
			files[32] = new File(sourceFileNMPath);
			files[33] = new File(sourceFileNVPath);
			files[34] = new File(sourceFileNYPath);
			files[35] = new File(sourceFileOHPath);
			files[36] = new File(sourceFileOKPath);
			files[37] = new File(sourceFileORPath);
			files[38] = new File(sourceFilePAPath);
			files[39] = new File(sourceFileRIPath);		
			files[40] = new File(sourceFileSCPath);
			files[41] = new File(sourceFileSDPath);
			files[42] = new File(sourceFileTNPath);
			files[43] = new File(sourceFileTXPath);
			files[44] = new File(sourceFileUTPath);
			files[45] = new File(sourceFileVAPath);
			files[46] = new File(sourceFileVTPath);
			files[47] = new File(sourceFileWAPath);
			files[48] = new File(sourceFileWIPath);
			files[49] = new File(sourceFileWVPath);	
			files[50] = new File(sourceFileWYPath);			
			
			
			File mergedFile = new File(mergedFilePath);
	 
			mergeFiles(files, mergedFile);
		}
	 
		public static void mergeFiles(File[] files, File mergedFile) {
	 
			FileWriter fstream = null;
			BufferedWriter out = null;
			try {
				fstream = new FileWriter(mergedFile, true);
				 out = new BufferedWriter(fstream);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	     
			for (File f : files) {
				System.out.println("merging: " + f.getName());
				FileInputStream fis;
				try {
					
					fis = new FileInputStream(f);
					BufferedReader in = new BufferedReader(new InputStreamReader(fis));
	 
					String aLine;
					
					while ((aLine = in.readLine()) != null) {
						out.write(aLine);
						out.newLine();
						
					}
	                 
					in.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	 
			
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	 
		}

	

	
}
