package com.personal.librarymanagementsystem.controller;


import com.personal.librarymanagementsystem.dto.AddAuthorRequest;
import com.personal.librarymanagementsystem.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody AddAuthorRequest addAuthorRequest) {

        String result = authorService.addAuthor(addAuthorRequest);
        return result;
    }



}