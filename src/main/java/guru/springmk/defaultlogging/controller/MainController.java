package guru.springmk.defaultlogging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class MainController {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MainController.class);

    @ResponseBody
    @RequestMapping(path = "/")
    public String home() {

        LOGGER.trace("This is TRACE");
        LOGGER.debug("This is DEBUG");
        LOGGER.info("This is INFO");
        LOGGER.warn("This is WARN");
        LOGGER.error("This is ERROR");

        return "Hi, show loggings in the console or file!";
    }
}
