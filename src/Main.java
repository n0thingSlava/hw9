public class Main {

    public static void main(String[] argt) {
        Book lev = new Book("S. King","Lev Tolstoi",1991);
        System.out.println("lev.authorName = " + lev.getauthorName());
        System.out.println("lev.pageAmount = " + lev.getpageAmount());
        System.out.println("lev.year = " + lev.getyear());
        lev.setyear(1994);
        System.out.println("lev.year = " + lev.getyear());

        //////////////////////////
        Author lov = new Author("Vyacheslav", "Dmitrievich", "Maznev",31);
        System.out.println("lov.name = " + lov.getname());
        System.out.println("lov.middleName = " + lov.getmiddleName());
        System.out.println("lov.surName = " + lov.getsurName());
        System.out.println("lov.yearPublication() = " + lov.getyearPublication());
        lov.setyearPublication(25);
        System.out.println("lov.yearMy() = " + "Хочу опять как в "+ lov.getyearPublication());

    }
    }