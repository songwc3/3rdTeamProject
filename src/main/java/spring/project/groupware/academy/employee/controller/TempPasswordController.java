package spring.project.groupware.academy.employee.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 임시 비밀번호 발급 View, post는 'EmailController'에 있음
@Controller
@RequiredArgsConstructor
public class TempPasswordController {

    @GetMapping("/api/tempPassword")
    public String getTempPassword() {
        return "employee/tempPassword"; // 닉네임과 휴대전화번호를 입력하는 폼 화면
    }

}
