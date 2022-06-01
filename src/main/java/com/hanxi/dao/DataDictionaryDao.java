package com.hanxi.dao;

import com.hanxi.entity.DataDictionary;

import java.util.List;

public interface DataDictionaryDao {

    public List<DataDictionary> findAllDataDictionary(String typeCode);

}
