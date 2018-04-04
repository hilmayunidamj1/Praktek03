package praktek03;
public class KerudungAksi {
    public static void main(String[] args) {
        Kerudung k = new Kerudung();

       k.setMerk("Zoya");
       k.setWarna("Merah");
       k.setHarga(70000);
        
        k.cetakInfo();
        
        System.out.println("Merknya \t:");
        System.out.println(k.getMerk());
        System.out.println("Warnanya \t:");
        System.out.println(k.getWarna());
        System.out.println("Harganya \t:");
        System.out.println(k.getHarga());
    }
}
