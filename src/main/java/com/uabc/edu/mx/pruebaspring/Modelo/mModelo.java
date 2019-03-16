package com.uabc.edu.mx.pruebaspring.Modelo;

import lombok.Data;
import lombok.Generated;

import java.util.ArrayList;
import java.util.List;

@Data
public class mModelo {

    private  String nomD;
    private  String nomP;
    private  String fecha;
    private  String hora;
    private  String Asun;
    private  String corre;
    private String telel;
    List<String> ejemploLista = new ArrayList<String>();

    public mModelo() {
        nomP="";
        nomD = "";
        fecha = "";
        hora="";
        Asun="";
        corre="";
        telel="";


    }

    public mModelo(String nomD,String nomP, String fecha, String hora,  String Asun) {
        this.nomD = nomD;
        this.nomP=nomP;
        this.fecha = fecha;
        this.hora=hora;
        this.Asun=Asun;
        this.corre=corre;
        this.telel=telel;
    }

}
