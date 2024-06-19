package com.cabra.cabra;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CabraController {

    @GetMapping("/cabra")
    public String cabra(HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        return " <img style='width: 100px' src='https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Hausziege_04.jpg/800px-Hausziege_04.jpg' /> ¡Hola! Tu ID de sesión es "
                + "<p style='color:red;' >" + sessionId + "</p>";
    }

    @GetMapping("/")
    public String base(HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        return " <img style='width: 100px' src='https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Hausziege_04.jpg/800px-Hausziege_04.jpg' /> ¡Hola! Tu ID de sesión es "
                + "<p style='color:red;' >" + sessionId + "</p>";
    }
}