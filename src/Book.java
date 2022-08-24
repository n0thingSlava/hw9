public class Book {
    String authorName= "S. King";
    String pageAmount= "Lev Tolstoi";
    int year= 1991;

    public static Book coolBook(String authorName, String pageAmount, int year) {
        Book person = new Book();
        person.authorName = authorName;
        person.pageAmount = pageAmount;
        person.year = year;
        return person;
    }
}
