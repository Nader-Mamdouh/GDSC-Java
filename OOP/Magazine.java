public class Magazine extends Information {


    private String Magazine_name;

    private int Magazine_id;

    public Magazine(int publication_year, String magazine_name, String publishing_agency, int magazine_id) {
        super(publication_year,publishing_agency);
        Magazine_name = magazine_name;
        Magazine_id = magazine_id;
    }


    public String getMagazine_name() {
        return Magazine_name;
    }

    public void setMagazine_name(String magazine_name) {
        Magazine_name = magazine_name;
    }


    public int getMagazine_id() {
        return Magazine_id;
    }

    public void setMagazine_id(int magazine_id) {
        Magazine_id = magazine_id;
    }
}
