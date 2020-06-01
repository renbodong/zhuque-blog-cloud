package com.github.file.dto;

import com.github.file.entity.Attachment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/5/31 22:45
 */

@Data
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "AttachmentDto",description = "附件表")
public class AttachmentDto extends Attachment implements Serializable {

    private static final long serialVersionUID = 635416508135635442L;

    @ApiModelProperty("文件下载地址，根据url下载")
    private String downloadUrlByUrl;

    @ApiModelProperty("文件下载地址，根据文件id下载")
    private String downloadUrlById;

    @ApiModelProperty("文件下载地址，根据业务id下载")
    private String downloadUrlByBizId;
}
