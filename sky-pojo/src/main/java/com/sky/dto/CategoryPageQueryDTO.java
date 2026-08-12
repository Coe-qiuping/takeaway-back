package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel("分类分页查询")
public class CategoryPageQueryDTO implements Serializable {

    @ApiModelProperty("分类名称")
    private String name;

    @ApiModelProperty("分类类型 1菜品分类 2套餐分类")
    private Integer type;

    @NotNull(message = "页码不能为空")
    @ApiModelProperty("页码")
    private Integer page;

    @NotNull(message = "每页记录数不能为空")
    @ApiModelProperty("每页记录数")
    private Integer pageSize;

}
