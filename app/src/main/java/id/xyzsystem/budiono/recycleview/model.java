package id.xyzsystem.budiono.recycleview;

/**
 * Created by budiono on 14/01/18.
 */

public class model {
    String eng, indo;
    int gambar;

    public model(int gambar, String eng, String indo) {
        this.gambar = gambar;
        this.eng = eng;
        this.indo = indo;
    }

    public int getGambar() {
        return gambar;
    }

    public String getEng() {
        return eng;
    }

    public String getIndo() {
        return indo;
    }
}