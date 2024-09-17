public class ArrayBuah {
    public static void main(String[] args) {
        String[] arrayBuah = {"Pisang", "Apel", "Mangga", "Jeruk"};

        // 1. Perulangan for
        for (int i = 0; i < arrayBuah.length; i++) {
            System.out.println(arrayBuah[i]);
        }

        // 2. Perulangan for-each
        for (String buah : arrayBuah) {
            System.out.println(buah);
        }

        // 3. Perulangan while
        int i = 0;
        while (i < arrayBuah.length) {
            System.out.println(arrayBuah[i]);
            i++;
        }

        // 4. Perulangan do-while
        int j = 0;
        do {
            System.out.println(arrayBuah[j]);
            j++;
        } while (j < arrayBuah.length);
    }
}
