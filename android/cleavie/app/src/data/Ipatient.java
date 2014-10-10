package com.miagegrenoble.cleavie;

import java.lang.String;

public interface IPatient extends ILink{
    String getNom();
    String getPrenom();
    List<IInfo> getListInfos();
    List<IContact> getListContact();
}
