package com.game.main;

import com.game.src.Bread;
import com.game.src.Dungeon1;
import com.game.src.Dungeon2;
import com.game.src.Dungeon3;
import com.game.src.Enemy;
import com.game.src.GeneralStore;
import com.game.src.Lives;

public class Game {
    String[] enemyID = { "Skeleton", "Zombie", "Warrior", "Assassin" }; //Enemy Names
    
    
    public static void main(String[] args) {
        //Initiate Bread with breadFood
        Bread breadFood = new Bread();
        //Initiating breadFood
        breadFood.setItemID(2);
        breadFood.setName("Bread");
        breadFood.setMin(0);
        breadFood.setMax(5);
        breadFood.setHealingAmt(3);
        //==================================================
        String breadInfo = breadFood.toString();
        System.out.println("\n\nProject Awesomness provides bread for the Hero to eat. Bread in this project has four variables.\n It looks like this: " + breadInfo); 
        //==================================================
        //Initiate Dungeon1 with dungeonOne
        Dungeon1 dungeonOne = new Dungeon1();
        //Initiating dungeonOne
        dungeonOne.setName("Ice Caverns");
        dungeonOne.setLocationID(4);
        dungeonOne.setEnemyID(1);
        //==================================================
        String dungeon1Info = dungeonOne.toString();
        System.out.println("\n\nWelcome to the Ice Caverns. In this project, this dungeon has three variables.\n It looks like this: " + dungeon1Info); 
        //==================================================
        //Initiate Dungeon2 with dungeonTwo
        Dungeon2 dungeonTwo = new Dungeon2();
        //Initiating dungeonTwo
        dungeonTwo.setName("Fire Mountain");
        dungeonTwo.setLocationID(5);
        dungeonTwo.setEnemyID(2);
        //==================================================
        String dungeon2Info = dungeonTwo.toString();
        System.out.println("\n\nWelcome to Fire Mountain. In this project, this dungeon has three variables.\n It looks like this: " + dungeon2Info); 
        //==================================================
        //Initiate Dungeon3 with dungeonThree
        Dungeon3 dungeonThree = new Dungeon3();
        //Initiating dungeonThree
        dungeonThree.setName("Creepy Hollow");
        dungeonThree.setLocationID(6);
        dungeonThree.setEnemyID(3);
        //==================================================
        String dungeon3Info = dungeonThree.toString();
        System.out.println("\n\nWelcome to Creepy Hollow. In this project, this dungeon has three variables.\n It looks like this: " + dungeon3Info); 
        //==================================================
        //Initiate Enemy with enemy
        Enemy enemy = new Enemy();
        //Initiating enemy
        enemy.setName("Zombie, Assassin, Warrior, Skeleton");
        enemy.setNpcID(1);
        //==================================================
        String enemyInfo = enemy.toString();
        System.out.println("\n\nProject Awesomness provides enemies for the hero to attack. The enemies in this project have two variables.\n It looks like this: " + enemyInfo); 
        //==================================================
        //Initiate GeneralStore with merchantOne
        GeneralStore merchantOne = new GeneralStore();
        //Initiating merchantOne
        merchantOne.setName("General Store");
        merchantOne.setLocationID(6);
        merchantOne.setItemID(0);
        merchantOne.setItemAmt(4);
        //==================================================
        String merchantInfo = merchantOne.toString();
        System.out.println("\n\nProject Awesomness provides a General Store for the heo. The General Store in this project has four variables.\n It looks like this: " + merchantInfo); 
        //==================================================
        //Initiate Lives with lives
        Lives lives = new Lives();
        //Initiating lives
        lives.setName("Lives");
        lives.setItemID(1);
        lives.setMin(0);
        lives.setMax(3);        
        //==================================================
        String livesInfo = lives.toString();
        System.out.println("\n\nProject Awesomness provides lives, so that our hero won't unnecessarily die. Lives in this project has four variables.\n It looks like this: " + livesInfo); 
        //==================================================
        
        
        
        //String breadInfo = breadFood.toString();
        //System.out.println(breadInfo); 
        
        
        
        
    }

    

}
