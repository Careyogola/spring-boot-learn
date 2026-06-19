class User {

    private String name;
    private int age;
    private int ID;


    public User(String name, int age, int ID){

        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getID(){
        return this.ID;
    }

}



public class Encapsulation {
    
    public static void main(String[] args) {

        User user = new User("Carey Ogola", 24, 39082393);
        //Person Carey = new User();
        System.out.println("This user is:" + user.getName());
        
    }
}