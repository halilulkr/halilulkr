public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int aranacak = 7;
        boolean varMi = false;
        for (int i : sayilar) {
            if (aranacak == i) {
                varMi = true;
                break;
            }
        }
        if (varMi == true) {
            System.out.println("Girdiğiniz sayı dizi içerisinde mevcuttur.");
        } else {
            System.out.println("Girdiğiniz sayı dizi içerisinde mevcut değildir.");
        }

    }
}

