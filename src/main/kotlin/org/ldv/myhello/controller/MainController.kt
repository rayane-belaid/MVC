package org.ldv.myhello.controller

import jakarta.servlet.http.HttpServletRequest
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.ui.Model
import org.springframework.ui.set

@Controller
class MainController {
    @GetMapping("/")
    fun index(model: Model): String {
        model["monTitre"] = "Exemple d'une Vue"
        model["monParagraphe"] = "Ce paragraphe a été généré dynamiquement avec Thymleaf."
        return "index"
    }
}


//fun findLanguage(@PathVariable("language") language: String, request: HttpServletRequest): String{
    //    return "Vous connaissez le langage ${language}"
//}
//fun myResponse(): String{
//return "Hello World du Contrôleur !"
//}
//@GetMapping("/hello")
//@ResponseBody
//fun querryString(@RequestParam querry: Map<String, String>): String{
//    val nom = querry["nom"] ?: ""
//    val prenom = querry["prenom"] ?: ""
//    return "Hello ${prenom} ${nom} !"
//}



