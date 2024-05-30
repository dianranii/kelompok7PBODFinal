/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fiturdelete;

/**
 *
 * @author d101
 */
public class Bookmark {
    private int BOOKMARK_ID;
    private int ARTICLE_ID;
    private int USER_ID;
    private int CATEGORY_ID;
    private String JUDUL_BOOKMARK;
    private String URL_BOOKMARK;
    private String KONTEN_BOOKMARK;
    private String FOTO_BOOKMARK;

    // Default constructor
    public Bookmark() {
    }

    // Parameterized constructor
    public Bookmark(int BOOKMARK_ID, int ARTICLE_ID, int USER_ID, int CATEGORY_ID, String JUDUL_BOOKMARK, String URL_BOOKMARK, String KONTEN_BOOKMARK, String FOTO_BOOKMARK) {
        this.BOOKMARK_ID = BOOKMARK_ID;
        this.ARTICLE_ID = ARTICLE_ID;
        this.USER_ID = USER_ID;
        this.CATEGORY_ID = CATEGORY_ID;
        this.JUDUL_BOOKMARK = JUDUL_BOOKMARK;
        this.URL_BOOKMARK = URL_BOOKMARK;
        this.KONTEN_BOOKMARK = KONTEN_BOOKMARK;
        this.FOTO_BOOKMARK = FOTO_BOOKMARK;
    }

    // Getters
    public int getBOOKMARK_ID() {
        return BOOKMARK_ID;
    }

    public int getARTICLE_ID() {
        return ARTICLE_ID;
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public int getCATEGORY_ID() {
        return CATEGORY_ID;
    }

    public String getJUDUL_BOOKMARK() {
        return JUDUL_BOOKMARK;
    }

    public String getURL_BOOKMARK() {
        return URL_BOOKMARK;
    }

    public String getKONTEN_BOOKMARK() {
        return KONTEN_BOOKMARK;
    }

    public String getFOTO_BOOKMARK() {
        return FOTO_BOOKMARK;
    }

    // Setters
    public void setBOOKMARK_ID(int BOOKMARK_ID) {
        this.BOOKMARK_ID = BOOKMARK_ID;
    }

    public void setARTICLE_ID(int ARTICLE_ID) {
        this.ARTICLE_ID = ARTICLE_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public void setCATEGORY_ID(int CATEGORY_ID) {
        this.CATEGORY_ID = CATEGORY_ID;
    }

    public void setJUDUL_BOOKMARK(String JUDUL_BOOKMARK) {
        this.JUDUL_BOOKMARK = JUDUL_BOOKMARK;
    }

    public void setURL_BOOKMARK(String URL_BOOKMARK) {
        this.URL_BOOKMARK = URL_BOOKMARK;
    }

    public void setKONTEN_BOOKMARK(String KONTEN_BOOKMARK) {
        this.KONTEN_BOOKMARK = KONTEN_BOOKMARK;
    }

    public void setFOTO_BOOKMARK(String FOTO_BOOKMARK) {
        this.FOTO_BOOKMARK = FOTO_BOOKMARK;
    }

    @Override
    public String toString() {
        return "Bookmark{" +
                "BOOKMARK_ID=" + BOOKMARK_ID +
                ", ARTICLE_ID=" + ARTICLE_ID +
                ", USER_ID=" + USER_ID +
                ", CATEGORY_ID=" + CATEGORY_ID +
                ", JUDUL_BOOKMARK='" + JUDUL_BOOKMARK + '\'' +
                ", URL_BOOKMARK='" + URL_BOOKMARK + '\'' +
                ", KONTEN_BOOKMARK='" + KONTEN_BOOKMARK + '\'' +
                ", FOTO_BOOKMARK='" + FOTO_BOOKMARK + '\'' +
                '}';
    }
}

