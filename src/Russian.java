public class Russian extends Identity implements CommonActions {
    Russian(String name) {
        super(name);
    }

    @Override
    public void question() {
        System.out.println("Asking a question on Russian...");
    }

    @Override
    public void conversation() {
        System.out.println("Speaking on Russian...");
    }

    @Override
    public void farewell() {
        System.out.println("Saying goodbye on Russian...");
    }

}

