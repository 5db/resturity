package com.resturity.web.controller;

import com.resturity.core.domain.Question;
import com.resturity.core.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jsingh on 26/06/2014.
 */
@Controller
@RequestMapping(value = "/api")
public class RestController {

    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    public @ResponseBody List<Question> securedRestResource() {
        List questions = new ArrayList();
        questions.add(new Question("What's the capital of Canada?", new Date()));
        questions.add(new Question("What's the capital of USA?", new Date()));
        questions.add(new Question("What's the capital of India?", new Date()));
        questions.add(new Question("What's the capital of England?", new Date()));
        questions.add(new Question("What's the capital of Italy?", new Date()));
        questions.add(new Question("What's the capital of Portugal?", new Date()));
        questions.add(new Question("What's the capital of Argentina?", new Date()));

        return questions;
    }
}
