package com.primenumbers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeNumbersTest {
    public PrimeNumbers primeNumbers = new PrimeNumbers();
    
    @Test
    public void testIsPrime() {
        assertTrue(primeNumbers.isPrime(3));
        assertFalse(primeNumbers.isPrime(57));
    }
}
