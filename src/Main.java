public class Main {
    public static void main(String[] args) {
        Book lev = new Book();
        lev.authorName = "S. King";
        lev.publisherName= "Lev Tolstoi";
        lev.pageAmount = 31;
        System.out.println("lev.authorName = " + lev.authorName);
        System.out.println("lev.publisherName = " + lev.publisherName);
        System.out.println("lev.pageAmount = " + lev.pageAmount);
        //////////////////////////
        Author lov = new Author();
        lov.Name= "Vyacheslav";
        lov.middleName="Dmitrievich";
        lov.Surname= "Maznev";
        System.out.println(lov.Name+" "+lov.middleName+" "+lov.Surname);

    }
    }