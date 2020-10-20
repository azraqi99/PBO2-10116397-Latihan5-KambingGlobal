/*
@author 
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Kambing Global
 */
package pbo210116397latihan5;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan5 {

 int jumlahKambing = 88;

    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: "+jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: "+jumlahKambing);
    }
    
    
    public static void main(String[] args) {
      PBO210116397Latihan5 kambingSusu = new PBO210116397Latihan5();
      
      kambingSusu.getJumlahKambing();
      
      kambingSusu.tambahKambing();
      
      kambingSusu.getJumlahKambing();
    }
    
}
