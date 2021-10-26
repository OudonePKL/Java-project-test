public class Diamond {

    static void diamond(){
        
        int a = 6;

        for(int i = 1; i <= a; i++){
            for(int j = i; j < a; j++){
                System.out.print(" ");
            }
            for(int j = 1; j < (i*2); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = a-1; i >= 1; i--){
            for(int j = a; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j < (i*2); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond();
    }
}