package com.shoppingpermission.permission.modules.ums.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shoppingpermission.permission.modules.ums.model.UmsResource;

/**
 * @program: shopping-permission
 * @description: 后台资源管理Service
 * @author: Gauss
 * @date: 2021-06-03 15:35
 **/
public interface UmsResourceService extends IService<UmsResource> {
    /**
     * 添加资源
     */
    boolean create(UmsResource umsResource);

    /**
     * 修改资源
     */
    boolean update(Long id, UmsResource umsResource);

    /**
     * 删除资源
     */
    boolean delete(Long id);

    /**
     * 分页查询资源
     */
    Page<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);
}

