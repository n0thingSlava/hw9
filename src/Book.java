public class Book {
    private String authorName = "S. King";
    private String pageAmount = "Lev Tolstoi";
     int year = 1991;

    public Book(String authorName, String pageAmount, int year) {
        this.authorName = authorName;
        this.pageAmount = pageAmount;
        year = year;
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
}
