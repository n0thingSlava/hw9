import java.util.Objects;

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

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surName='" + surName + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return yearPublication == author.yearPublication && Objects.equals(name, author.name) && Objects.equals(middleName, author.middleName) && Objects.equals(surName, author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, middleName, surName, yearPublication);
    }
}
