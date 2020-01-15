public class ServerNameGenerator {

    public static String[] adjectives = {"Grubby", "Green", "Miniature", "Salty", "Shaggy","Shaky", "healthy","Bitter", "Silky", "Bumpy"};
    public static String[] noun = {"Money", "Number", "Night", "Day", "Program","Data-Base", "Truck","Clown", "Dog", "Parrot"};

    public static int getRandom(int max){
        return(int) (Math.random()*max);
    }


    public static String randomName(){
//    System.out.println("Here is your Server name : ");
//    System.out.println(adjectives[getRandom(10)] + " " + noun[getRandom(10)]);
        String output = "Here is your Server name \n" + adjectives[getRandom(10)] + " "+ noun[getRandom(10)];
        return output;
    }

    public static void main(String[] args) {
        System.out.println(randomName());
    }


}


//helloworld