package com.excavator.boot.springboot3graalvm.controller;


import com.excavator.boot.springboot3graalvm.entity.ScenesCategory;
import com.excavator.boot.springboot3graalvm.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/graalvm/v1")
public class HomeController {
    public static final Logger log = LoggerFactory.getLogger(HomeController.class);

    private final CategoryService categoryService;

    public HomeController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/primaryCategorys")
    public Flux<List<ScenesCategory>> queryPrimaryCategorys(){
        return categoryService.queryPrimaryCategorys().map(Flux::just).orElse(Flux.empty());
    }
}
