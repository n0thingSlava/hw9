public class Author {
   private String name;
   private String middleName;
    private String surName;
    private int yearPublication;

    public  Author(String name, String middleName, String surName,int yearPublication) {
        this.name = name;
        this.middleName = middleName;
        this.surName = surName;
        this.yearPublication= yearPublication;
}

    public String getname() {
        return this.name;
    }
    public String getmiddleName() {
        return this.middleName;
    }

    public String getsurName() {
        return this.surName;
            }
    public int getyearPublication() {
        return this.yearPublication = yearPublication;
    }
    public int setyearPublication(int yearPublication) {

        return this.yearPublication = yearPublication;
    }
    }
