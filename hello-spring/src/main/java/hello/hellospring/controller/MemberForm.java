package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class MemberForm {
    /*
        templates/members/createMemberForm.html의 Form 태그에서
        <input type="text" id="name" name="name" placeholder="이름을 입력하세요">
        input의 name="name"으로 MemberForm의 name하고 맵핑이 된다.
     */

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
