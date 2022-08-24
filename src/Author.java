public class Author {
   private String Name="Vyacheslav";
   private String middleName= "Dmitrievich";
    private String Surname= "Maznev";
    private int yearMy= 31;

    public  Author(String Name, String middleName, String Surname,int yearMy) {
        this.Name = Name;
        this.middleName = middleName;
        this.Surname = Surname;
        this.yearMy= yearMy;
}

    public String getName() {
        return this.Name;
    }
    public String getmiddleName() {
        return this.middleName;
    }

    public String getSurname() {
        return this.Surname;
            }
    public int getyearMy() {
        return this.yearMy = yearMy;
    }
    public int setyearMy(int yearMy) {
        return this.yearMy = yearMy;
    }
    }
