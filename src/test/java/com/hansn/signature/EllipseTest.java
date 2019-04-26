package com.hansn.signature;

import com.niezhiliang.signature.utils.convent.BaseSignatrue;
import com.niezhiliang.signature.utils.entity.SealEntity;
import com.niezhiliang.signature.utils.factory.EllipseFactory;
import org.junit.Test;

/**
 * @Author:Hansn
 * @Date: 2019/4/24 上午10:09
 * Description:
 */
public class EllipseTest {
    @Test
    public void test(){
        BaseSignatrue baseSignatrue = new EllipseFactory().getInstance();
        SealEntity sealEntity = new SealEntity();
        sealEntity.setColor(1)
                .setCompanyName("浙江葫芦娃网络集团有限公司")
                .setFont(2)
                .setSerNo("1233233")
                .setTitle("合同专用章");
        try {
            String base64 = baseSignatrue.createCompanySign(sealEntity);
            System.out.println(base64);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
