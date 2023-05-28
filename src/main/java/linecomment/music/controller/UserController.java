package linecomment.music.controller;

import jakarta.validation.Valid;
import linecomment.music.entities.vo.ResultVO;
import linecomment.music.entities.vo.param.LoginParam;
import linecomment.music.entities.vo.param.RegisterParam;
import linecomment.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linecomment
 * @date 2023/5/28 08:13:46
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResultVO<Object> register(@Validated @RequestBody RegisterParam registerParam){
        return ResultVO.success(userService.register(registerParam));
    }

    @PostMapping("/login")
    public ResultVO<Object> login(@Validated @RequestBody LoginParam loginParam){
        return ResultVO.success(userService.login(loginParam));
    }
}
