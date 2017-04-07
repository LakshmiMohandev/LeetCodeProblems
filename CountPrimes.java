/*
 * 204. Count Primes
 * Count the number of prime numbers less than a non-negative number, n.*/
public class Solution {
    public int countPrimes(int n) {
        int count=0;
        
        if(n<2) return 0;
        
        boolean markPrimes[] = new boolean[n];
        
        for (int i = 2; i < n; i++)
		    markPrimes[i] = true;
 
    	for (int i = 2; i <= Math.sqrt(n - 1); i++) {
    	// or for (int i = 2; i <= n-1; i++) {
    		if (markPrimes[i]) {
    			for (int j = i + i; j < n; j += i)
	    			markPrimes[j] = false;
		    }
	    }
 
	    for (int i = 2; i < n; i++) {
		    if (markPrimes[i])
			    count++;
	    }
 
	    return count;
    }
}
/*
n=43
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199.
*/