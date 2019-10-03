Public Class Hack{
    void testFunc(int test){
        int f = test;
        for(int i = 0; i < 5; i++){
            // Print value of f by adding value of i on each iteration
            System.out.print(f+i);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        testFun(n);
    }
}

