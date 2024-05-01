public class Book extends Information {
    private String author;

    private String Book_name;

    private int Book_id;

    public Book(String author,String Book_name,String Publishing_agency,int Publication_year,int Book_id)
    {
        super( Publication_year, Publishing_agency);
        this.Book_name=Book_name;
        this.author=author;
        this.Book_id=Book_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }


    public int getBook_id() {
        return Book_id;
    }

    public void setBook_id(int book_id) {
        Book_id = book_id;
    }
    public String toString() {
        return "Book { " + "Id : " + Book_id + " author : " + author +
                " Publication Year : " + getPublication_year() + " Publishing Agency : " + getPublishing_agency() + "}";
    }

}

