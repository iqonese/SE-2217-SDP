public class RussianFactory implements LanguageFactory{
    @Override
    public Identity setIdentity(String name) {
        return new Russian(name);
    }
}
