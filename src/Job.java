public abstract class Job extends Identity{
    protected String name;
    protected int age;
    Job(String name){
        super(name);
    }
    Job(String name, int age){
        super(name, age);
    }
}
