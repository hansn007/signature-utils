package com.niezhiliang.signature.utils.convent;

import com.niezhiliang.signature.utils.entity.SealEntity;
import com.niezhiliang.signature.utils.signature.Signature;

/**
 * @Author:Hansn
 * @Date: 2019/4/23 下午2:45
 * Description:
 */
public abstract class BaseSignatrue implements Signature {
    public abstract String createCompanySign(SealEntity sealEntity) throws Exception;
}
