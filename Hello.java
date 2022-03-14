public class Hello {
    static String cat(){
        return "cat";
    }
    static String bird(){ return "bird";}
    public static void main(String args[]) {
        String firstArg=args[0];
        String output="";
        if(firstArg.equalsIgnoreCase("cat"))
            output=cat();
        else if(firstArg.equalsIgnoreCase("bird"))
            output=bird()
        System.out.println(output);
    }
}
