package org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MessageController {

    private final String URL = "http://localhost:3000/LeonidLunin/Lab7service/data";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getMessage")
    public String getFormData(Model model) {
        Embedded messageEntity = restTemplate.getForObject(URL, Embedded.class);
        List<Data> list = messageEntity.getListOfStudents().getStudentList();
        model.addAttribute("students", list);
        return "result";
    }
    
    
    @PostMapping("/add")
    public String createData(@RequestParam(name = "name") String name,
            @RequestParam(name = "age") String age,
            @RequestParam(name = "gender") String gender,
            @RequestParam(name = "email") String email,
            Model model) {

        restTemplate.postForObject(URL, new Data(name,Integer.parseInt(age),gender,email),Data.class);
        return getFormData(model);
    }

    @PostMapping("/update")
    public String updateData(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "age") String age,
            @RequestParam(name = "gender") String gender,
            @RequestParam(name = "email") String email,
            @RequestParam(name = "url") String url,
            Model model) {

        restTemplate.put(url, new Data(name,Integer.parseInt(age),gender,email));
        return getFormData(model);
    }
    
     @PostMapping("/delete")
    public String deleteData(@RequestParam(name = "url") String url,
            Model model) {

        restTemplate.delete(url);
        return getFormData(model);
    }

}
