package pbofs112b.pkg2022428916.latihan59.detectiveconan;

/**
 *
 * @author Kus Andi Priyono
 */
public class KarakterUtama extends Karakter{
    private String tujuan, tim;
    
    public KarakterUtama(String nama, String peran, String tujuan, String tim) {
        super(nama, peran);
        this.tujuan = tujuan;
        this.tim = tim;
    }
    public String getTujuan() {
        return tujuan;
    }
    public String getTim() {
        return tim;
    }
    public void tampilKarakterUtama() {
        System.out.println("Nama Karakter   : " + getNama());
        System.out.println("Peran           : " + getPeran());
        System.out.println("Tim             : " + getTim());
        System.out.println("Tujuan          : " + getTujuan());
        System.out.println("");
    }
}
