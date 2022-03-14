public class Animal {

    static String printdefault(){
        return "Hello";
    }
    static String catsound(){
        return "meow";
    }

    public static void main(String[] args) {

        String output = printdefault();
        String first = args[0];
   if(first.equalsIgnoreCase("cat")) output=catsound();

        System.out.println(output);


    }
}
