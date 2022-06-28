package uk.ac.tees.aad.tabfrag;

public class Model {
    public String FirtText,SecondText;
    public int image;

    public Model(String firtText, String secondText, int image) {
        FirtText = firtText;
        SecondText = secondText;
        this.image = image;
    }

    public String getFirtText() {
        return FirtText;
    }

    public void setFirtText(String firtText) {
        FirtText = firtText;
    }

    public String getSecondText() {
        return SecondText;
    }

    public void setSecondText(String secondText) {
        SecondText = secondText;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
