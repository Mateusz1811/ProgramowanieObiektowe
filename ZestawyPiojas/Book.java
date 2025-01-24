import java.util.Objects;

public class Book {
    private String title;
    private String isbn;

    // Konstruktor
    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    // Gettery
    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    // Settery
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Metoda equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return Objects.equals(isbn, book.isbn);
    }

    // Metoda hashCode
    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    //inny hashcode


    //@Override
    //public int hashCode() {
    //    final int prime = 31;
    //    int result = 1;
     //   result = prime * result + (isbn == null ? 0 : isbn.hashCode());
    //    return result;
   // }

    //inny hashcode
    //@Override
    //public int hashCode() {
     //   return isbn != null ? isbn.hashCode() : 0;
    //}


    // Nadpisanie metody toString (opcjonalnie, ułatwia debugowanie)
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    // Główna metoda testowa (opcjonalnie)
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "9780134685991");
        Book book2 = new Book("Clean Code", "9780132350884");
        Book book3 = new Book("Effective Java", "9780134685991");

        System.out.println("book1.equals(book2): " + book1.equals(book2)); // false
        System.out.println("book1.equals(book3): " + book1.equals(book3)); // true
        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book3.hashCode(): " + book3.hashCode()); // powinno być takie samo jak book1
    }
}
