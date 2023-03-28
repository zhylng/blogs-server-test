package com.blogs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blogs.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
