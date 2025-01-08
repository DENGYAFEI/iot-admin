package com.iot.admin.controller;

import com.iot.admin.service.GatherJobService;
import com.iot.common.model.entity.task.GatherJob;
import com.iot.common.web.utils.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/gather-job")
@Tag(name = "定时任务")
public class GatherJobController {

    @Resource
    private GatherJobService gatherJobService;

    @Operation(summary = "保存定时任务",description = "保存定时任务")
    @PostMapping("/save")
    public R<Boolean> save(@RequestBody GatherJob gatherJob) {
        return R.success(gatherJobService.saveGatherJob(gatherJob));
    }
}
