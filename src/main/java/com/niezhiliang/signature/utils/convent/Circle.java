package com.niezhiliang.signature.utils.convent;

import com.niezhiliang.signature.utils.entity.SealCircle;
import com.niezhiliang.signature.utils.entity.SealConfiguration;
import com.niezhiliang.signature.utils.entity.SealFont;
import com.niezhiliang.signature.utils.SealUtils;
import com.niezhiliang.signature.utils.entity.SealEntity;


/**
 * @Author:Hansn
 * @Date: 2019/4/23 下午2:55
 * Description:
 */
public class Circle extends BaseSignatrue {
    @Override
    public String createCompanySign(SealEntity sealEntity) throws Exception {
        SealConfiguration configuration = new SealConfiguration();
        /**
         * 主文字
         */
        SealFont mainFont = new SealFont();
        mainFont.setBold(true);
        mainFont.setFontFamily(sealEntity.getFont());
        mainFont.setMarginSize(5);
        mainFont.setFontText(sealEntity.getCompanyName());
        mainFont.setFontSize(30);
        mainFont.setFontSpace(30.0);
        if (sealEntity.getCompanyName().length() > 14) {
            mainFont.setFontSize(23);
            mainFont.setFontSpace(21.0);
        }

        configuration.setMainFont(mainFont);

        /**
         * 副文字
         */
        if (sealEntity.getSerNo() != null && !"".equals(sealEntity.getSerNo())) {
            SealFont viceFont = new SealFont();
            viceFont.setFontFamily(sealEntity.getFont());
            viceFont.setMarginSize(-5);
            /**************************************************/
            viceFont.setFontText(sealEntity.getSerNo());
            viceFont.setBold(false);
            viceFont.setFontSize(13);
            viceFont.setFontSpace(10.0);
            /**************************************************/

            configuration.setViceFont(viceFont);
        }

        /**
         * 中心文字
         */
        SealFont centerFont = new SealFont();
        centerFont.setBold(false);
        centerFont.setFontFamily(sealEntity.getFont());
        centerFont.setFontText("★");
        centerFont.setFontSize(70);

        configuration.setCenterFont(centerFont);

        /**
         * 抬头文字
         */
        if (sealEntity.getTitle() != null && !"".equals(sealEntity.getTitle())) {
            SealFont titleFont = new SealFont();
            titleFont.setBold(true);
            titleFont.setFontFamily(sealEntity.getFont());
            titleFont.setFontSize(20);
            titleFont.setFontText(sealEntity.getTitle());
            titleFont.setMarginSize(70);

            configuration.setTitleFont(titleFont);
        }

        /**
         * 图片大小
         */
        configuration.setImageSize(250);
        /**
         * 背景颜色
         */
        configuration.setBackgroudColor(sealEntity.getColor());
        /**
         * 边线粗细、半径
         */
        configuration.setBorderCircle(new SealCircle(4, 115, 115));

        return SealUtils.buildAndStoreSeal(configuration);
    }
}
