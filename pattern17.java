// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < 2*n; j++){
                if(j >= n-i+1 && j <= n+i-1){
                if(j >= n){
                System.out.print((char)('A'+(i-1-((j%n)))));
                }else{
                System.out.print((char)('A'+(i-1-(n-(j%n)))));
                }
                }else{
                  System.out.print(" ");  
                }
            }
            System.out.println();
        }
    }
}