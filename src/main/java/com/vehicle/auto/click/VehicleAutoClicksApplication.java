package com.vehicle.auto.click;

import com.vehicle.auto.click.task.UIFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class VehicleAutoClicksApplication {
    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                createGUI();
//            }
//        });
        SpringApplication.run(VehicleAutoClicksApplication.class, args);
    }

//    /**
//     * @description //TODO 启动UI自动化GUI界面
//     * @Date 17:59 2021/8/31
//     */
//    private static void createGUI() {
//        //JFrame指一个窗口，构造方法的参数为窗口标题
//        JFrame frame = new UIFrame("查验自动审核工具V1.3.7");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //设置窗口的其它参数，如窗口大小
//        frame.setSize(1200, 650);
//        //显示窗口
//        frame.setVisible(true);
//    }
}
