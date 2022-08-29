import java.sql.SQLOutput;

public class Main {

    public static void main(String[] argt) {
        Book book = new Book("S. King","Lev Tolstoi",1991);
        Book book2 = new Book("M.Sae","Kolya Egorov",2000);
        System.out.println("lev.authorName = " + book.getauthorName());
        System.out.println("lev.pageAmount = " + book.getpageAmount());
        System.out.println("lev.year = " + book.getyear());
        book.setyear(1994);
        System.out.println(book);
        System.out.println(book.hashCode() ==book2.hashCode());
        System.out.println(book.equals(book2));
        System.out.println();

        //////////////////////////
        Author author = new Author("Vyacheslav", "Dmitrievich", "Maznev",31);
        System.out.println("lov.name = " + author.getname());
        System.out.println("lov.middleName = " + author.getmiddleName());
        System.out.println("lov.surName = " + author.getsurName());
        System.out.println("lov.yearPublication() = " + author.getyearPublication());
        author.setyearPublication(27);
        System.out.println("lov.yearMy() = " + "Хочу опять как в "+ author.getyearPublication());
        System.out.println(author);
    }
    }