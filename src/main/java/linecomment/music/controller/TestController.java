package linecomment.music.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linecomment
 * @date 2023/5/27 13:53:43
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello")
    public String test(){
        return "hello music player";
    }
}
