package com.vehicle.auto.click.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName: vehicle-auto-clicks
 * @Package: com.vehicle.auto.click.model
 * @ClassName: UiVehicleInfo
 * @Description: UI车辆信息实体类
 * @Author: Chen
 * @contact: Afakerchen@em-data.com.cn
 * @software: IntelliJ IDEA
 * @CreateDate: 2021/8/30 13:33
 */
@Data
public class UiVehicleInfo implements Serializable {
    private Integer passNum;
    private Integer noPassNum;
    private List<VehicleInfo> list;
}
