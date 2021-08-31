package com.vehicle.auto.click.mapper.second;

import com.vehicle.auto.click.model.VehicleInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: vehicle-auto-clicks
 * @Package: com.vehicle.auto.click.mapper.second
 * @ClassName: VehilceCheckMapper
 * @Description: vehicle_checks表操作类
 * @Author: Chen
 * @contact: Afakerchen@em-data.com.cn
 * @software: IntelliJ IDEA
 * @CreateDate: 2021/8/31 9:26
 */

@Mapper
public interface VehicleChecksMapper {
    /**
     * @param map {}
     * @return List<VehicleInfo>
     * @description //TODO 查询vehicle_checks表
     * @Date 9:36 2021/8/31
     */
    List<VehicleInfo> queryVehicleChecks(Map<String, Object> map);

    /**
     * @param map {center_status: ''，uuid: ''}
     * @return int 1 or 0
     * @description //TODO 修改vehicle_checks表
     * @Date 9:37 2021/8/31
     */
    int updateVehicleChecks(Map<String, Object> map);

    /**
     * @param map {}
     * @return int count(*)
     * @description //TODO 查询vehicle_checks表
     * @Date 9:38 2021/8/31
     */
    int queryVehicleChecksCount(Map<String, Object> map);
}
