public class Main {

    public static void main(String[] args) {
	double[] myList = {1.2,5.7,11.5,3.1,25.9,17.3,6.2,31.1};
	double total = 0;
	double max = myList[0];

	for (double number:myList){
	    if (max<number){
	        max = number;
        }
	    total += number;
	    System.out.println(number);
    }
	System.out.println("Toplam değer: "+ total);
	System.out.println("En büyük değer: "+max);
    }
}
