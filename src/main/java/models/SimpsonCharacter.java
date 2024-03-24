package models;

public class SimpsonCharacter {
    private String quote, character, imgPath, direction;

    public SimpsonCharacter(String quote, String character, String imgPath, String direction) {
        this.quote = quote;
        this.character = character;
        this.imgPath = imgPath;
        this.direction = direction;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

}
