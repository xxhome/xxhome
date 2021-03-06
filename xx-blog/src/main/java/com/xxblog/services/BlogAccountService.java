package com.xxblog.services;

import com.xxbase.services.BaseService;
import com.xxblog.entity.BlogAccountEntity;

/**
 * Created by admin on 16/05/16.
 */
public interface BlogAccountService extends BaseService<BlogAccountEntity, Long> {

    public BlogAccountEntity findByEmail(String email);

    public void initDefaultAccount();
}
