// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}