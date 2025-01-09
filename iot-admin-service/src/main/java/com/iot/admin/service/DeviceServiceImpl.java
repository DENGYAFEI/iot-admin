package com.iot.admin.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Device;
import generator.service.DeviceService;
import generator.mapper.DeviceMapper;
import org.springframework.stereotype.Service;

/**
* @author 20379
* @description 针对表【device(设备表)】的数据库操作Service实现
* @createDate 2025-01-06 20:05:40
*/
@Service
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, Device>
    implements DeviceService{

}




