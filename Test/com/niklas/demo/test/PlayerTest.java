package com.niklas.demo.test;

import com.niklas.demo.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player = new Player(
            5,
            5,
            5,
            50,
            0,
            5
    );

    @Test
    public void reducePlayerHealth() {
        player.takeDamage(5);

        assertEquals(45, player.getHealth());
    }

    @Test
    public void reducePlayerLevel() {
        player.setLevel( player.getLevel() - 1 );

        assertEquals(1, player.getLevel());

    }

}