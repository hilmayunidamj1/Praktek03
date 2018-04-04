package praktek03;

public class Kerudung {
  private String Merk;
  private String Warna;
  private Integer Harga;
  
  void cetakInfo (){
      System.out.println("Merk \t: "+Merk+"\n"+"Warna \t: "+Warna+"\n"+"Harga \t: "+Harga);
      
  }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public Integer getHarga() {
        return Harga;
    }

    public void setHarga(Integer Harga) {
        this.Harga = Harga;
    }
  
  
}
