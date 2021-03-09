public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int toplamaSonucu = dortIslem.topla(3, 4);
        System.out.println("Toplama sonucu: " + toplamaSonucu);

        int cikarmaSonucu = dortIslem.cikar(10, 3);
        System.out.println("Çıkarma sonucu: " + cikarmaSonucu);

        int carpmaSonucu = dortIslem.carp(7, 1);
        System.out.println("Çarpma sonucu: " + carpmaSonucu);

        int bolmeSonucu = dortIslem.bol(7, 1);
        System.out.println("Bölme Sonucu: " + bolmeSonucu);

    }
}
