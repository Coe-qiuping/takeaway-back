package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel("菜品分页查询")
public class DishPageQueryDTO implements Serializable {

    @NotNull(message = "页码不能为空")
    @ApiModelProperty("页码")
    private int page;

    @NotNull(message = "每页记录数不能为空")
    @ApiModelProperty("每页记录数")
    private int pageSize;

    @ApiModelProperty("菜品名称")
    private String name;

    @ApiModelProperty("分类id")//分类id
    private Integer categoryId;

    @ApiModelProperty("状态 0表示禁用 1表示启用")//状态 0表示禁用 1表示启用
    private Integer status;

}
