package controller;


import model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.AdminRepository;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/admins")
    public List<Admin> getAdminList(){
        return adminRepository.findAll();
    }

    @GetMapping("/admin")
    public String getAdminLast(){
        return "hello from the other";
    }

}
