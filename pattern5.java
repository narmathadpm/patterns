// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}