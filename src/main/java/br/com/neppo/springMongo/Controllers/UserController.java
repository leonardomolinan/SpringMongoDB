package br.com.neppo.springMongo.Controllers;

import br.com.neppo.springMongo.Models.UserModel;
import br.com.neppo.springMongo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/all")
    public @ResponseBody List<UserModel> getAll(){
        return userRepository.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public @ResponseBody UserModel save(@RequestBody UserModel userModel){
        userRepository.save(userModel);
        return userModel;
    }
}
