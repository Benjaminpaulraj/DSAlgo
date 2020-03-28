package leetCode.topEasy.MathsPbs;

public class CountPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=="+countPrimes1(100));
		System.out.println("=="+countPrimes(100));
	}

	public static int countPrimes(int n) {
		
		boolean[] primes = new boolean[n];
		
		for(int i=2; i< n; i++) {
			primes[i] = true;
		}
		
		for(int i=2; i *i < n; i++) {
			if(!primes[i]) continue;
			for (int j = i*i; j < n ; j+=i) {
				primes[j] = false;
			}
			
		}
		int count =0;
		for (int i =2; i <n; i++) {
			if(primes[i]) {count++;
			System.out.print(i+",");
			}
		}
		return count;
	}
	
    public static int countPrimes1(int n) {
        if(n<1) return 0;
    	int count =0;
    	for(int i=1; i< n;i++) {
    		if(isPrime1(i)) {
    			count++;
    		}
    	}
    	
    	return count;
    }
    
    private static boolean isPrime1(int val) {
    	if (val <= 1) return false;
    	for(int i=2; i<= Math.sqrt(val); i++) {
    		if(val % i ==0) return false; 
    	}
    	return true;
    }
    
}
