package com.hansn.signature;

import com.niezhiliang.signature.utils.convent.EllipseFactory;
import com.niezhiliang.signature.utils.entity.SealEntity;
import org.junit.Test;

/**
 * @Author:Hansn
 * @Date: 2019/4/24 上午10:09
 * Description:
 */
public class EllipseTest {
    @Test
    public void test(){
        EllipseFactory ellipseFactory = new EllipseFactory();
        SealEntity sealEntity = new SealEntity();
        sealEntity.setColor(1)
                .setCompanyName("浙江葫芦娃网络集团有限公司")
                .setFont(2)
                .setSerNo("12345678")
                .setTitle("合同专用章");
        try {
            String base64 = ellipseFactory.createCompanySign(sealEntity);
            System.out.println(base64);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
