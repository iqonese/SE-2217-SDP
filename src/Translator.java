public class Translator implements CommonActions{
    void translate(){

    }
    private int checkLanguage(String language1, String language2) {
        if (language1.equalsIgnoreCase("english") && language2.equalsIgnoreCase("russian")) {
            return 1;
        } else if (language1.equalsIgnoreCase("russian") && language2.equalsIgnoreCase("english")) {
            return 2;
        } else {
            throw new IllegalArgumentException("Unknown language");
        }
    }

    @Override
    public void question() {

    }

    @Override
    public void conversation() {

    }

    @Override
    public void farewell() {

    }
}
