/**
 * Computes the largest prime factor of the number 600851475143.
 */
public class ProjectEulerThree {

  /**
   * Computes the largest prime factor of the number 600851475143.
   * @param args Arguments - ignored.
   */
  public static void main(String[] args) {
    long value = 600851475143L;
    long maxFactor = 0;

    for (int i = 3; i < Math.sqrt(value); i += 2) {
      if ((value % i == 0) && isPrime(i)) {
        if (i > maxFactor) {
          maxFactor = i;
        }
      }
    }
    System.out.println("max factor: " +  maxFactor);

  }


  /**
   * Determines if a given value is prime.
   * @param value The value to test.
   * @return True if the value is prime, false otherwise.
   */
  public static boolean isPrime(int value) {

    // All even numbers are not prime.
    if (value % 2 == 0) {
      return false;
    }

    double bound = Math.sqrt(value);
    for (int i = 3; i <= bound; i += 2) {
      if (value % i == 0) {
        return false;
      }
    }

    return true;

  }

}
