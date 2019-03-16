package com.uabc.edu.mx.pruebaspring.Controller;
import com.uabc.edu.mx.pruebaspring.Modelo.mModelo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class citas {
    private List<String> valores = new ArrayList<>();


    @RequestMapping(path = "/vista")
    public String lista(Model model) {

        model.addAttribute("lista", valores);
        return "vista";
    }


    @GetMapping(value = "/datos")

    public String CitasHome(Model model) {

        mModelo l = new mModelo();
        model.addAttribute("Datos", l);

        return "vista";

    }
    @PostMapping("/add")
    public String add(String nuevo){
        valores.add(nuevo);
        return "redirect:/vista";
    }


}
