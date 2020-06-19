package com.songfz.personal.service;

import com.songfz.personal.dto.MemberInfoDto;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: fzsong3
 * @Date: 2020/6/19 16:47
 * @Description: 会员服务
 */
@Service
public class MemberService {
    private static final List list = new ArrayList();

    // 假数据
    static {
        for (int i = 0; i < 10; i++) {
            MemberInfoDto memberInfoDto = new MemberInfoDto();
            memberInfoDto.setId(i);
            memberInfoDto.setName("张三" + i);
            memberInfoDto.setSex(i / 2 == 0 ? '0' : '1');
            memberInfoDto.setPhoneNo(15855327060L);
            memberInfoDto.setAddress("安徽省宿州市砀山县" + i);
            memberInfoDto.setFirstOrderTime(new Date());
            memberInfoDto.setRecentOrderTime(new Date());
            list.add(memberInfoDto);
        }
    }

    public List<MemberInfoDto> getMemberInfoList() {
        return list;
    }

}
