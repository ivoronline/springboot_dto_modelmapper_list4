package com.ivoronline.springboot_dto_modelmapper_list4.controllers;

import com.ivoronline.springboot_dto_modelmapper_list4.dto.AuthorBookDTO;
import com.ivoronline.springboot_dto_modelmapper_list4.entities.Author;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    //================================================================
    // ADD AUTHOR BOOK
    //================================================================
    @RequestMapping("AddAuthorBook")
    public String addAuthorBook(@RequestBody List<AuthorBookDTO> authorBookDTOs) {

        //INSTANTIATE MODEL MAPPER
        ModelMapper modelMapper = new ModelMapper();

        //CONVERT DTOs TO ENTITIES
        Author[] authors = modelMapper.map(authorBookDTOs, Author[].class);

        //RETURN SOMETHING
        return authors[1].name + " is author";

    }

}

