package com.songfz.personal.controller;

import com.songfz.personal.dto.MemberInfoDto;
import com.songfz.personal.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: fzsong3
 * @Date: 2020/6/19 16:58
 * @Description: 会员控制类
 */
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/member/list")
    public List<MemberInfoDto> getMemberInfoList() {
        return memberService.getMemberInfoList();
    }
}
