public class EnglishCompany extends CompanyBuilder{
    @Override
    void buildName(String name) {
        company.setName(name);
    }

    @Override
    void buildDirector(Identity director) {
        company.setDirector(director);
    }

    @Override
    void buildManager(Identity manager) {
        company.setManager(manager);
    }

    @Override
    void buildAccountant(Identity accountant) {
        company.setAccountant(accountant);
    }
}
