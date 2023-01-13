package com.saloni.app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Greeting greeting = new Greeting();
        String result= greeting.SayHi();
        String result1=greeting.sayWelcome();
        String result2= greeting.sayHello();
        String result3 = greeting.sayBye();
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}