package com.scrumcreator.client.api.controller;

import com.scrumcreator.client.api.data.ScrumPractice;
import com.scrumcreator.client.api.data.ScrumPracticeJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ScrumFrameworkController {

    @Autowired
    private MongoOperations mongoOperations;

    @GetMapping(value = "/api/scrumFramework")
    public ScrumPracticeJSON scrumFramework() {
        return new ScrumPracticeJSON(mongoOperations.findAll(ScrumPractice.class));
    }

}