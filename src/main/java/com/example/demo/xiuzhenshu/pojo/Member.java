package com.example.demo.xiuzhenshu.pojo;

import lombok.Data;

/**
 * @author:yangtao
 * @date:2019/5/15
 * @description:
 */
@Data
public class Member {
    private Long  ID;
    private Long create_at;
    private Long update_at;
    private String name;
    private String qq;
    private String type;
    private Long expect_admission;
    private String graduate_school;
    private String number_line;
    private String daily_connection;
    private String wish;
    private String coaching_senior;
    private String where_know;
}
