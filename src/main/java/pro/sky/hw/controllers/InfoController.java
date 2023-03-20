package pro.sky.hw.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class InfoController {

    @GetMapping
    @RequestMapping
    public String helloWorld() {
        return "запущено";
    }

    @GetMapping("/path/to/info")
    public String info(@RequestParam String info) {
        return info + "Информация о проекте";
    }


}
