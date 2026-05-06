public class Orang {
    private String nama;
    private String email;
    
    public Orang(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
    
    public static void main(String[] args) {
        Orang orang = new Orang("rafa", "rafa@email.com");
        orang.tampilkanInfo();
    }
}