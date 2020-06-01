package com.github.file.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.file.enumeration.DataType;
import com.github.zhuque.core.base.entity.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/5/31 20:48
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("f_attachment")
@ApiModel(value = "Attachment",description = "附件")
public class Attachment extends Entity<Long> {
    private static final long serialVersionUID = 6878759145486264973L;

    @ApiModelProperty(value = "业务id")
    @Length(max = 64, message = "业务ID长度不能超过64")
    @TableField(value = "biz_id")
    private String bizId;

    @ApiModelProperty(value = "业务类型")
    @Length(max = 255, message = "业务类型长度不能超过255")
    @TableField("biz_type")
    private String bizType;

    /**
     * 数据类型
     * #DataType{DIR:目录;IMAGE:图片;VIDEO:视频;AUDIO:音频;DOC:文档;OTHER:其他}
     */
    @ApiModelProperty(value = "数据类型")
    @TableField("data_type")
    private DataType dataType;

    @ApiModelProperty(value = "原始文件名")
    @Length(max = 255, message = "原始文件名长度不能超过255")
    @TableField("submitted_file_name")
    private String submittedFileName;

    @ApiModelProperty(value = "FastDFS返回的组")
    @Length(max = 255, message = "FastDFS返回的组长度不能超过255")
    @TableField("group_")
    private String group;

    @ApiModelProperty(value = "FastDFS的远程文件名")
    @Length(max = 255, message = "FastDFS的远程文件名不能超过255")
    @TableField("path")
    private String path;

    @ApiModelProperty(value = "文件相对路径")
    @Length(max = 255, message = "文件相对路径长度不能超过255")
    @TableField("relative_path")
    private String relativePath;

    @ApiModelProperty(value = "文件访问连接")
    @Length(max = 255, message = "文件访问链接长度不能超过255")
    @TableField("url")
    private String url;

    @ApiModelProperty("文件MD5值")
    @Length(max = 255, message = "文件MD5值长度不能超过255")
    @TableField("file_md5")
    private String fileMd5;

    @ApiModelProperty("文件上传类型")
    @Length(max = 255, message = "文件上传类型长度不能超过255")
    @TableField("context_type")
    private String contextType;

    @ApiModelProperty("唯一文件名")
    @Length(max = 255, message = "唯一文件名长度不能超过255")
    @TableField("file_name")
    private String filename;

    /**
     * 后缀 没有.
     */
    @ApiModelProperty("后缀")
    @Length(max = 64, message = "后缀长度不能超过255")
    @TableField("ext")
    private String ext;

    @ApiModelProperty("大小")
    @TableField("size")
    private Long size;

    /**
     * 组织ID
     */
    @ApiModelProperty(value = "组织ID")
    @TableField("org_id")
    private Long orgId;

    /**
     * 图标
     */
    @ApiModelProperty(value = "图标")
    @Length(max = 64, message = "图标长度不能超过64")
    @TableField("icon")
    private String icon;

    /**
     * 创建年月
     * 格式：yyyy-MM 用于统计
     */
    @ApiModelProperty(value = "创建年月")
    @Length(max = 10, message = "创建年月长度不能超过10")
    @TableField("create_month")
    private String createMonth;

    /**
     * 创建时处于当年的第几周
     * yyyy-ww 用于统计
     */
    @ApiModelProperty(value = "创建时处于当年的第几周")
    @Length(max = 10, message = "创建时处于当年的第几周长度不能超过10")
    @TableField("create_week")
    private String createWeek;

    /**
     * 创建年月日
     * 格式： yyyy-MM-dd 用于统计
     */
    @ApiModelProperty(value = "创建年月日")
    @Length(max = 12, message = "创建年月日长度不能超过12")
    @TableField("create_day")
    private String createDay;

    @Builder
    public Attachment(Long id, LocalDateTime createTime, Long createUser, LocalDateTime updateTime, Long updateUser,
                      String bizId, String bizType, DataType dataType, String submittedFileName,
                      String group, String path, String relativePath, String url,
                      String fileMd5, String contextType, String filename, String ext, Long size, Long orgId, String icon,
                      String createMonth, String createWeek, String createDay) {
        this.id = id;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.bizId = bizId;
        this.bizType = bizType;
        this.dataType = dataType;
        this.submittedFileName = submittedFileName;
        this.group = group;
        this.path = path;
        this.relativePath = relativePath;
        this.url = url;
        this.fileMd5 = fileMd5;
        this.contextType = contextType;
        this.filename = filename;
        this.ext = ext;
        this.size = size;
        this.orgId = orgId;
        this.icon = icon;
        this.createMonth = createMonth;
        this.createWeek = createWeek;
        this.createDay = createDay;
    }
}
