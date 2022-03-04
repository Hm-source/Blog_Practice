package com.codepresso.codepressoblog.controller;


import com.codepresso.codepressoblog.service.PostService;
import com.codepresso.codepressoblog.vo.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    private PostService postService; //블로그 글 데이터를 조회해서 사용해야하기 때문에 PostService를 가져올 필요가 있다.

    public IndexController(PostService postService){
        this.postService = postService;
    }

    @RequestMapping(value = "/")
    public String index(Model model) {
        List<Post> postList = postService.getAllPost(); //getAllPost()로 결과를 받는다.
        model.addAttribute("posts", postList); //받은 결과를 model에 posts라는 속성으로 추가한다.
        return "index"; // 추가한 모델을 mustache index 파일에 보내게 된다.
    }
}
