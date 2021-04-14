package org.obrii.mit.dp2021.luninleonid.leonidlunin;

import javax.validation.Valid;
import org.obrii.mit.dp2021.luninleonid.leonidlunin.Repo.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Leonid
 */
@Controller("/Lab6")
public class DataController {
    @Autowired
    DataRepo dataRepo;
    
    @GetMapping("/signup")
    public String openSignUp(Data data){
        return "add-user";
    }
    
    @PostMapping("/adduser")
    public String addUser(@Valid Data data, BindingResult result, Model model){
        if(result.hasErrors()){
            return "add-user";
        }
    dataRepo.save(data);
    return "redirect:/index";
    }
    @GetMapping("/index")
    public String showUserList(Model model){
        model.addAttribute("users", dataRepo.findAll());
        return "index";
    }
}
