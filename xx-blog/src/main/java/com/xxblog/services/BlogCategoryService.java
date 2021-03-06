package com.xxblog.services;

import com.xxbase.services.BaseService;
import com.xxblog.entity.BlogCategoryEntity;

/**
 * Created by admin on 16/05/16.
 */
public interface BlogCategoryService extends BaseService<BlogCategoryEntity, Long> {


    /**
     * 初始化博客分类列表
     */
    public void initBlogCategory();

}
