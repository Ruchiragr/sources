package com.test.boot.service;

import com.test.boot.beans.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebServiceAPI {
    private Logger logger = LoggerFactory.getLogger(WebServiceAPI.class);
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public
    @ResponseBody
    Student addStudentInfo(@RequestParam(value = "name", required = false, defaultValue = "Ruchira") String name) {
        logger.info("Request received with parameter: {}", name);
        return new Student(counter.incrementAndGet(), name);
    }
}
