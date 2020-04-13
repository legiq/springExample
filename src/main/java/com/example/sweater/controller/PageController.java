package com.example.sweater.controller;

import com.example.sweater.domain.Page;
import com.example.sweater.domain.Role;
import com.example.sweater.domain.User;
import com.example.sweater.repos.PageRepo;
import com.example.sweater.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/page")
public class PageController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PageRepo pageRepo;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping
    public String pageList(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "pageList";
    }

    @GetMapping("{user}")
    public String getPage(@PathVariable User user, Model model) {

        Page page = user.getPage();

        if (page == null) {
            page = new Page("No info", "No info", "No info",
                    "No info", "No info", "No info");
            pageRepo.save(page);
            user.setPage(page);
            userRepo.save(user);
        }

        model.addAttribute("username", user.getUsername());
        model.addAttribute("id", user.getId());
        model.addAttribute("page", page);
        model.addAttribute("user", user);

        return "page";
    }

    @PostMapping("/photo")
    public String editPhoto(@RequestParam("userId") User user,
                           @RequestParam("file") MultipartFile file
    ) throws IOException {

        if (file != null && !file.getOriginalFilename().isEmpty()) {
            File uploadDir = new File(uploadPath);

            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }

            String uuidFile = UUID.randomUUID().toString();
            String resultFilename = uuidFile + "." + file.getOriginalFilename();

            file.transferTo(new File(uploadPath + "/" + resultFilename));

            user.getPage().setFilename(resultFilename);
        }

        pageRepo.save(user.getPage());
        userRepo.save(user);

        return "redirect:/page/" + user.getId();
    }

    @PostMapping("/age")
    public String editAge(@RequestParam("userId") User user,
                           @RequestParam("age") String age
    ) {

        user.getPage().setAge(age);

        pageRepo.save(user.getPage());
        userRepo.save(user);

        return "redirect:/page/" + user.getId();
    }

    @PostMapping("/about")
    public String editAbout(@RequestParam("userId") User user,
                           @RequestParam("about") String about
    ) {

        user.getPage().setAbout(about);

        pageRepo.save(user.getPage());
        userRepo.save(user);

        return "redirect:/page/" + user.getId();
    }

    @PostMapping("/education")
    public String editEducation(@RequestParam("userId") User user,
                                @RequestParam("education") String education
    ) {

        user.getPage().setEducation(education);

        pageRepo.save(user.getPage());
        userRepo.save(user);

        return "redirect:/page/" + user.getId();
    }

    @PostMapping("/department")
    public String editDepartment(@RequestParam("userId") User user,
                                @RequestParam("department") String department
    ) {

        user.getPage().setDepartment(department);

        pageRepo.save(user.getPage());
        userRepo.save(user);

        return "redirect:/page/" + user.getId();
    }

    @PostMapping("/position")
    public String editPosition(@RequestParam("userId") User user,
                                @RequestParam("position") String position
    ) {

        user.getPage().setPosition(position);

        pageRepo.save(user.getPage());
        userRepo.save(user);

        return "redirect:/page/" + user.getId();
    }
}
