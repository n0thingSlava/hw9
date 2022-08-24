public class Author {
    String Name="Vyacheslav";
    String middleName= "Dmitrievich";
    String Surname= "Maznev";

    public  Author(String Name, String middleName, String Surname) {
        this.Name = Name;
        this.middleName = middleName;
        this.Surname = Surname;
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
    }
