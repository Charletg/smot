package com.miagegrenoble.cleavie;

public interface IPatient extends ILink{
    List<ILink> getListInfos();
    List<ILink> getListMedecins();
}
