package com.github.file.enumeration;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/5/31 21:03
 */
@Getter
@AllArgsConstructor
@ApiModel(value = "DataType", description = "数据类型-枚举")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DataType {
    /**
     * DIR="目录"
     */
    DIR("目录"),

    /**
     * IMAGE = "图片"
     */
    IMAGE("图片"),

    /**
     * VIDEO = "视频"
     */
    VIDEO("视频"),

    /**
     * AUDIO = "音频"
     */
    AUDIO("音频"),

    /**
     * DOC = "文档"
     */
    DOC("文档"),

    /**
     * other = "其他"
     */
    OTHER("其他"),

    ;
    @ApiModelProperty(value = "描述")
    private String desc;
}
