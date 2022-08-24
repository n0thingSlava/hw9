public class Author {
    String Name="Vyacheslav";
    String middleName= "Dmitrievich";
    String Surname= "Maznev";

    public static Author bloc(String Name, String middleName, String Surname) {
        Author bloc = new Author();
        bloc.Name = Name;
        bloc.middleName = middleName;
        bloc.Surname = Surname;
        return bloc;
}
