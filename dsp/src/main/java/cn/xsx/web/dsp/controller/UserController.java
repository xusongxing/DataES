package cn.xsx.web.dsp.controller;

import cn.xsx.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 经过用户登录安全组件返回的路径
 */

@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    // 返回登录成功页面
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @PreAuthorize("isAuthenticated()")// isAuthenticated 如果用户不是匿名用户就返回true
    public String showHomePage() {
        try {
            userService.loadUserByUsername("admin");
            logger.info("load user ");
            logger.info("测试");
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
        }
        return "/index";
    }

    /**
     * 登录错误页面
     * @return
     */
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String showError() {
        return "/error";
    }
}
