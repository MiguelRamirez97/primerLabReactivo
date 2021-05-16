package com.example.demo.controller;

import com.example.demo.CsvUtilFile;
import com.example.demo.Player;
import com.example.demo.repo.PlayerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
public class PlayerListController {

    @Autowired
    private PlayerRespository playerRespository;

    @GetMapping("/list-playersMongo")
    public String listPlayersMongo(Model model){
        Flux<Player> flux = playerRespository.findAll(); // recuperamos todos los registros de forma reactiva
        model.addAttribute("players", flux);
        return "players"; // direccionamos al students.html
    }
    @GetMapping("/list-players")
    public String listPlayers(Model model){
        List<Player> flux = CsvUtilFile.getPlayers(); // recuperamos todos los registros de forma reactiva
        model.addAttribute("players", flux);
        return "players"; // direccionamos al students.html
    }
}
