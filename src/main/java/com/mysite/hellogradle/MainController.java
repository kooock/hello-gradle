package com.mysite.hellogradle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
    	return "안녕하세요 Azure App service에 오신것을 환영합니다.\n 이 앱은 gradle로 빌드되었고 Azure App service에 배포되었습니다.";
    }
}