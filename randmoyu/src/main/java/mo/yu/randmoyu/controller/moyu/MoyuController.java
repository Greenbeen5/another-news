package mo.yu.randmoyu.controller.moyu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @Author GreenBean
 * @Date Class created on 2020/11/8
 * @Description
 * @Version 1.0
 */
@Controller
public class MoyuController {

    @GetMapping({"/","/index","/index.html"})
    public String index(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        return "/moyu/index";
    }
}
