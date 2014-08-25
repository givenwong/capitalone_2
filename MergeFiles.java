package name;

import java.io.*;

public class MergeFiles {
	
	public static void main(String[] args) {
		
		// the source
		String sourceFile1880Path = "C:/Users/econometrican/Desktop/names/yob1880.txt";
		String sourceFile1881Path = "C:/Users/econometrican/Desktop/names/yob1881.txt";
		String sourceFile1882Path = "C:/Users/econometrican/Desktop/names/yob1882.txt";
		String sourceFile1883Path = "C:/Users/econometrican/Desktop/names/yob1883.txt";
		String sourceFile1884Path = "C:/Users/econometrican/Desktop/names/yob1884.txt";
		String sourceFile1885Path = "C:/Users/econometrican/Desktop/names/yob1885.txt";
		String sourceFile1886Path = "C:/Users/econometrican/Desktop/names/yob1886.txt";
		String sourceFile1887Path = "C:/Users/econometrican/Desktop/names/yob1887.txt";
		String sourceFile1888Path = "C:/Users/econometrican/Desktop/names/yob1888.txt";
		String sourceFile1889Path = "C:/Users/econometrican/Desktop/names/yob1889.txt";
		String sourceFile1890Path = "C:/Users/econometrican/Desktop/names/yob1890.txt";
		String sourceFile1891Path = "C:/Users/econometrican/Desktop/names/yob1891.txt";
		String sourceFile1892Path = "C:/Users/econometrican/Desktop/names/yob1892.txt";
		String sourceFile1893Path = "C:/Users/econometrican/Desktop/names/yob1893.txt";
		String sourceFile1894Path = "C:/Users/econometrican/Desktop/names/yob1894.txt";
		String sourceFile1895Path = "C:/Users/econometrican/Desktop/names/yob1895.txt";
		String sourceFile1896Path = "C:/Users/econometrican/Desktop/names/yob1896.txt";
		String sourceFile1897Path = "C:/Users/econometrican/Desktop/names/yob1897.txt";
		String sourceFile1898Path = "C:/Users/econometrican/Desktop/names/yob1898.txt";
		String sourceFile1899Path = "C:/Users/econometrican/Desktop/names/yob1899.txt";
		String sourceFile1900Path = "C:/Users/econometrican/Desktop/names/yob1900.txt";
		String sourceFile1901Path = "C:/Users/econometrican/Desktop/names/yob1901.txt";
		String sourceFile1902Path = "C:/Users/econometrican/Desktop/names/yob1902.txt";
		String sourceFile1903Path = "C:/Users/econometrican/Desktop/names/yob1903.txt";
		String sourceFile1904Path = "C:/Users/econometrican/Desktop/names/yob1904.txt";
		String sourceFile1905Path = "C:/Users/econometrican/Desktop/names/yob1905.txt";
		String sourceFile1906Path = "C:/Users/econometrican/Desktop/names/yob1906.txt";
		String sourceFile1907Path = "C:/Users/econometrican/Desktop/names/yob1907.txt";
		String sourceFile1908Path = "C:/Users/econometrican/Desktop/names/yob1908.txt";
		String sourceFile1909Path = "C:/Users/econometrican/Desktop/names/yob1909.txt";		
	    String sourceFile1910Path = "C:/Users/econometrican/Desktop/names/yob1910.txt";
		String sourceFile1911Path = "C:/Users/econometrican/Desktop/names/yob1911.txt";
		String sourceFile1912Path = "C:/Users/econometrican/Desktop/names/yob1912.txt";
		String sourceFile1913Path = "C:/Users/econometrican/Desktop/names/yob1913.txt";
		String sourceFile1914Path = "C:/Users/econometrican/Desktop/names/yob1914.txt";
		String sourceFile1915Path = "C:/Users/econometrican/Desktop/names/yob1915.txt";
		String sourceFile1916Path = "C:/Users/econometrican/Desktop/names/yob1916.txt";
		String sourceFile1917Path = "C:/Users/econometrican/Desktop/names/yob1917.txt";
		String sourceFile1918Path = "C:/Users/econometrican/Desktop/names/yob1918.txt";
		String sourceFile1919Path = "C:/Users/econometrican/Desktop/names/yob1919.txt";
		String sourceFile1920Path = "C:/Users/econometrican/Desktop/names/yob1920.txt";
		String sourceFile1921Path = "C:/Users/econometrican/Desktop/names/yob1921.txt";
		String sourceFile1922Path = "C:/Users/econometrican/Desktop/names/yob1922.txt";
		String sourceFile1923Path = "C:/Users/econometrican/Desktop/names/yob1923.txt";
		String sourceFile1924Path = "C:/Users/econometrican/Desktop/names/yob1924.txt";
		String sourceFile1925Path = "C:/Users/econometrican/Desktop/names/yob1925.txt";
		String sourceFile1926Path = "C:/Users/econometrican/Desktop/names/yob1926.txt";
		String sourceFile1927Path = "C:/Users/econometrican/Desktop/names/yob1927.txt";
		String sourceFile1928Path = "C:/Users/econometrican/Desktop/names/yob1928.txt";
		String sourceFile1929Path = "C:/Users/econometrican/Desktop/names/yob1929.txt";
		String sourceFile1930Path = "C:/Users/econometrican/Desktop/names/yob1930.txt";
		String sourceFile1931Path = "C:/Users/econometrican/Desktop/names/yob1931.txt";
		String sourceFile1932Path = "C:/Users/econometrican/Desktop/names/yob1932.txt";
		String sourceFile1933Path = "C:/Users/econometrican/Desktop/names/yob1933.txt";
		String sourceFile1934Path = "C:/Users/econometrican/Desktop/names/yob1934.txt";
		String sourceFile1935Path = "C:/Users/econometrican/Desktop/names/yob1935.txt";
		String sourceFile1936Path = "C:/Users/econometrican/Desktop/names/yob1936.txt";
		String sourceFile1937Path = "C:/Users/econometrican/Desktop/names/yob1937.txt";
		String sourceFile1938Path = "C:/Users/econometrican/Desktop/names/yob1938.txt";
		String sourceFile1939Path = "C:/Users/econometrican/Desktop/names/yob1939.txt";
		String sourceFile1940Path = "C:/Users/econometrican/Desktop/names/yob1940.txt";
		String sourceFile1941Path = "C:/Users/econometrican/Desktop/names/yob1941.txt";
		String sourceFile1942Path = "C:/Users/econometrican/Desktop/names/yob1942.txt";
		String sourceFile1943Path = "C:/Users/econometrican/Desktop/names/yob1943.txt";
		String sourceFile1944Path = "C:/Users/econometrican/Desktop/names/yob1944.txt";
		String sourceFile1945Path = "C:/Users/econometrican/Desktop/names/yob1945.txt";
		String sourceFile1946Path = "C:/Users/econometrican/Desktop/names/yob1946.txt";
		String sourceFile1947Path = "C:/Users/econometrican/Desktop/names/yob1947.txt";
		String sourceFile1948Path = "C:/Users/econometrican/Desktop/names/yob1948.txt";
		String sourceFile1949Path = "C:/Users/econometrican/Desktop/names/yob1949.txt";
		String sourceFile1950Path = "C:/Users/econometrican/Desktop/names/yob1950.txt";
		String sourceFile1951Path = "C:/Users/econometrican/Desktop/names/yob1951.txt";
		String sourceFile1952Path = "C:/Users/econometrican/Desktop/names/yob1952.txt";
		String sourceFile1953Path = "C:/Users/econometrican/Desktop/names/yob1953.txt";
		String sourceFile1954Path = "C:/Users/econometrican/Desktop/names/yob1954.txt";
		String sourceFile1955Path = "C:/Users/econometrican/Desktop/names/yob1955.txt";
		String sourceFile1956Path = "C:/Users/econometrican/Desktop/names/yob1956.txt";
		String sourceFile1957Path = "C:/Users/econometrican/Desktop/names/yob1957.txt";
		String sourceFile1958Path = "C:/Users/econometrican/Desktop/names/yob1958.txt";
		String sourceFile1959Path = "C:/Users/econometrican/Desktop/names/yob1959.txt";
		String sourceFile1960Path = "C:/Users/econometrican/Desktop/names/yob1960.txt";
		String sourceFile1961Path = "C:/Users/econometrican/Desktop/names/yob1961.txt";
		String sourceFile1962Path = "C:/Users/econometrican/Desktop/names/yob1962.txt";
		String sourceFile1963Path = "C:/Users/econometrican/Desktop/names/yob1963.txt";
		String sourceFile1964Path = "C:/Users/econometrican/Desktop/names/yob1964.txt";
		String sourceFile1965Path = "C:/Users/econometrican/Desktop/names/yob1965.txt";
		String sourceFile1966Path = "C:/Users/econometrican/Desktop/names/yob1966.txt";
		String sourceFile1967Path = "C:/Users/econometrican/Desktop/names/yob1967.txt";
		String sourceFile1968Path = "C:/Users/econometrican/Desktop/names/yob1968.txt";
		String sourceFile1969Path = "C:/Users/econometrican/Desktop/names/yob1969.txt";
		String sourceFile1970Path = "C:/Users/econometrican/Desktop/names/yob1970.txt";
		String sourceFile1971Path = "C:/Users/econometrican/Desktop/names/yob1971.txt";
		String sourceFile1972Path = "C:/Users/econometrican/Desktop/names/yob1972.txt";
		String sourceFile1973Path = "C:/Users/econometrican/Desktop/names/yob1973.txt";
		String sourceFile1974Path = "C:/Users/econometrican/Desktop/names/yob1974.txt";
		String sourceFile1975Path = "C:/Users/econometrican/Desktop/names/yob1975.txt";
		String sourceFile1976Path = "C:/Users/econometrican/Desktop/names/yob1976.txt";
		String sourceFile1977Path = "C:/Users/econometrican/Desktop/names/yob1977.txt";
		String sourceFile1978Path = "C:/Users/econometrican/Desktop/names/yob1978.txt";
		String sourceFile1979Path = "C:/Users/econometrican/Desktop/names/yob1979.txt";
		String sourceFile1980Path = "C:/Users/econometrican/Desktop/names/yob1980.txt";
		String sourceFile1981Path = "C:/Users/econometrican/Desktop/names/yob1981.txt";
		String sourceFile1982Path = "C:/Users/econometrican/Desktop/names/yob1982.txt";
		String sourceFile1983Path = "C:/Users/econometrican/Desktop/names/yob1983.txt";
		String sourceFile1984Path = "C:/Users/econometrican/Desktop/names/yob1984.txt";
		String sourceFile1985Path = "C:/Users/econometrican/Desktop/names/yob1985.txt";
		String sourceFile1986Path = "C:/Users/econometrican/Desktop/names/yob1986.txt";
		String sourceFile1987Path = "C:/Users/econometrican/Desktop/names/yob1987.txt";
		String sourceFile1988Path = "C:/Users/econometrican/Desktop/names/yob1988.txt";
		String sourceFile1989Path = "C:/Users/econometrican/Desktop/names/yob1989.txt";
		String sourceFile1990Path = "C:/Users/econometrican/Desktop/names/yob1990.txt";
		String sourceFile1991Path = "C:/Users/econometrican/Desktop/names/yob1991.txt";
		String sourceFile1992Path = "C:/Users/econometrican/Desktop/names/yob1992.txt";
		String sourceFile1993Path = "C:/Users/econometrican/Desktop/names/yob1993.txt";
		String sourceFile1994Path = "C:/Users/econometrican/Desktop/names/yob1994.txt";
		String sourceFile1995Path = "C:/Users/econometrican/Desktop/names/yob1995.txt";
		String sourceFile1996Path = "C:/Users/econometrican/Desktop/names/yob1996.txt";
		String sourceFile1997Path = "C:/Users/econometrican/Desktop/names/yob1997.txt";
		String sourceFile1998Path = "C:/Users/econometrican/Desktop/names/yob1998.txt";
		String sourceFile1999Path = "C:/Users/econometrican/Desktop/names/yob1999.txt";
		String sourceFile2000Path = "C:/Users/econometrican/Desktop/names/yob2000.txt";
		String sourceFile2001Path = "C:/Users/econometrican/Desktop/names/yob2001.txt";
		String sourceFile2002Path = "C:/Users/econometrican/Desktop/names/yob2002.txt";
		String sourceFile2003Path = "C:/Users/econometrican/Desktop/names/yob2003.txt";
		String sourceFile2004Path = "C:/Users/econometrican/Desktop/names/yob2004.txt";
		String sourceFile2005Path = "C:/Users/econometrican/Desktop/names/yob2005.txt";
		String sourceFile2006Path = "C:/Users/econometrican/Desktop/names/yob2006.txt";
		String sourceFile2007Path = "C:/Users/econometrican/Desktop/names/yob2007.txt";
		String sourceFile2008Path = "C:/Users/econometrican/Desktop/names/yob2008.txt";
		String sourceFile2009Path = "C:/Users/econometrican/Desktop/names/yob2009.txt";
		String sourceFile2010Path = "C:/Users/econometrican/Desktop/names/yob2010.txt";
		String sourceFile2011Path = "C:/Users/econometrican/Desktop/names/yob2011.txt";
		String sourceFile2012Path = "C:/Users/econometrican/Desktop/names/yob2012.txt";
		String sourceFile2013Path = "C:/Users/econometrican/Desktop/names/yob2013.txt";
       
		// the target 
		String mergedFilePath = "C:/Users/econometrican/Desktop/names/usa_all.txt";
 
		File[] files = new File[134];
		
		files[0] = new File(sourceFile1880Path);
		files[1] = new File(sourceFile1881Path);
		files[2] = new File(sourceFile1882Path);
		files[3] = new File(sourceFile1883Path);
		files[4] = new File(sourceFile1884Path);
		files[5] = new File(sourceFile1885Path);
		files[6] = new File(sourceFile1886Path);
		files[7] = new File(sourceFile1887Path);
		files[8] = new File(sourceFile1888Path);
		files[9] = new File(sourceFile1889Path);
		files[10] = new File(sourceFile1890Path);
		files[11] = new File(sourceFile1891Path);
		files[12] = new File(sourceFile1892Path);
		files[13] = new File(sourceFile1893Path);
		files[14] = new File(sourceFile1894Path);
		files[15] = new File(sourceFile1895Path);
		files[16] = new File(sourceFile1896Path);
		files[17] = new File(sourceFile1897Path);
		files[18] = new File(sourceFile1898Path);
		files[19] = new File(sourceFile1899Path);
		files[20] = new File(sourceFile1900Path);
		files[21] = new File(sourceFile1901Path);
		files[22] = new File(sourceFile1902Path);
		files[23] = new File(sourceFile1903Path);
		files[24] = new File(sourceFile1904Path);
		files[25] = new File(sourceFile1905Path);
		files[26] = new File(sourceFile1906Path);
		files[27] = new File(sourceFile1907Path);
		files[28] = new File(sourceFile1908Path);
		files[29] = new File(sourceFile1909Path);
		files[30] = new File(sourceFile1910Path);
		files[31] = new File(sourceFile1911Path);
		files[32] = new File(sourceFile1912Path);
		files[33] = new File(sourceFile1913Path);
		files[34] = new File(sourceFile1914Path);
		files[35] = new File(sourceFile1915Path);
		files[36] = new File(sourceFile1916Path);
		files[37] = new File(sourceFile1917Path);
		files[38] = new File(sourceFile1918Path);
		files[39] = new File(sourceFile1919Path);
		files[40] = new File(sourceFile1920Path);
		files[41] = new File(sourceFile1921Path);
		files[42] = new File(sourceFile1922Path);
		files[43] = new File(sourceFile1923Path);
		files[44] = new File(sourceFile1924Path);
		files[45] = new File(sourceFile1925Path);
		files[46] = new File(sourceFile1926Path);
		files[47] = new File(sourceFile1927Path);
		files[48] = new File(sourceFile1928Path);
		files[49] = new File(sourceFile1929Path);
		files[50] = new File(sourceFile1930Path);
		files[51] = new File(sourceFile1931Path);
		files[52] = new File(sourceFile1932Path);
		files[53] = new File(sourceFile1933Path);
		files[54] = new File(sourceFile1934Path);
		files[55] = new File(sourceFile1935Path);
		files[56] = new File(sourceFile1936Path);
		files[57] = new File(sourceFile1937Path);
		files[58] = new File(sourceFile1938Path);
		files[59] = new File(sourceFile1939Path);
		files[60] = new File(sourceFile1940Path);
		files[61] = new File(sourceFile1941Path);
		files[62] = new File(sourceFile1942Path);
		files[63] = new File(sourceFile1943Path);
		files[64] = new File(sourceFile1944Path);
		files[65] = new File(sourceFile1945Path);
		files[66] = new File(sourceFile1946Path);
		files[67] = new File(sourceFile1947Path);
		files[68] = new File(sourceFile1948Path);
		files[69] = new File(sourceFile1949Path);
		files[70] = new File(sourceFile1950Path);
		files[71] = new File(sourceFile1951Path);
		files[72] = new File(sourceFile1952Path);
		files[73] = new File(sourceFile1953Path);
		files[74] = new File(sourceFile1954Path);
		files[75] = new File(sourceFile1955Path);
		files[76] = new File(sourceFile1956Path);
		files[77] = new File(sourceFile1957Path);
		files[78] = new File(sourceFile1958Path);
		files[79] = new File(sourceFile1959Path);
		files[80] = new File(sourceFile1960Path);
		files[81] = new File(sourceFile1961Path);
		files[82] = new File(sourceFile1962Path);
		files[83] = new File(sourceFile1963Path);
		files[84] = new File(sourceFile1964Path);
		files[85] = new File(sourceFile1965Path);
		files[86] = new File(sourceFile1966Path);
		files[87] = new File(sourceFile1967Path);
		files[88] = new File(sourceFile1968Path);
		files[89] = new File(sourceFile1969Path);
		files[90] = new File(sourceFile1970Path);
		files[91] = new File(sourceFile1971Path);
		files[92] = new File(sourceFile1972Path);
		files[93] = new File(sourceFile1973Path);
		files[94] = new File(sourceFile1974Path);
		files[95] = new File(sourceFile1975Path);
		files[96] = new File(sourceFile1976Path);
		files[97] = new File(sourceFile1977Path);
		files[98] = new File(sourceFile1978Path);
		files[99] = new File(sourceFile1979Path);
		files[100] = new File(sourceFile1980Path);
		files[101] = new File(sourceFile1981Path);
		files[102] = new File(sourceFile1982Path);
		files[103] = new File(sourceFile1983Path);
		files[104] = new File(sourceFile1984Path);
		files[105] = new File(sourceFile1985Path);
		files[106] = new File(sourceFile1986Path);
		files[107] = new File(sourceFile1987Path);
		files[108] = new File(sourceFile1988Path);
		files[109] = new File(sourceFile1989Path);
		files[110] = new File(sourceFile1990Path);
		files[111] = new File(sourceFile1991Path);
		files[112] = new File(sourceFile1992Path);
		files[113] = new File(sourceFile1993Path);
		files[114] = new File(sourceFile1994Path);
		files[115] = new File(sourceFile1995Path);
		files[116] = new File(sourceFile1996Path);
		files[117] = new File(sourceFile1997Path);
		files[118] = new File(sourceFile1998Path);
		files[119] = new File(sourceFile1999Path);
		files[120] = new File(sourceFile2000Path);
		files[121] = new File(sourceFile2001Path);
		files[122] = new File(sourceFile2002Path);
		files[123] = new File(sourceFile2003Path);
		files[124] = new File(sourceFile2004Path);
		files[125] = new File(sourceFile2005Path);
		files[126] = new File(sourceFile2006Path);
		files[127] = new File(sourceFile2007Path);
		files[128] = new File(sourceFile2008Path);
		files[129] = new File(sourceFile2009Path);
		files[130] = new File(sourceFile2010Path);
		files[131] = new File(sourceFile2011Path);
		files[132] = new File(sourceFile2012Path);
		files[133] = new File(sourceFile2013Path);
		
		
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
     
		int year = 1880;
		for (File f : files) {
			System.out.println("merging: " + f.getName());
			FileInputStream fis;
			try {
				
				fis = new FileInputStream(f);
				BufferedReader in = new BufferedReader(new InputStreamReader(fis));
 
				String aLine;
				
				while ((aLine = in.readLine()) != null) {
					out.write(aLine+','+ Integer.toString(year) );
					out.newLine();
					
				}
                 
				in.close();
				year++;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
 
		System.out.println(year);
		
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	}

}
