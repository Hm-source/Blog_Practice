package com.codepresso.codepressoblog.service;

import com.codepresso.codepressoblog.mapper.PostMapper;
import com.codepresso.codepressoblog.vo.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    Logger logger = LoggerFactory.getLogger(getClass());

    PostMapper postMapper;

    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public List<Post> getAllPost() {
        return postMapper.findAll();
    }

    public List<Post> getPostByPage(Integer page, Integer size) {
        return postMapper.findByPage(size, (page-1) * size); //size = limit, (page-1) * size = offset
    }

    public Post getPostById(Integer id) {
        return postMapper.findOne(id);
    }

    public boolean savePost(Post post) {
        Integer result = postMapper.save(post);
        return result == 1; // 1이면 정상적으로 저장, 원래는 exception handling 코드도 추가되어야 한다.
    }

    public boolean updatePost(Post post) {
        Integer result = postMapper.update(post);
        return result == 1;
    }

}
