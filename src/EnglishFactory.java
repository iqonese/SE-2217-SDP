public class EnglishFactory implements LanguageFactory{
    @Override
    public Identity setIdentity(String name) {
        return new English(name);
    }
}
