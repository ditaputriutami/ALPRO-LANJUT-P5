public class Latihan2 {
   public static void main( String []args){
     String entry[][][] = {{{"vianslezer", "100411052", "Surabaya"},
    					    {"Echa", "100411025", "Jakarta"},
    					    {"Masayu", "100411024", "Malang"},
    					    {"Belly","100411023","Bandung"},
    					    {"Jeremy","100411022","Medan"},
    					    {"Karina","100411021","Depok"},
    					    {"Conrad","100411020","Bogor"},
    					    {"Benny","100411019","Yogyakarta"}}};
      // Looping untuk menampilkan semua data
	 for (int i = 0; i < entry.length; i++) {
		for (int j = 0; j < entry[i].length; j++) {
		    System.out.println("Mahasiswa ke- "  + (j + 1));
		    System.out.println("Nama\t: " + entry[i][j][0]);
		    System.out.println("Nim\t: " + entry[i][j][1]);
		    System.out.println("Alamat\t: " + entry[i][j][2]);
            System.out.println("-------------------------");
        }
        System.out.println();
	 }
   }
}
