package com.vehicle.auto.click.mapper.second;

import org.apache.ibatis.annotations.Mapper;

/**
 * @ProjectName: vehicle-auto-clicks
 * @Package: com.vehicle.auto.click.mapper.second
 * @ClassName: CheckInfoMapper
 * @Description: check_infos表操作类
 * @Author: Chen
 * @contact: Afakerchen@em-data.com.cn
 * @software: IntelliJ IDEA
 * @CreateDate: 2021/8/30 14:53
 */

@Mapper
public interface CheckInfosMapper {
    /**
     * @param id cheLiangUid
     * @return String shuoMing
     * @description //TODO 查询check_infos表
     * @Date 15:20 2021/8/30
     */
    String selectCheckInfosShuoming(Integer id);
}
