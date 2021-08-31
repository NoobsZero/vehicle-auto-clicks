package com.vehicle.auto.click.mapper.primary;

import com.vehicle.auto.click.model.VehicleInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: vehicle-auto-clicks
 * @Package: com.vehicle.auto.click.mapper.primary
 * @ClassName: VehicleInfoMapper
 * @Description: chaYanVehicle_info表操作类
 * @Author: Chen
 * @contact: Afakerchen@em-data.com.cn
 * @software: IntelliJ IDEA
 * @CreateDate: 2021/8/30 17:37
 */

@Mapper
public interface ChaYanVehicleInfoMapper {
    /**
     * @param map {}
     * @return List<VehicleInfo>
     * @description //TODO 查询chaYanVehicle_info表
     * @Date 9:32 2021/8/31
     */
    List<VehicleInfo> queryChaYanVehicleInfo(Map<String, Object> map);

    /**
     * @param map {center_status: ''，uuid: ''}
     * @return int 1 or 0
     * @description //TODO 修改chaYanVehicle_info表
     * @Date 9:33 2021/8/31
     */
    int updateChaYanVehicleInfo(Map<String, Object> map);

    /**
     * @param map {}
     * @return int count(*)
     * @description //TODO 查询chaYanVehicle_info表
     * @Date 9:34 2021/8/31
     */
    int queryChaYanVehicleInfoCount(Map<String, Object> map);

}
