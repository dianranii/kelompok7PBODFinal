/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fiturdelete;

/**
 *
 * @author d101
 */
public class Article {
    private int ARTICLE_ID;
    private int USER_ID;
    private int CATEGORY_ID;
    private String JUDUL_ARTICLE;
    private String KONTEN_ARTICLE;
    private String FOTO_ARTICLE;

    // Default constructor
    public Article() {
    }

    // Parameterized constructor
    public Article(int ARTICLE_ID, int USER_ID, int CATEGORY_ID, String JUDUL_ARTICLE, String KONTEN_ARTICLE, String FOTO_ARTICLE) {
        this.ARTICLE_ID = ARTICLE_ID;
        this.USER_ID = USER_ID;
        this.CATEGORY_ID = CATEGORY_ID;
        this.JUDUL_ARTICLE = JUDUL_ARTICLE;
        this.KONTEN_ARTICLE = KONTEN_ARTICLE;
        this.FOTO_ARTICLE = FOTO_ARTICLE;
    }

    // Getters
    public int getARTICLE_ID() {
        return ARTICLE_ID;
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public int getCATEGORY_ID() {
        return CATEGORY_ID;
    }

    public String getJUDUL_ARTICLE() {
        return JUDUL_ARTICLE;
    }

    public String getKONTEN_ARTICLE() {
        return KONTEN_ARTICLE;
    }

    public String getFOTO_ARTICLE() {
        return FOTO_ARTICLE;
    }

    // Setters
    public void setARTICLE_ID(int ARTICLE_ID) {
        this.ARTICLE_ID = ARTICLE_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public void setCATEGORY_ID(int CATEGORY_ID) {
        this.CATEGORY_ID = CATEGORY_ID;
    }

    public void setJUDUL_ARTICLE(String JUDUL_ARTICLE) {
        this.JUDUL_ARTICLE = JUDUL_ARTICLE;
    }

    public void setKONTEN_ARTICLE(String KONTEN_ARTICLE) {
        this.KONTEN_ARTICLE = KONTEN_ARTICLE;
    }

    public void setFOTO_ARTICLE(String FOTO_ARTICLE) {
        this.FOTO_ARTICLE = FOTO_ARTICLE;
    }

    @Override
    public String toString() {
        return "Article{" +
                "ARTICLE_ID=" + ARTICLE_ID +
                ", USER_ID=" + USER_ID +
                ", CATEGORY_ID=" + CATEGORY_ID +
                ", JUDUL_ARTICLE='" + JUDUL_ARTICLE + '\'' +
                ", KONTEN_ARTICLE='" + KONTEN_ARTICLE + '\'' +
                ", FOTO_ARTICLE='" + FOTO_ARTICLE + '\'' +
                '}';
    }
}

