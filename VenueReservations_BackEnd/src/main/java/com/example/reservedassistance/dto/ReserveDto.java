package com.example.reservedassistance.dto;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("用户查看到预约数据信息")
public class ReserveDto {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("预约的操作时间")
    private Date operateTime;

    @ApiModelProperty("预约的活动")
    private ActivityDto activity;

    @ApiModelProperty("预约活动的开始时间")
    private Date reserveBegTime;

    @ApiModelProperty("预约活动的结束时间")
    private Date reserveEndTime;

    @ApiModelProperty("预约的状态，这里会显示已取消预约")
    private String reserveStatus;

    @ApiModelProperty("是否评论")
    private String isComment;

}
