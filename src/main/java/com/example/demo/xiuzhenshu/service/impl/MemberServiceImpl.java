package com.example.demo.xiuzhenshu.service.impl;

import com.example.demo.xiuzhenshu.dao.MemberDao;
import com.example.demo.xiuzhenshu.pojo.Member;
import com.example.demo.xiuzhenshu.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:yangtao
 * @date:2019/5/16
 * @description:
 */
@Service("Member")
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao  memberDao;

    @Override
    public Boolean addMember(Member member) {

       return memberDao.addMember(member);
    }
}
