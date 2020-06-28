package com.songfz.personal.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author: fzsong3
 * @Date: 2020/6/19 16:06
 * @Description: 会员信息
 */
@Data
@ApiModel("会员信息对象")
public class MemberInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "会员id")
    private Long id;

    @ApiModelProperty(value = "会员姓名")
    private String name;

    @ApiModelProperty(value = "会员性别")
    private char sex;

    @ApiModelProperty(value = "会员手机号")
    private Long phoneNo;

    @ApiModelProperty(value = "会员地址")
    private String address;

    @ApiModelProperty(value = "会员第一次下单时间")
    private LocalDateTime firstOrderTime;

    @ApiModelProperty(value = "会员最近一次下单时间")
    private LocalDateTime recentOrderTime;

}
