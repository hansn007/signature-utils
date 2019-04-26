package com.niezhiliang.signature.utils.factory;

import com.niezhiliang.signature.utils.convent.BaseSignatrue;
import com.niezhiliang.signature.utils.convent.Ellipse;
import com.niezhiliang.signature.utils.convent.SealFactory;

/**
 * @Author:Hansn
 * @Date: 2019/4/26 上午9:21
 * Description:
 */
public class EllipseFactory extends SealFactory {
    @Override
    public BaseSignatrue getInstance() {
        if (this.baseSignatrue == null) {
            return new Ellipse();
        }
        return this.baseSignatrue;
    }
}
