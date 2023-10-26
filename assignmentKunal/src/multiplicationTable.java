public class multiplicationTable {
    public static void main(String[] args) {
    for(int row=1;row<11;row++){
        for(int col=1;col<11;col++){
            int product = row*col;
            System.out.println(row+ "X" +col +"=" +product);
        }
        System.out.println();

    }

    }
}
