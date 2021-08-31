package com.vehicle.auto.click.mapper.primary;

import org.apache.ibatis.annotations.Mapper;

/**
 * @ProjectName: vehicle-auto-clicks
 * @Package: com.vehicle.auto.click.mapper.primary
 * @ClassName: PhotoInfoMapper
 * @Description: photo_info表操作类
 * @Author: Chen
 * @contact: Afakerchen@em-data.com.cn
 * @software: IntelliJ IDEA
 * @CreateDate: 2021/8/30 17:36
 */

@Mapper
public interface PhotoInfoMapper {
    /**
     * @param id cheLiangUid
     * @return String shuoMing
     * @description //TODO 查询photo_info表
     * @Date 17:48 2021/8/30
     */
    String selectPhotoInfoShuoming(String id);
}
