package com.mr.dzh.service.impl;

import com.mr.dzh.entity.DemoEntity;
import com.mr.dzh.mapper.DemoEntityMapper;
import com.mr.dzh.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DemoServiceImpl
 * @Description: TODO
 * @Author douzhihong
 * @Date 2020/1/6
 * @Version v1.0
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoEntityMapper mapper;
    @Override
    public List getDemoList() {

        return mapper.list();
    }

    @Override
    public void demoSave(List<DemoEntity> personVoList) {
        mapper.demoSave(personVoList);
    }
}
 
