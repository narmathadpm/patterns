// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                if(j <= i){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
             for(int j = n-1; j > 0; j--){
                if(j <= i){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}