package model;

public class Twits {

    private User user;
    private int id_twits;
    private String title_twit, desc_twit;

    public Twits(User user, int id_twits, String title_twit, String desc_twit) {
        this.user = user;
        this.id_twits = id_twits;
        this.title_twit = title_twit;
        this.desc_twit = desc_twit;
    }
}
