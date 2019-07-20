package com.guillaumegallois.controller;

import com.guillaumegallois.dto.Race;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RacesController {

    @RequestMapping(method = RequestMethod.GET, value = "/races/{id}")
    @ResponseBody
    public Race findById(@PathVariable final Integer id) {
        return new Race(id);
    }

}
