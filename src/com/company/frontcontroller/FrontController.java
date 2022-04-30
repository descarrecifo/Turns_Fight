package com.company.frontcontroller;

import com.company.model.Character;
import com.company.model.Inventory;
import com.company.model.Item;

import java.util.HashMap;

import static com.company.controller.FightController.fightResult;
import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.service.FightService.enemyLevel;

public class FrontController {
    public static void mainLoopController(String value) {
        switch (value) {
            case "1" -> {
                Character player = new Character("Player", 1);
                Item testItem = new Item("Test Item", "testing", "A testing item", 1);
                HashMap<Item, Integer> items = new HashMap<>();
                Inventory playerInventory = new Inventory(items, 5);
                while (true){
                    int level = enemyLevel(player);
                    player.setLevel(player.getLevel()+1);

                    fightResult(level, player);
                    if(level>player.getLevel()){
                        break;
                    }else{
                        addItemToInventory(items,playerInventory);
                    }
                }
            }
            default -> System.out.println("Invalid option\n");
        }
    }
}
