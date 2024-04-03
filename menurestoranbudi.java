import java.util.Scanner;

public class MenuRestoran {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Display the menu
        System.out.println("Selamat Datang di Restoran Budi");
        System.out.println("1. Soto Ayam - Rp15.000");
        System.out.println("2. Bistik Sapi - Rp35.000");
        System.out.println("3. Sop Iga Bakar - Rp25.000");
        System.out.println("4. Sate Ayam - Rp27.000");
        System.out.println("5. Keluar");
        System.out.println("Masukkan Menu Yang Anda Ingin Pesan:");

        // Read user input
        int choice = scanner.nextInt();

        // Process the user's choice
        switch (choice) {
        	case 1:
                System.out.println("Anda Memilih Soto Ayam. Mohon Ditunggu Pesanan Anda Segera Datang!");
                break;
            case 2:
                System.out.println("Anda Memilih Bistik Sapi. Mohon Ditunggu Pesanan Anda Segera Datang!");
                break;
            case 3:
                System.out.println("Anda Memilih Sop Iga Bakar. Mohon Ditunggu Pesanan Anda Segera Datang!");
                break;
            case 4:
                System.out.println("Anda Memilih Sate Ayam. Mohon Ditunggu Pesanan Anda Segera Datang!");
                break;
            case 5:
                System.out.println("Terima Kasih, Telah Datang ke Restoran Kami!");
                break;
            default:
                System.out.println("Invalid choices");
        }

        // Close the scanner
        scanner.close();
    }
}
