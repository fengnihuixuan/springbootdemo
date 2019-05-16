package com.example.demo.xiuzhenshu.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.xiuzhenshu.pojo.Member;
import com.example.demo.xiuzhenshu.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:yangtao
 * @date:2019/5/15
 * @description:
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/member")
public class MemberController {

    @Autowired
    @Qualifier("Member")
    private MemberService  memberService;

    @PostMapping("/add")
    public JSONObject getMemberInfo(@RequestBody JSONObject jsonObject){

        String  name=jsonObject.getString("name");
        String  qq=jsonObject.getString("qq");
        String  type=jsonObject.getString("type");
        Long    expect_admission=jsonObject.getLong("expect_admission");
        String  graduate_school=jsonObject.getString("graduate_school");
        String  number_line=jsonObject.getString("number_line");
        String  daily_connection=jsonObject.getString("daily_connection");
        String  wish=jsonObject.getString("wish");
        String  coaching_senior=jsonObject.getString("coaching_senior");
        String  where_know=jsonObject.getString("where_know");
        Member member=new Member();
        member.setName(name);
        member.setQq(qq);
        member.setExpect_admission(expect_admission);
        member.setType(type);
        member.setCoaching_senior(coaching_senior);
        member.setNumber_line(number_line);
        member.setDaily_connection(daily_connection);
        member.setGraduate_school(graduate_school);
        member.setWish(wish);
        member.setWhere_know(where_know);
        Boolean bl = memberService.addMember(member);
        JSONObject js=new JSONObject();
        if (bl){
            js.put("status",200);
            js.put("msg","添加成功");
        }else{
            js.put("status",500);
            js.put("msg","添加失败");
        }
        return js;
    }
}
