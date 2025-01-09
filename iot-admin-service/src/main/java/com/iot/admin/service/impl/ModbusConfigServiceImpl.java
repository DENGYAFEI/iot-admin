package com.iot.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iot.admin.mapper.ModbusConfigMapper;
import com.iot.admin.service.ModbusConfigService;
import com.iot.common.model.entity.admin.ModbusConfig;
import org.springframework.stereotype.Service;

/**
* @author 20379
* @description 针对表【modbus_config(modbus点位配置表)】的数据库操作Service实现
* @createDate 2025-01-06 20:05:40
*/
@Service
public class ModbusConfigServiceImpl extends ServiceImpl<ModbusConfigMapper, ModbusConfig>
    implements ModbusConfigService {

}




