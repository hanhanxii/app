package com.hanxi.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppInfoListDao {

    public List<AppInfoListDao> getAllAppInfoList(@Param("softwareName") String querySoftwareName, @Param("flatformId")String queryFlatformId, @Param("categoryLevel1") String queryCategoryLevel1, @Param("categoryLevel2") String queryCategoryLevel2, @Param("categoryLevel3") String queryCategoryLevel3,@Param("status") Long status);

}
