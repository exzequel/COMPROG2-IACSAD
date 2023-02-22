public class MultiplicationTable {
    public static void main(String[] args) {
        int x,y;
        int num[][] = new int [10][10];

        for (x=0; x<10; x++) {
            for (y=0; y<10; y++) {
                num[x][y] = (x+1) * (y+1);
            
                System.out.print(num[x][y] + "\t");
                
            }
            System.out.println();
        }

    }
}
