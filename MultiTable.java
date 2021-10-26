public class MultiTable {

    // Create new method
    static void multiplicationTable(int startNum, int stopNum){
        for (int i = startNum; i <= stopNum; i++) {
            System.out.println("Multiplication table " + i);
            for (int j = 1; j <= 12; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            } 
        }
    }
    public static void main(String[] args) {
        multiplicationTable(4, 9);
    }
}
