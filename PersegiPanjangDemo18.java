import java.util.Scanner;
public class PersegiPanjangDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang18[] arrayOfPersegiPanjang = new PersegiPanjang18[3];

        for (int i = 0; i < 3; i ++) {
            arrayOfPersegiPanjang[i] = new PersegiPanjang18();

            System.out.println("Persegi Panjang ke-" + (i + 1));
            System.out.print("Masukkan Panjang: ");
            arrayOfPersegiPanjang[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            arrayOfPersegiPanjang[i].lebar = sc.nextInt();
        }

        for (int i =0; i<3; i++){
            System.out.println("Persegi Panjang ke-" + (i + 1)+ ", panjang:" + arrayOfPersegiPanjang[i].panjang + ", lebar: " +arrayOfPersegiPanjang[i].lebar); 
        }
    }
}

