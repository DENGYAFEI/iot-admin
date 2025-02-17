package com.iot.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iot.admin.mapper.DevicePointMapper;
import com.iot.admin.service.DevicePointService;
import com.iot.common.model.entity.admin.DevicePoint;
import org.springframework.stereotype.Service;

/**
* @author 20379
* @description 针对表【device_point(设备点位表)】的数据库操作Service实现
* @createDate 2025-01-06 20:05:40
*/
@Service
public class DevicePointServiceImpl extends ServiceImpl<DevicePointMapper, DevicePoint>
    implements DevicePointService {

}




