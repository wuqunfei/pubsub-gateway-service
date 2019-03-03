package socket.pubsub.gateway.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping(value = "/home")
    public String greeting(@RequestParam(name="uuid", required=false) String name) {
        return "home";
    }
}
