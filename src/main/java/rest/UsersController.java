package rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @RequestMapping("/users")
    public Users users(@RequestParam(value="name", defaultValue="name") String name,
                       @RequestParam(value="introduce", defaultValue="introduce") String introduce,
                       @RequestParam(value="old", defaultValue="old") String old) {
        return new Users(name, introduce, Integer.parseInt(old));
    }
}