public class Hello {
    static String cat(){
        return "cat";
    }
    public static void main(String args[]) {
        String firstArg=args[0];
        String output="";
        if(firstArg.equalsIgnoreCase("cat"))
            output=cat();
        System.out.println(output);
    }
}
