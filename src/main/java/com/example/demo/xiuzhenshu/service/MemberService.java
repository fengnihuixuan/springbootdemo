package com.example.demo.xiuzhenshu.service;

import com.example.demo.xiuzhenshu.pojo.Member;
import org.springframework.stereotype.Repository;


public interface MemberService {
    /*
    * 插入信息
    *
    * */

    Boolean addMember(Member member);
}
