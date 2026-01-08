package com.example.genai.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genai")
public class GenAiController {
    @RequestMapping
    public String helloGenAi() {
        return "GenAI service is running 🤖";
    }
}
