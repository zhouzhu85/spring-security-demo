package com.zhouzhu.pojo;

import com.zhouzhu.utils.DateUtils;

import java.util.Date;

/**
 *  产品信息
 * @author zhouzhu
 * @Description
 * @create 2019-08-02 11:48
 */
public class ProductDO {

    /** 主键 **/
    private String id;

    /** 编号 唯一 **/
    private String productNum;

    /** 名称 **/
    private String productName;

    /** 出发城市 **/
    private String cityName;

    /** 出发时间 **/
    private Date departureTime;

    /** 虚拟字段（方便departureTime字段被格式化为时间字符） **/
    private String departureTimeStr;

    /** 产品价格 **/
    private double productPrice;

    /** 产品描述 **/
    private String productDesc;

    /** 状态 0 关闭 1 开启 **/
    private Integer productStatus;

    /** 虚拟字段（方便用中文对应productStatus的状态） **/
    private String productStatusStr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTimeStr() {
        if (departureTime!=null){
            return DateUtils.date2String(departureTime,"yyyy-MM-dd HH:mm:ss");
        }
        return departureTimeStr;
    }

    public void setDepartureTimeStr(String departureTimeStr) {
        this.departureTimeStr = departureTimeStr;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductStatusStr() {
        if (productStatus!=null){
            if (productStatus==1){
                productStatusStr="开启";
            }else {
                productStatusStr="关闭";
            }
        }
        return productStatusStr;
    }

    public void setProductStatusStr(String productStatusStr) {
        this.productStatusStr = productStatusStr;
    }
}
