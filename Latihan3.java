public class Latihan3 {
    public static void main(String[] args) {
        int[][][] biner = {{{0,0,0},
         			     {0,0,1},
           				 {0,1,0},
            			 {0,1,1},
            			 {1,0,0},
            			 {1,0,1},
            			 {1,1,0},
            			 {1,1,1}}};

        for (int i = 0; i <biner.length;i++) {
            for (int j = 0; j <biner[0].length; j++) {
				for (int k = 0; k <biner[0][0].length; k++) {
                   System.out.print(biner[i][j][k]);
                   if (k<2)
                     System.out.print("|");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}