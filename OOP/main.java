public class Main {
    public static void main(String[] args) {
        Book book1=new Book("Nageeb Mahfouz","Egypt story","Alahram",1990,1);
        Book book2=new Book("Nageeb Mahfouz","Egypt story","Alahram",1990,2);
        Magazine magazine1=new Magazine(2003,"Nogom","Alahram",1);
        Library library=new Library("Book Art","6 doki st");
        library.AddBook(book1);
        library.AddBook(book2);
        library.Displaying_Books();
        library.UpdateBook(2,"Nahda masr");
        library.Displaying_Books();
        library.DeleteBook(1);
        library.Displaying_Books();
    }
}
