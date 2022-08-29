import java.util.Objects;

public class Book {
    private String authorName ;
    private String pageAmount;
     private int year;
     private Author author;

    public Book(String authorName, String pageAmount, int year) {
        this.authorName = authorName;
        this.pageAmount = pageAmount;
        this.year = year;
    }

    public int setyear(int year) {

        return this.year = year;
    }
    public String getauthorName(){

        return this.authorName;
    }
    public String getpageAmount(){
        return this.pageAmount;
        }
    public int getyear() {
        return this.year = year;
    }
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(authorName, book.authorName) && Objects.equals(pageAmount, book.pageAmount) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, pageAmount, year, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", pageAmount='" + pageAmount + '\'' +
                ", year=" + year +
                '}';
    }
}
