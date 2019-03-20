package com.chezhibao.bigdata.cache.exception;

import com.chezhibao.bigdata.cache.enums.BigCacheEnum;

/**
 * @author WangCongJun
 * @date 2018/5/16
 * Created by WangCongJun on 2018/5/16.
 */
public class BigCacheException extends BigException {

    public BigCacheException(BigCacheEnum bigCacheEnum){
        super(bigCacheEnum.getCode(),bigCacheEnum.getMsg());
    }
    public BigCacheException(BigCacheEnum bigCacheEnum,String msg){
        super(bigCacheEnum.getCode(),msg+"==="+bigCacheEnum.getMsg());
    }
}
