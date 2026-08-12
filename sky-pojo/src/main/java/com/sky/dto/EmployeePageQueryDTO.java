package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel("员工分页查询")
public class EmployeePageQueryDTO implements Serializable {

    @ApiModelProperty("员工姓名")
    private String name;

    @NotNull(message = "页码不能为空")
    @ApiModelProperty("页码")
    private Integer page;

    @NotNull(message = "每页记录数不能为空")
    @ApiModelProperty("每页记录数")
    private Integer pageSize;

}
