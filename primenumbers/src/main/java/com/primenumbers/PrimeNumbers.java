package com.primenumbers;

class PrimeNumbers {    
    public boolean isPrime(int n) {
        if (n <= 1) return false; // prime number have to be greater than 1
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
