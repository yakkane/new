public class Animal {

    static String printdefault(){
        return "Hello";
    }

    static String birdsong(){
        return "tweet";
    }
    static String catsound(){
        return "meow";
    }
    public static void main(String[] args) {
        String output = printdefault();
        String first = args[0];
        if(first.equalsIgnoreCase("bird")) output = birdsong();
        if(first.equalsIgnoreCase("cat")) output=catsound();

        System.out.println(output);

}}
