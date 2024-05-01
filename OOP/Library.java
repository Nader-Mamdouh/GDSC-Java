public class Library {
    public static final int MAX_BOOKs = 100;
    private Book[] books;
    private int book_count=0;
    private String Library_Name,Address;

    public Library(  String library_Name, String address) {
        Library_Name = library_Name;
        Address = address;
        this.books = new Book[MAX_BOOKs];
    }


    public String getLibrary_Name() {
        return Library_Name;
    }

    public void setLibrary_Name(String library_Name) {
        Library_Name = library_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public void AddBook(Book book){
        books[book_count] = book;
        book_count++;
    }
    public boolean Check_Available(int id)
    {
        for(int i=0;i<book_count;i++) {
            if (books[i].getBook_id() == id) {
                return true;
            }
        }
        return false;
    }
    public void UpdateBook(int id, String Publishing_agency)
    {
        if (Check_Available(id))
        {
            for(int i=0;i<book_count;i++){
                if (books[i].getBook_id()==id)
                {
                    books[i].setPublishing_agency(Publishing_agency);
                    break;
                }
            }
            System.out.println("Book Updated Successfully");
        }
        else {
            System.out.println("Book Not Found");
        }
    }
    public void DeleteBook(int id)
    {
        if (Check_Available(id))
        {
            for(int i=0;i<book_count;i++) {
                if (books[i].getBook_id() == id) {
                    books[i] = null;
                    break;
                }
            }
            System.out.println("Book deleted Successfully");
        }
        else
        {
            System.out.println("Book Not Found");
        }
    }
    public void Displaying_Books()
    {
        for(int i=0;i<book_count;i++)
        {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }
}
