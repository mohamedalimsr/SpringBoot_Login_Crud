package com.example.dali.controler;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.dali.interfaceService.ICrudService;
import com.example.dali.modelo.Crud;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping
public class Controler {
    @Autowired
    private ICrudService service;
   @GetMapping("/")
    public String list(Model model){

        List<Crud> cruds =service.list();
        model.addAttribute("cruds", cruds);

        return "index";

    }


    @GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("crud", new Crud());
		return "form";
	}

	@PostMapping("/save")
	public String save(@Valid Crud p, Model model) {
		service.save(p);

		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model model){
		Optional<Crud>crud=service.list(id);
		model.addAttribute("crud", crud);
		return"form";
	}

	@GetMapping("/remove/{id}")
	public String remove(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/users")
	public String listUsers(Model model, @RequestParam(defaultValue="")  String name) {
		model.addAttribute("cruds", service.findByName(name));
		return "index";
	}





}
