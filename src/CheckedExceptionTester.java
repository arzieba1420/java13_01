import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionTester {
    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionTester checkedExceptionTester = new CheckedExceptionTester();
        CheckedExceptionTester checkedExceptionTester1 = new CheckedExceptionTester();
        checkedExceptionTester.urlTesterByTryCatch("aaahttp://wszib.edu.pl");
        checkedExceptionTester1.urlTesterByThrows("aaahttp://wszib.edu.pl");

    }

    public void urlTesterByTryCatch(String urlStr){
        try {
            URL url = new URL(urlStr);
            System.out.println("Tutaj nie wejdziemy");
            System.out.println("Protocol "+url.getProtocol());
            System.out.println("Host "+url.getHost());
        } catch(MalformedURLException mue){
            System.out.println("Obsługujemy wyjątek...");
           /* mue.printStackTrace();*/
        }
        System.out.println("Program działa nadal");
    }

    public void urlTesterByThrows(String urlStr) throws MalformedURLException {

        URL url = new URL(urlStr);
        System.out.println("Protocol "+url.getProtocol());
        System.out.println("Host "+url.getHost());
    }

}
