package data;

import java.lang.String;
import java.util.List;

public class IPatient implements Ilink{
    int Id = 0;
    String Nom = null;
    String Prenom = null;
    List<IInfo> ListInfos;
    List<IContact> ListContacts;

    public IPatient(int id, String nom, String prenom, List<IInfo> listInfos, List<IContact> listContacts) {
        this.Id = id;
        this.Nom = nom;
        this.Prenom = prenom;
        this.ListInfos = listInfos;
        this.ListContacts = listContacts;
    }


    public List<IInfo> getListInfos(){
        return this.ListInfos;
    }

    public List<IContact> getListContacts(){
        return this.ListContacts;
    }

    public String getPrenom(){
        return this.Prenom;
    }

    @Override
    public String toString(){
        return "{ \"nom\" : \"" + Nom + "\", \"prenom\" : \"" + Prenom + "\", \"informations\" : \"" + ListInfos + "\", \"Contacts\" : \"" + ListContacts + "\" }"
    }

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public String getNom() {
        return null;
    }
}
