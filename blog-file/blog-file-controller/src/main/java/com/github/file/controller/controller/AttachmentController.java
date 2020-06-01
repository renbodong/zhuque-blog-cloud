package com.github.file.controller.controller;

import com.github.file.dto.AttachmentDto;
import com.github.zhuque.core.base.R;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 附件前端控制器
 *
 * @author zhuque
 * @version 1.0
 * @date 2020/5/31 20:00
 */
@RestController
@RequestMapping("/attachment")
@Slf4j
@Api(value = "附件", tags = "附件")
public class AttachmentController {

    /**
     * 业务类型判断符
     */
    private final static String TYPE_BIZ_ID = "bizId";

    public R<AttachmentDto> upload(@RequestParam(value = "file") MultipartFile file,
                                   @RequestParam(value = "isSingle", required = false, defaultValue = "false") Boolean isSingle,
                                   @RequestParam(value = "id", required = false) Long id,
                                   @RequestParam(value = "bizId", required = false) String bizId,
                                   @RequestParam(value = "bizType", required = false) String bizType) {
        return null;
    }

}
