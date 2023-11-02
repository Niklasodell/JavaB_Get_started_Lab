package com.niklas.demo;

public class PrintLineVariations {

    Player player = new Player();

    public void test() {
        System.out.println("Hello \n World \n" + player.getName());
        System.out.println("""
                Hello
                World
                """ + player.getName() + """ 
                """);
        System.out.printf("Hello %s", player.getName());    // Format
    }

}