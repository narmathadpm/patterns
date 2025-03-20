// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print((j+i)%2+" ");
            }
            System.out.println();
        }
    }
}