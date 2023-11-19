public abstract class CompanyBuilder {
    Company company;
    void createCompany(){
        company = new Company();
    }

    abstract void buildName(String name);
    abstract void buildDirector(Identity director);
    abstract void buildManager(Identity manager);
    abstract void buildAccountant(Identity accountant);

    Company getCompany() {
        return company;
    }
    public String getInfo(){
        return "Company name: " + company.getName() +
                "\n Company Director: "+company.getDirector()+
                "\n Company Manager: "+company.getManager()+
                "\n Company Accountant: "+company.getAccountant();
    }
}