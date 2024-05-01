public class Information {
    private int Publication_year;
    private String Publishing_agency;

    public Information(int publication_year, String publishing_agency) {
        Publication_year = publication_year;
        Publishing_agency = publishing_agency;
    }

    public int getPublication_year() {
        return Publication_year;
    }

    public void setPublication_year(int publication_year) {
        Publication_year = publication_year;
    }

    public String getPublishing_agency() {
        return Publishing_agency;
    }

    public void setPublishing_agency(String publishing_agency) {
        Publishing_agency = publishing_agency;
    }
}
