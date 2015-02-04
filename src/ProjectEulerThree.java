/**
 * Created by rckndn on 2/3/15.
 */
public class ProjectEulerThree {


  public static void main(String[] args) {
    long value = 600851475143L;
    long maxFactor = 0;

    for (int i = 3; i < Math.sqrt(value); i+=2) {
      if ( (value % i == 0) && isPrime(i) ) {
        if (i > maxFactor) {
          maxFactor = i;
        }
      }
    }
    System.out.println("max factor: " +  maxFactor);

  }


  public static boolean isPrime(int value) {

    for (int i = 3; i < Math.sqrt(value); i+=2) {
      if (value % i == 0) {
        return false;
      }
    }
    return true;

  }

}
