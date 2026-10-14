package org.ldv.myhello.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class exo_01 {
    @GetMapping("/wonderfast")
    fun affichage(model: Model, @RequestParam querry: Map<String, String>): String {
        model["name"] = querry.get("name")
        model["surname"] = querry.get("surname")
        model["starter"] = querry.get("starter")
        model["maincourse"] = querry.get("maincourse")
        model["desert"] = querry.get("desert")
        model["drink"] = querry.get("drink")
        return "model"
    }
}