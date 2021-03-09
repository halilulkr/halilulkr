public class Main {

    public static void main(String[] args) {
        int number = 2;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir.");
            return; //eğer bu blok çalışırsa döngüden sonra ki bloğun çalışmasını engeller.
        }

        if (number < 1) {
            System.out.println("Geçersiz sayı!");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) { //(isPrime == true) ile aynıdır.
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }

    }
}
