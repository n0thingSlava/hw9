public class Main {
    public static void main(String[] argt) {
        Book lev = new Book();
        lev.authorName = "S. King";
        lev.publisherName= "Lev Tolstoi";
        lev.pageAmount = 31;

        //////////////////////////
        Author lov = new Author();
        lov.Name= "Vyacheslav";
        lov.middleName="Dmitrievich";
        lov.Surname= "Maznev";
        System.out.println(lov.Name+" "+lov.middleName+" "+lov.Surname);

    }
    }