package Spring.DI;

public class Service {
    private Repository repository;

    // Constructor Injection
    public Service(Repository repository) {
        this.repository = repository;
    }

    public void performAction() {
        repository.save();
    }
}