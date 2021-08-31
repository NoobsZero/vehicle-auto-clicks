package com.vehicle.auto.click.service.impl;

import com.vehicle.auto.click.mapper.primary.ChaYanVehicleInfoMapper;
import com.vehicle.auto.click.mapper.primary.PhotoInfoMapper;
import com.vehicle.auto.click.mapper.second.CheckInfosMapper;
import com.vehicle.auto.click.mapper.second.VehicleChecksMapper;
import com.vehicle.auto.click.model.VehicleInfo;
import com.vehicle.auto.click.service.VehicleInfoService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: vehicle-auto-clicks
 * @Package: com.vehicle.auto.click.service.impl
 * @ClassName: VehicleInfoServiceImpl
 * @Description: 类作用描述
 * @Author: Chen
 * @contact: Afakerchen@em-data.com.cn
 * @software: IntelliJ IDEA
 * @CreateDate: 2021/8/30 14:46
 */
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Service("VehicleInfoService")
public class VehicleInfoServiceImpl implements VehicleInfoService {

    private final CheckInfosMapper checkInfosMapper;

    private final PhotoInfoMapper photoInfoMapper;

    private final ChaYanVehicleInfoMapper chaYanVehicleInfoMapper;

    private final VehicleChecksMapper vehicleChecksMapper;


    /**
     * @param id cheLiangUid
     * @return String shuoMing
     * @description //TODO 根据车辆ID查询check_infos说明（second）
     * @Date 15:26 2021/8/30
     */
    @Override
    public String selectCheckInfosShuoming(String id) {
        if (StringUtils.isNotBlank(id)) {
            return checkInfosMapper.selectCheckInfosShuoming(Integer.parseInt(id));
        }
        return "";
    }

    /**
     * @param id cheLiangUid
     * @return String shuoMing
     * @description //TODO 根据车辆ID查询Photo_info说明（primary）
     * @Date 17:40 2021/8/30
     */
    @Override
    public String selectPhotoInfoShuoming(String id) {
        if (StringUtils.isNotBlank(id)) {
            return photoInfoMapper.selectPhotoInfoShuoming(id);
        }
        return "";
    }

    /**
     * @param map {}
     * @return List<VehicleInfo>
     * @description //TODO 查询chaYanVehicle_info
     * @Date 18:07 2021/8/30
     */
    @Override
    public List<VehicleInfo> queryChaYanVehicleInfo(Map<String, Object> map) {
        return chaYanVehicleInfoMapper.queryChaYanVehicleInfo(map);
    }

    /**
     * @param map {center_status: ''，uuid: ''}
     * @return Integer 1 or 0
     * @description //TODO 修改chaYanVehicle_info
     * @Date 9:07 2021/8/31
     */
    @Override
    public Integer updateChaYanVehicleInfo(Map<String, Object> map) {
        return chaYanVehicleInfoMapper.updateChaYanVehicleInfo(map);
    }

    /**
     * @param map {}
     * @return Integer count(*)
     * @description //TODO 查询chaYanVehicle_info
     * @Date 9:11 2021/8/31
     */
    @Override
    public Integer queryChaYanVehicleInfoCount(Map<String, Object> map) {
        return chaYanVehicleInfoMapper.queryChaYanVehicleInfoCount(map);
    }

    /**
     * @param map {}
     * @return List<VehicleInfo>
     * @description //TODO 查询vehicle_checks
     */
    @Override
    public List<VehicleInfo> queryVehicleChecks(Map<String, Object> map) {
        return vehicleChecksMapper.queryVehicleChecks(map);
    }

    /**
     * @param map {center_status: ''，uuid: ''}
     * @return Integer 1 or 0
     * @description //TODO 修改vehicle_checks表
     * @Date 9:48 2021/8/31
     */
    @Override
    public Integer updateVehicleChecks(Map<String, Object> map) {
        return vehicleChecksMapper.updateVehicleChecks(map);
    }

    /**
     * @param map {}
     * @return Integer count(*)
     * @description //TODO 查询vehicle_checks表
     * @Date 9:48 2021/8/31
     */
    @Override
    public Integer queryVehicleChecksCount(Map<String, Object> map) {
        return vehicleChecksMapper.queryVehicleChecksCount(map);
    }
}
