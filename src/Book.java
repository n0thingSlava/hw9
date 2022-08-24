public class Book {
    private String authorName = "S. King";
    private String pageAmount = "Lev Tolstoi";
    private int year = 1991;

    public Book(String authorName, String pageAmount, int year) {
        this.authorName = authorName;
        this.pageAmount = pageAmount;
        this.year = year;
    }
    public String getauthorName(){
        return this.authorName;
    }
    public String getpageAmount(){
        return this.pageAmount;
        }
    public int getyear() {
        return this.year;
    }
}
