package br.com.egoncalves.helloworld;

public class HelloWorldJava {
    public static void main(String[] args) {
        if(args != null && args.length > 0){
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello World");
        }
    }
}
