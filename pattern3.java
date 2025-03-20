// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}