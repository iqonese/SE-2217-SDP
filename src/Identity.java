public class Identity {
    String name;
    int age;


    Identity(String name){
        this.name = name;
    }
    Identity(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void helpTo(Identity identity) {
        System.out.println("Helping " + identity.name);
    }


}
