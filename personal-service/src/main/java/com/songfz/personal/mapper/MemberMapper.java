package com.songfz.personal.mapper;

import com.songfz.personal.dto.MemberInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: fzsong3
 * @Date: 2020/6/28 14:54
 * @Description:
 */
@Mapper
public interface MemberMapper {

    /**
     * 获取会员列表
     * @return
     */
    List<MemberInfoDto> getMemberInfoList();
}
