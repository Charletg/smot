package data;

public class IInfo implements Ilink{

    int Id = 0;
    String Nom = null;
    String Description = null;

    public IInfo(int id, String nom, String description) {
        this.Id = id;
        this.Nom = nom;
        this.Description = description;
    }
    public String getDescription(){
        return this.Description;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getNom() {
        return this.Nom;
    }
}
