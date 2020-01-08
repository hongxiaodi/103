package com.mr.dzh.service;

import com.mr.dzh.entity.DemoEntity;

import java.util.List;

public interface DemoService {
    List getDemoList();

    void demoSave(List<DemoEntity> personVoList);
}
