package com.niezhiliang.signature.utils.factory;

import com.niezhiliang.signature.utils.convent.BaseSignatrue;
import com.niezhiliang.signature.utils.convent.Circle;
import com.niezhiliang.signature.utils.convent.SealFactory;

/**
 * @Author:Hansn
 * @Date: 2019/4/26 上午9:16
 * Description:
 */
public class CircleFactory extends SealFactory {
    @Override
    public BaseSignatrue getInstance() {
        if (this.baseSignatrue == null) {
            return new Circle();
        }
        return this.baseSignatrue;
    }
}
