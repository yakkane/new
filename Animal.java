public class Animal {
    static String printdefault(){
        return "Hello";
    }
    static String birdsong(){
        return "tweet";
    }
    public static void main(String[] args) {
     String output = printdefault();
     String first = args[0];
     if(first.equalsIgnoreCase("bird")) output = birdsong();
        System.out.println(output);


    }
}
