package com.iot.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iot.admin.mapper.OrgMapper;
import com.iot.admin.service.OrgService;
import com.iot.common.model.entity.admin.Org;
import org.springframework.stereotype.Service;

/**
* @author 20379
* @description 针对表【org(组织)】的数据库操作Service实现
* @createDate 2025-01-06 20:05:40
*/
@Service
public class OrgServiceImpl extends ServiceImpl<OrgMapper, Org>
    implements OrgService {

}




