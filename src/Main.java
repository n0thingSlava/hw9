public class Main {

    public static void main(String[] argt) {
        Book lev = new Book("S. King","Lev Tolstoi",1991);
        System.out.println("lev.authorName = " + lev.getauthorName());
        System.out.println("lev.pageAmount = " + lev.getpageAmount());
        System.out.println("lev.year = " + lev.getyear());
        lev.setyear(1994);
        System.out.println("lev.year = " + lev.getyear());

        //////////////////////////
        Author lov = new Author("Vyacheslav", "Dmitrievich", "Maznev");
        System.out.println("lov.Name = " + lov.getName());
        System.out.println("lov.middleName = " + lov.getmiddleName());
        System.out.println("lov.Surname = " + lov.getSurname());

    }
    }