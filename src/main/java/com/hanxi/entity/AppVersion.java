package com.hanxi.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AppVersion)实体类
 *
 * @author makejava
 * @since 2022-04-15 15:35:28
 */
public class AppVersion implements Serializable {
    private static final long serialVersionUID = 183675722941667586L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * appId（来源于：app_info表的主键id）
     */
    private Long appId;
    /**
     * 版本号
     */
    private String versionNo;
    /**
     * 版本介绍
     */
    private String versionInfo;
    /**
     * 发布状态（来源于：data_dictionary，1 不发布 2 已发布 3 预发布）
     */
    private Long publishStatus;
    /**
     * 下载链接
     */
    private String downloadLink;
    /**
     * 版本大小（单位：M）
     */
    private Double versionSize;
    /**
     * 创建者（来源于dev_user开发者信息表的用户id）
     */
    private Long createdBy;
    /**
     * 创建时间
     */
    private Date creationDate;
    /**
     * 更新者（来源于dev_user开发者信息表的用户id）
     */
    private Long modifyBy;
    /**
     * 最新更新时间
     */
    private Date modifyDate;
    /**
     * apk文件的服务器存储路径
     */
    private String apkLocPath;
    /**
     * 上传的apk文件名称
     */
    private String apkFileName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }

    public Long getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Long publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public Double getVersionSize() {
        return versionSize;
    }

    public void setVersionSize(Double versionSize) {
        this.versionSize = versionSize;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getApkLocPath() {
        return apkLocPath;
    }

    public void setApkLocPath(String apkLocPath) {
        this.apkLocPath = apkLocPath;
    }

    public String getApkFileName() {
        return apkFileName;
    }

    public void setApkFileName(String apkFileName) {
        this.apkFileName = apkFileName;
    }
}

