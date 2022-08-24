public class Main {

    }
    public static void main(String[] argt) {
        Book lev = Book.coolBook("S. King","Lev Tolstoi",1991);
        System.out.println("lev.authorName = " + lev.authorName);
        System.out.println("lev.pageAmount = " + lev.pageAmount);
        System.out.println("lev.year = " + lev.year);

        //////////////////////////
        Author lov = Author.bloc("Vyacheslav", "Dmitrievich", "Maznev");
        System.out.println("lov.Name = " + lov.Name);
        System.out.println("lov.middleName = " + lov.middleName);
        System.out.println("lov.Surname = " + lov.Surname);

    }
    }