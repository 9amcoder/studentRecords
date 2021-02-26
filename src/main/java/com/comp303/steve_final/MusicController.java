package com.comp303.steve_final;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;
    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<MusicRecord> listMusics = musicService.listAll();
        model.addAttribute("listMusics", listMusics);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewProductPage(Model model) {
        MusicRecord music = new MusicRecord();
        model.addAttribute("music", music);

        return "new_music";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_music");
        MusicRecord musicRecord = musicService.get(id);
        mav.addObject("music", musicRecord);

        return mav;
    }
}
