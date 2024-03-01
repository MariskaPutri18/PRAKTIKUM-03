
    public class person {
        private String nama;
        private int umur;
    
        // Konstruktor tanpa parameter
        public person() {
            this.nama = "Undefined";
            this.umur= 0;
        }
    
        // Konstruktor dengan parameter
        public person(String nama, int umur) {
            this.nama = nama;
            this.umur = umur;
        }
    
        // Metode untuk mendapatkan nama
        public String getName() {
            return nama;
        }
    
        // Metode untuk mendapatkan usia
        public int getAge() {
            return umur;
        }
    
        public static void main(String[] args) {
            // Membuat objek menggunakan konstruktor tanpa parameter
            person person1 = new person();
            System.out.println("Nama: " + person1.getName()); // Output: Undefined
            System.out.println("umur: " + person1.getAge());   // Output: 0
    
            // Membuat objek menggunakan konstruktor dengan parameter
            person person2 = new person("John", 30);
            System.out.println("Nama: " + person2.getName()); // Output: John
            System.out.println("umur: " + person2.getAge());   // Output: 30
        }
    }

