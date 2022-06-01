package com.hanxi.service;

import com.hanxi.dao.AppInfoListDao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppInfoListService {

    public List<AppInfoListDao> getAllAppInfoList(@Param("softwareName") String querySoftwareName, @Param("valueId")String queryFlatformId, @Param("categoryLevel1") String queryCategoryLevel1, @Param("categoryLevel2") String queryCategoryLevel2, @Param("categoryLevel3") String queryCategoryLevel3,@Param("status") Long status);

}
