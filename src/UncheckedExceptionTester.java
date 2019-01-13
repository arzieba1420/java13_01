public class UncheckedExceptionTester {
    public static void main(String[] args) {
        UncheckedExceptionTester uncheckedExceptionTester = new UncheckedExceptionTester();
        int i=uncheckedExceptionTester.getNumberFromString("9b");
        if (i!=-1) {
            System.out.println("Oto nasza liczba pomnożona przez 99: " + i * 99);
        }

    }

    public int getNumberFromString(String strNum){
        try {
            return Integer.parseInt(strNum);
        } catch (NumberFormatException nfe){
            System.out.println("Coś poszło nie tak...Upewnij się że przekazywany napis jest liczbą");
        }
        return -1;
    }












}
