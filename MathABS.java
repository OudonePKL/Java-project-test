public class MathABS {
    
    static void diamond(){
        int size = 9, num = 1, halfSize = Math.abs(size/2);

        for (int i = 1; i <= size; i++){
            for (int j = halfSize; j >= 1; j--){ 
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++){ 
                System.out.print("*");
            }
            System.out.println();
            if (i < size/2+1) {
                num += 2; // num => 1,3,5,7,9
                halfSize -= 1; // halfSize => 4,3,2,1
            } else {
                num -= 2; // num => 5,3,1
                halfSize += 1; //halfSize => 1,2,3
            }
        }
    }

    public static void main(String[] args) {
        diamond();
    }
}
