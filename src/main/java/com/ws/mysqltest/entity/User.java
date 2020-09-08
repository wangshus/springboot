package com.ws.mysqltest.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户信息")
@Data
public class User {

    @ApiModelProperty("用户id")
    private Integer id;
    @ApiModelProperty("用户name")
    private String name;
    @ApiModelProperty("用户sex")
    private Integer sex;
    @ApiModelProperty("用户描述")
    private String content;
}
