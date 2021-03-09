public class Main {

    public static void main(String[] args) {
        char harfler = 't';

        switch (harfler) {
            case 'a':
            case 'o':
            case 'u':
            case 'ı':
                System.out.println("Kalın ünlü");
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("İnce ünlü");
                break;
            default:
                System.out.println("Hatalı harf!");
        }
    }
}
