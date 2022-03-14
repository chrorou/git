public class Hello {

    static String cat(){ return "cat";}

    static String bird(){ return "bird";}
    static String dog(){ return "dog";}
    static String hello(){return "hello";}

    public static void main(String args[]) {
        String firstArg=args[0];
        String output="";
        if(firstArg.equalsIgnoreCase("cat"))
            output=cat();
        else if(firstArg.equalsIgnoreCase("bird"))
            output=bird();
        else if(firstArg.equalsIgnoreCase("dog"))
            output=dog();
        else if(firstArg.equalsIgnoreCase("hello"))
            output=hello();

        System.out.println(output);
    }
}
