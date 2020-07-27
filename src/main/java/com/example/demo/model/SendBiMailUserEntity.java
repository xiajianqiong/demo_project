package com.example.demo.model;

import lombok.Data;

/**
 * @ClassName SendBiMailUserEntity
 * @Author 夏俭琼
 * @Date 2020/7/20 10:04
 **/
@Data
public class SendBiMailUserEntity {
    /**
     * 物料名称
     */
    private String materialname;
    /**
     * 码洋
     */
    private String fixedprice;
    /**
     * 调出仓位
     */
    private String dcstockloc;
    /**
     * 调入仓位
     */
    private String drstockloc;
    /**
     * 调拨数量
     */
    private String dbfqty;


}
