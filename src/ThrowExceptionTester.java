public class ThrowExceptionTester {
    public static void main(String[] args) {
        ThrowExceptionTester throwExceptionTester = new ThrowExceptionTester();

        int hours = -3;

        int numOfSec = 0;

        try {
            numOfSec = throwExceptionTester.calcNumOfSec(hours);
        } catch (IllegalArgumentException iae) {
            numOfSec = throwExceptionTester.calcNumOfSec(hours*(-1));
        }

        System.out.println("Liczba sekund to: "+numOfSec);

    }

    public int calcNumOfSec(int h){

        if (h<0){
            throw new IllegalArgumentException("Liczba godzin musi być większa lub równa 0"+ h);
        }

        return h*3600;
    }





}



