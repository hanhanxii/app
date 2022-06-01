package com.hanxi.service.impl;

import com.hanxi.dao.DataDictionaryDao;
import com.hanxi.entity.DataDictionary;
import com.hanxi.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {

    @Autowired
    private DataDictionaryDao dataDictionaryDao;

    @Override
    public List<DataDictionary> findAllDataDictionary(String typeCode) {
        List<DataDictionary> dictionaries = dataDictionaryDao.findAllDataDictionary(typeCode);
        return dictionaries;
    }
}
