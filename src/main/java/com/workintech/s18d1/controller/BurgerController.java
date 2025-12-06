package com.workintech.s18d1.controller;

import com.workintech.s18d1.dao.BurgerDao;
import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.util.BurgerValidation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/burger") // Testlerin beklediği path
@CrossOrigin("*")
public class BurgerController {

    private final BurgerDao burgerDao;

    public BurgerController(BurgerDao burgerDao) {
        this.burgerDao = burgerDao;
    }

    @PostMapping
    public Burger save(@RequestBody Burger burger) {
        log.info("Save request received for burger: {}", burger);
        BurgerValidation.validateBurger(burger);
        return burgerDao.save(burger);
    }

    @GetMapping
    public List<Burger> findAll() {
        log.info("Request to list all burgers");
        return burgerDao.findAll();
    }

    @GetMapping("/{id}")
    public Burger findById(@PathVariable Long id) {
        log.info("Request to find burger by id: {}", id);
        return burgerDao.findById(id);
    }

    @PutMapping
    public Burger update(@RequestBody Burger burger) { // Testlerde path variable yok, body var
        log.info("Update request received: {}", burger);
        BurgerValidation.validateBurger(burger);
        return burgerDao.update(burger);
    }

    @DeleteMapping("/{id}")
    public Burger remove(@PathVariable Long id) {
        log.info("Delete request received for id: {}", id);
        return burgerDao.remove(id);
    }

    // Testlerdeki yapı: /burger/price/{price}
    @GetMapping("/price/{price}")
    public List<Burger> findByPrice(@PathVariable Integer price) {
        log.info("Request to find burgers by price: {}", price);
        return burgerDao.findByPrice(price);
    }

    // Testlerdeki yapı: /burger/breadType/{breadType}
    @GetMapping("/breadType/{breadType}")
    public List<Burger> findByBreadType(@PathVariable BreadType breadType) {
        log.info("Request to find burgers by bread type: {}", breadType);
        return burgerDao.findByBreadType(breadType);
    }

    // Testlerdeki yapı: /burger/content/{content}
    @GetMapping("/content/{content}")
    public List<Burger> findByContent(@PathVariable String content) {
        log.info("Request to find burgers by content: {}", content);
        return burgerDao.findByContent(content);
    }
}
