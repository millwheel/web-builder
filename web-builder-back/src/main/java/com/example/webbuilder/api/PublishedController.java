package com.example.webbuilder.api;

import com.example.webbuilder.dto.published.PublishedPageDto;
import com.example.webbuilder.entity.Page;
import com.example.webbuilder.service.PageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/published")
@RequiredArgsConstructor
public class PublishedController {

    private final PageService pageService;

    @GetMapping("/pages")
    public PublishedPageDto getPage(){
        Page page = pageService.getPage();
        return new PublishedPageDto(page);
    }

}
