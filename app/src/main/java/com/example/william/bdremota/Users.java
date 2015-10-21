package com.example.william.bdremota;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diego Jacobs on 20/10/2015.
 */
public class Users {
    private ArrayList carnets = new ArrayList();
    private ArrayList names = new ArrayList();
    private ArrayList emails = new ArrayList();
    private ArrayList passwords = new ArrayList();
    private ArrayList facultades = new ArrayList();
    private ArrayList carreras = new ArrayList();
    private ArrayList parqueos = new ArrayList();
    private ArrayList mapasC = new ArrayList();
    private ArrayList horarios = new ArrayList();

    public Users()
    {
        LoadAllProducts webS = new LoadAllProducts();
        webS.execute();
        setCarnets(webS.getCarnets());
        setEmails(webS.getEmails());
        setFacultades(webS.getFacultades());
        setCarreras(webS.getCarreras());
        setHorarios(webS.getHorarios());
        setNames(webS.getNames());
        setMapasC(webS.getMapasC());
        setParqueos(webS.getParqueos());
        setPasswords(webS.getPasswords());
    }

    public String getCarnet(int index) {
        return (String)carnets.get(index);
    }

    private void setCarnets(ArrayList carnets) {
        this.carnets = carnets;
    }

    public String getName(int index) {
        return names.get(index).toString();
    }

    private void setNames(ArrayList names) {
        this.names = names;
    }

    public String getEmail(int index) {
        return emails.get(index).toString();
    }

    private void setEmails(ArrayList emails) {
        this.emails = emails;
    }

    public String getPasswords(int index) {
        return passwords.get(index).toString();
    }

    private void setPasswords(ArrayList passwords) {
        this.passwords = passwords;
    }

    public String getFacultades(int index) {
        return facultades.get(index).toString();
    }

    private void setFacultades(ArrayList facultades) {
        this.facultades = facultades;
    }

    public String getCarreras(int index) {
        return carreras.get(index).toString();
    }

    private void setCarreras(ArrayList carreras) {
        this.carreras = carreras;
    }

    public String getParqueos(int index) {
        return parqueos.get(index).toString();
    }

    private void setParqueos(ArrayList parqueos) {
        this.parqueos = parqueos;
    }

    public ArrayList getMapasC() {
        return mapasC;
    }

    public void setMapasC(ArrayList mapasC) {
        this.mapasC = mapasC;
    }

    public ArrayList getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList horarios) {
        this.horarios = horarios;
    }

    public int EmailIndex(String Email)
    {
        if (this.emails.contains(Email))
            return emails.indexOf(Email);
        else
            return -1;
    }

    public boolean CorrectPassword(int index, String Password)
    {
        return passwords.get(index).equals(Password);
    }
}
