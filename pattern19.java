// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i <= n*2 ; i++){
            for(int j = 1; j <= n*2; j++){
                if(j > n-i+1 && j <= n+i-1){
                System.out.print(" ");
                }else{
                  System.out.print("*");  
                }
            }
            System.out.println();
        }
    }
}