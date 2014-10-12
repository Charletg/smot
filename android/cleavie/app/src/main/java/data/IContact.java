package data;

import java.lang.String;

public class IContact implements Ilink{
    int Id = 0;
    String Nom = null;
    String Specialite = null;
    String Numero = null;

    public IContact(int id, String nom, String specialite, String numero) {
        this.Id = id;
        this.Nom = nom;
        this.Specialite = specialite;
        this.Numero = numero;
    }
    public String getSpecialite(){
        return this.Specialite;
    }

    public String getNumero(){
        return this.Numero;
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