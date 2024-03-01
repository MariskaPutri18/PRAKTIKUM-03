import java.util.Scanner;
public class PersegiPanjangDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        System.out.print("Masukkan nilai n:");
        n = sc.nextInt();
        PersegiPanjang18[] arrayOfPersegiPanjang = new PersegiPanjang18[n];
        int panjang,lebar;
    
        for (int i = 0; i < n; i ++) {
           System.out.println("persegi panjang ke- "+ (i+1));
           System.out.print("Masukkan panjang: ");
           panjang = sc.nextInt();
           System.out.print("masukkan lebar: ");
           lebar = sc.nextInt();
           arrayOfPersegiPanjang[i] = new PersegiPanjang18(panjang, lebar);
        }

        for (int i =0; i<n; i++){
            System.out.println("Persegi Panjang ke-" + (i + 1)+ ", panjang:" + arrayOfPersegiPanjang[i].panjang + ", lebar: " +arrayOfPersegiPanjang[i].lebar
             + ", Luas: " + arrayOfPersegiPanjang[i].hitungLuas() + ", Keliling: " + arrayOfPersegiPanjang[i].hitungKeliling()); 
        }

        
        
    }
}

