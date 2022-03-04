package com.codepresso.codepressoblog.controller.dto;


import com.codepresso.codepressoblog.vo.Post;
import lombok.Setter;

@Setter
public class PostRequestDto {
    Integer id;
    String title;
    String content;
    String username;

    public Post getPost() { // postRequestDto에 저장되어 있는 멤버 변수 값을 기반으로 post 객체를 생성한다.
        return new Post(this.id, this.title, this.content, this.username); // 처음에 에러 발생 (이유 : vo.Post에 4개 파라미터가 있는 생성자를 안 만들어줘서)
    }
}
