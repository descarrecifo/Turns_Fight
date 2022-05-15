package com.company.frontcontroller;

import com.company.model.Player;

import static com.company.controller.FightController.fighting;
import static com.company.view.CharacterView.showCharacter;
import static com.company.view.IOView.*;
import static com.company.view.InventoryView.inventoryUseItem;
import static com.company.view.ShopView.shopping;

public class FrontController {
    public static void mainLoopController(String value) {
        switch (value) {
            case "1" -> createCharacter();
        }
    }
    public  static void gameLoopController(String value, Player player){
        switch (value) {
            case "1" -> fighting(player);
            case "2" -> inventoryUseItem(player);
            case "3" -> showCharacter(player);
            case "4" -> shopping(player);
        }
    }
}
