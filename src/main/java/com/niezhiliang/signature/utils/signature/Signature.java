package com.niezhiliang.signature.utils.signature;

import com.niezhiliang.signature.utils.entity.SealEntity;


public interface Signature {
    String createCompanySign(SealEntity sealEntity) throws Exception;
}
