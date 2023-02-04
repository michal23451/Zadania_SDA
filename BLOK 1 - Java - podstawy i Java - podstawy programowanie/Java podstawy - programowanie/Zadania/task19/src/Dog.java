public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public void wagTail() {
        System.out.println(this.name + " merda ogonem.");
    }

    //    public Dog(String s)
//    {
//        this.name = s;
//    }
//
//    public Dog(){
//
//    }
//
//
//    public Dog setName(String name) {
//        this.name = name;
//        return this;
//    }
}
