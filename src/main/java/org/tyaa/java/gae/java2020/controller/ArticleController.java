/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.java.gae.java2020.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tyaa.java.gae.java2020.model.Article;

/**
 *
 * @author yurii
 */
@RestController
@RequestMapping("/api")
public class ArticleController {
    
    @GetMapping("/articles")
    public List<Article> getDemoArticles(){
        Article a1 = new Article();
        a1.setId(1);
        a1.setTitle("t1");
        a1.setContent("content1");
        Article a2 = new Article();
        a2.setId(2);
        a2.setTitle("t2");
        a2.setContent("content2");
        return new ArrayList<>(Arrays.asList(a1, a2));
    }
}
