/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fiturdelete;

/**
 *
 * @author d101
 */
public class User {
    private int USER_ID;
    private String NAMA;
    private String USERNAME;
    private String EMAIL;
    private String PASSWORD;
    private String FOTO_USER;

    // Constructor
    public User(int USER_ID, String NAMA, String USERNAME, String EMAIL, String PASSWORD, String FOTO_USER) {
        this.USER_ID = USER_ID;
        this.NAMA = NAMA;
        this.USERNAME = USERNAME;
        this.EMAIL = EMAIL;
        this.PASSWORD = PASSWORD;
        this.FOTO_USER = FOTO_USER;
    }

    // Getters
    public int getUSER_ID() {
        return USER_ID;
    }

    public String getNAMA() {
        return NAMA;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getFOTO_USER() {
        return FOTO_USER;
    }

    // Setters
    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public void setFOTO_USER(String FOTO_USER) {
        this.FOTO_USER = FOTO_USER;
    }
}

