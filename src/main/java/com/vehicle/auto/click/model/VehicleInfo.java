package com.vehicle.auto.click.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: vehicle-auto-clicks
 * @Package: com.vehicle.auto.click.model
 * @ClassName: VehicleInfo
 * @Description: 车辆信息实体类
 * @Author: Chen
 * @contact: Afakerchen@em-data.com.cn
 * @software: IntelliJ IDEA
 * @CreateDate: 2021/8/30 13:33
 */


@Data
public class VehicleInfo implements Serializable {
    private String id;
    private String lsh;
    private String hphm;
    private Integer center_status;
    private Integer is_pass;
    private String copy_text;
    private String isPassReason;

    /**
     * @description 车辆信息
     * @Date 14:33 2021/8/30
     * @param id ID
     * @param hphm 车牌号码
     * @param copy_text 描述信息
     */
    public VehicleInfo(String id, String hphm, String copy_text) {
        this.id = id;
        this.hphm = hphm;
        this.copy_text = copy_text;
    }
}
