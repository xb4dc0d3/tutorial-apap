package apap.tutorial.shapee.model;

public class StoreModel {

    public StoreModel(String id, String nama, String keterangan, int followers) {
        this.id = id;
        this.nama = nama;
        this.keterangan = keterangan;
        this.followers = followers;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowers() {
        return followers;
    }

    private String id;
    private String nama;
    private String keterangan;
    private int followers;
}
