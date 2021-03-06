package com.xxplus.services;

import com.xxbase.dao.BaseDao;
import com.xxbase.services.BaseServiceImpl;
import com.xxplus.entity.MemberTypeEntity;
import com.xxplus.services.MemberTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lifang on 2015/1/31.
 */
@Service
public class MemberTypeServiceImpl extends BaseServiceImpl<MemberTypeEntity, Long> implements MemberTypeService {

    @Override
    @Autowired
    public void setBaseDao(BaseDao<MemberTypeEntity, Long> baseDao) {
        super.setBaseDao(baseDao);
    }
}
