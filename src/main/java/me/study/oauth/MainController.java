package me.study.oauth;

import me.study.oauth.config.SessionConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class MainController {

    private HttpSession httpSession;

    public MainController(HttpSession httpSession) {
        this.httpSession = httpSession;
    }

    @GetMapping("/me")
    public Map<String, Object> me(){
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("profile", httpSession.getAttribute(SessionConstants.LOGIN_USER));
        return response;
    }
}
