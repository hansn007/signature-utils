package com.hansn.signature;

import com.niezhiliang.signature.utils.convent.CircleFactory;
import com.niezhiliang.signature.utils.entity.SealEntity;
import com.niezhiliang.signature.utils.signature.Signature;
import org.junit.Test;

/**
 * @Author:Hansn
 * @Date: 2019/4/24 上午9:07
 * Description:
 */
public class CircleTest {

    @Test
    public void test() {
        Signature signature = new CircleFactory();
        SealEntity sealEntity = new SealEntity();
        sealEntity.setColor(0)
                .setCompanyName("浙江葫芦娃网络集团有限公司")
                .setFont(2)
                .setSerNo("12345678")
                .setTitle("合同专用章");
        String base64 = null;
        try {
            base64 = signature.createCompanySign(sealEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(base64);
    }
}
