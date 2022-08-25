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
}
