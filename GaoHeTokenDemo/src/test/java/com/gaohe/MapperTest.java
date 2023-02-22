package com.gaohe;

import com.gaohe.domain.User;
import com.gaohe.mapper.MenuMapper;
import com.gaohe.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
public class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestBCryptPasswordEncoder(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        //$2a$10$YhqLhA0f/R9Hmp1UCsKjMOLfM708BZ8ws.Y17HUA2rq7kZa/gD8aO

        System.out.println(passwordEncoder.
                matches("gh",
                        "$2a$10$YhqLhA0f/R9Hmp1UCsKjMOLfM708BZ8ws.Y17HUA2rq7kZa/gD8aO"));

//        String encode = passwordEncoder.encode("gh");
//        String encode1 = passwordEncoder.encode("gh");
//        System.out.println(encode);
//        System.out.println(encode1);
    }

    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void SelectPermsByUserId(){
        List<String> list = menuMapper.selectPermsByUserId(1L);
        System.out.println(list);
    }

    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
