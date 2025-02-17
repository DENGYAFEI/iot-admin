package com.iot.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iot.admin.mapper.DeviceMapper;
import com.iot.admin.service.DeviceService;
import com.iot.common.model.entity.admin.Device;
import org.springframework.stereotype.Service;

/**
* @author 20379
* @description 针对表【device(设备表)】的数据库操作Service实现
* @createDate 2025-01-06 20:05:40
*/
@Service
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, Device>
    implements DeviceService {

}




