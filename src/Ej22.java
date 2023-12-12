public class Ej22 {
    public static void main(String[] args) {
        int bidi[][] = new int [5][15];

        for (int i = 0; i < bidi.length; i++) {
            for (int j = 0; j < 15; j++) {
                if ((i==0)||(i==4)) {
                    bidi[i][j]=1;
                }
                if ((j==0)||(j==14)) {
                    bidi[i][j]=1;
                }
                System.out.print(bidi[i][j]+" ");
            }
            System.out.println();
        }
    }
}
