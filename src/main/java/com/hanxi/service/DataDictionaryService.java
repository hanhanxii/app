package com.hanxi.service;

import com.hanxi.entity.DataDictionary;

import java.util.List;

public interface DataDictionaryService {

    public List<DataDictionary> findAllDataDictionary(String typeCode);

}
