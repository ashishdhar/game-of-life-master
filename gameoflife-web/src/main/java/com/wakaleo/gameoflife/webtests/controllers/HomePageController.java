package com.wakaleo.gameoflife.webtests.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * This class rocks.
<<<<<<< HEAD
 * @author johnsmart
 *
 */
@Controller
public class HomePageController {
	// FIXME: do something nicer for the home page
=======
 *
 * @author johnsmart
 */
@Controller
public class HomePageController {
    // FIXME: do something nicer for the home page
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("home");
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
}
