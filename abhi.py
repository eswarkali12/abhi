def is_prime(num):
    # Numbers less than or equal to 1 are not prime
    if num <= 1:
        return False
    
    # Check for factors from 2 up to the square root of num
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False  # Factor found, so it is not prime
            
    return True  # No factors found, it is prime

# Example usage:
test_num = 29
if is_prime(test_num):
    print(f"{test_num} is a prime number")
else:
    print(f"{test_num} is not a prime number")
