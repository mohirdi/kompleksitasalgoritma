import java.util.Scanner;


class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        int hasil = bilangan * bilangan;
        System.out.println("Hasil pangkat dua dari " + bilangan + " adalah: " + hasil);

        
    }

    public static int hitungPangkatDua(int bilangan) {
        int hasil = 1;
        for (int i = 0; i < bilangan; i++) {
            hasil *= 2;
        }

        return hasil;
    
}

}