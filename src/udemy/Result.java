package udemy;

class Result {
    private int n;
    /*
     * Complete the 'isPrime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public void Prime(int n) {
        this.n = n;
    }

    public static int isPrime(long n){
        int cont2 = 0;
        for(int cont1 = 1; cont1<= n; cont1++){
            if ((n % cont1) == 0){
                cont2++;
    }
            if (cont2 == 2){
                return 1;
            }
            else {
                return (int) (n%2);
            }
        }
        return cont2;
    }
}