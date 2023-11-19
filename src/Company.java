import java.util.ArrayList;

public class Company {
    private String name;
    private String director;
    private String manager;
    private String accountant;

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(Identity director) {
        this.director = director.name;
    }

    public void setManager(Identity manager) {
        this.manager = manager.name;
    }

    public void setAccountant(Identity accountant) {
        this.accountant = accountant.name;
    }

    public String getName() {
        return name;
    }

    public String getAccountant() {
        return accountant;
    }

    public String getDirector() {
        return director;
    }

    public String getManager() {
        return manager;
    }
}
