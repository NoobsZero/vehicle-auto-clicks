package com.vehicle.auto.click.service;

import com.vehicle.auto.click.model.VehicleInfo;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: vehicle-auto-clicks
 * @Package: com.vehicle.auto.click.service
 * @ClassName: VehicleInfoService
 * @Description: 车检信息服务接口类
 * @Author: Chen
 * @contact: Afakerchen@em-data.com.cn
 * @software: IntelliJ IDEA
 * @CreateDate: 2021/8/30 14:44
 */

public interface VehicleInfoService {
    /**
     * @param id vehicle_check_id
     * @return String shuoMing
     * @description //TODO 根据车辆ID查询CheckInfo说明（second）
     * @Date 15:26 2021/8/30
     */
    String selectCheckInfosShuoming(String id);

    /**
     * @param id cheLiangUid
     * @return String shuoMing
     * @description //TODO 根据车辆ID查询Photo_info说明（primary）
     * @Date 17:40 2021/8/30
     */
    String selectPhotoInfoShuoming(String id);

    /**
     * @param map {}
     * @return List<VehicleInfo>
     * @description //TODO 查询chaYanVehicle_info
     * @Date 18:07 2021/8/30
     */
    List<VehicleInfo> queryChaYanVehicleInfo(Map<String, Object> map);

    /**
     * @param map {center_status: ''，uuid: ''}
     * @return Integer 1 or 0
     * @description //TODO 修改chaYanVehicle_info
     * @Date 9:07 2021/8/31
     */
    Integer updateChaYanVehicleInfo(Map<String, Object> map);

    /**
     * @param map {}
     * @return Integer count(*)
     * @description //TODO 查询chaYanVehicle_info
     * @Date 9:11 2021/8/31
     */
    Integer queryChaYanVehicleInfoCount(Map<String, Object> map);

    /**
     * @param map {}
     * @return List<VehicleInfo>
     * @description //TODO 查询queryVehicleChecks
     * @Date 9:23 2021/8/31
     */
    List<VehicleInfo> queryVehicleChecks(Map<String, Object> map);

    /**
     * @param map {center_status: ''，uuid: ''}
     * @return Integer 1 or 0
     * @description //TODO 修改vehicle_checks表
     * @Date 9:48 2021/8/31
     */
    Integer updateVehicleChecks(Map<String, Object> map);

    /**
     * @param map {}
     * @return Integer count(*)
     * @description //TODO 查询vehicle_checks表
     * @Date 9:48 2021/8/31
     */
    Integer queryVehicleChecksCount(Map<String, Object> map);
}
