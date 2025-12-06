package com.workintech.s18d1.util;

import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {
    public static void validateBurger(Burger burger) {
        validateName(burger.getName());
        validatePrice(burger.getPrice());
        validateContents(burger.getContents());
        validateIsVegan(burger.getIsVegan());
        validateBreadType(burger.getBreadType());
    }

    public static void validateName(String name) {
        if (name != null && name.trim().isEmpty()) {
            throw new BurgerException("Burger name cannot be empty", HttpStatus.BAD_REQUEST);
        }
    }

    public static void validatePrice(Double price) {
        if (price != null && price < 0) {
            throw new BurgerException("Burger price cannot be negative", HttpStatus.BAD_REQUEST);
        }
    }

    public static void validateContents(String contents) {
        if (contents != null && contents.trim().isEmpty()) {
            throw new BurgerException("Burger contents cannot be empty", HttpStatus.BAD_REQUEST);
        }
    }

    public static void validateIsVegan(Boolean isVegan) {
        // isVegan null ise hata firlatmayacak
    }

    public static void validateBreadType(BreadType breadType) {
        // breadType null ise hata firlatmayacak
    }
}
