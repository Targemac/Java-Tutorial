public class Main {
    public static void main(String[] args){

        String name = "   Charles Targema ";

        int length = name.length();
        char letter = name.charAt(4);
        int index = name.indexOf("e");
        int lastIndex = name.lastIndexOf("e");

        name = name.toUpperCase();
        name = name.trim();
        name = name.replace("E", "g");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);

        if(name.isEmpty()){
        System.out.println("Your name is empty");
        }else{
        System.out.printf("Your name is %s\n", name);
        }

        if(name.contains(" ")){
        System.out.println("Your name contains a space");
        }else{
        System.out.println("Your name doesnt contain any spaces");
        }

        if(name.equals("password")){
            System.out.println("Your name cant be password");
        }else{
            System.out.println("Hello " + name);
        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name cant be password");
        }else{
            System.out.println("Hello " + name);
        }



    }
}
