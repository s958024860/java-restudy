package com.songfz.personal.controller;

import com.songfz.personal.common.Response;
import com.songfz.personal.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: fzsong3
 * @Date: 2020/6/19 16:58
 * @Description: 会员控制类
 */
@RestController
public class MemberController {

    @Resource
    private MemberService memberService;

    @GetMapping("/member/list")
    public Response getMemberInfoList() {
        return new Response(memberService.getMemberInfoList());
    }
}
