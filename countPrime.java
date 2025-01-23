class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true) ;
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i*i<n; i++) {
            if(isPrime[i]) {
                for(int k = i*i; k < n; k += i) {
                    isPrime[k] = false;
                }
            }        }

int count = 0;
for(boolean prime : isPrime) {
    if(prime) count++;
}
return count;
    }
}
