package com.example.webbuilder.api;

import com.example.webbuilder.dto.console.ConsolePageDto;
import com.example.webbuilder.entity.Page;
import com.example.webbuilder.service.PageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/console")
@RequiredArgsConstructor
public class ConsoleController {

    private final PageService pageService;

    @GetMapping("/pages/{pageId}")
    public ConsolePageDto getPage(@PathVariable String pageId){
        Page page = pageService.getPage();
        return new ConsolePageDto(page);
    }

}
