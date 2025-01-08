package com.iot.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.ModbusConfig;
import generator.service.ModbusConfigService;
import generator.mapper.ModbusConfigMapper;
import org.springframework.stereotype.Service;

/**
* @author 20379
* @description 针对表【modbus_config(modbus点位配置表)】的数据库操作Service实现
* @createDate 2025-01-06 20:05:40
*/
@Service
public class ModbusConfigServiceImpl extends ServiceImpl<ModbusConfigMapper, ModbusConfig>
    implements ModbusConfigService{

}




