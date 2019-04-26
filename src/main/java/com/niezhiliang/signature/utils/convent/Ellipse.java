package com.niezhiliang.signature.utils.convent;

import com.niezhiliang.signature.utils.entity.SealCircle;
import com.niezhiliang.signature.utils.entity.SealConfiguration;
import com.niezhiliang.signature.utils.entity.SealFont;
import com.niezhiliang.signature.utils.SealUtils;
import com.niezhiliang.signature.utils.entity.SealEntity;

/**
 * @Author:Hansn
 * @Date: 2019/4/24 上午9:50
 * Description:
 */
public class Ellipse extends BaseSignatrue {
    @Override
    public String createCompanySign(SealEntity sealEntity) throws Exception {
        SealConfiguration configuration = new SealConfiguration();
        /**
         * 主文字
         */
        SealFont mainFont = new SealFont();
        mainFont.setBold(true);
        mainFont.setFontFamily(sealEntity.getFont());
        mainFont.setMarginSize(10);
        /**************************************************/
        mainFont.setFontText(sealEntity.getCompanyName());
        mainFont.setFontSize(25);
        mainFont.setFontSpace(12.0);
        if (sealEntity.getCompanyName().length() > 14) {
            mainFont.setFontSize(20);
            mainFont.setFontSpace(8.0);
        }


        configuration.setMainFont(mainFont);

        /**
         * 副文字
         */
        if (sealEntity.getSerNo() != null && !"".equals(sealEntity.getSerNo())) {
            SealFont viceFont = new SealFont();
            viceFont.setBold(true);
            viceFont.setFontFamily(sealEntity.getFont());
            viceFont.setMarginSize(5);
            /**************************************************/
            viceFont.setFontText(sealEntity.getSerNo());
            viceFont.setFontSize(13);
            viceFont.setFontSpace(12.0);
            /***************************************************/

            configuration.setViceFont(viceFont);
        }


        /**
         * 抬头文字
         */
        if (sealEntity.getTitle() != null && !"".equals(sealEntity.getTitle())) {
            SealFont titleFont = new SealFont();
            titleFont.setBold(true);
            titleFont.setFontFamily(sealEntity.getFont());
            titleFont.setFontSize(22);
            if (sealEntity.getCompanyName().length() > 14) {
                titleFont.setFontSize(20);
            }
            /**************************************************/
            titleFont.setFontText(sealEntity.getTitle());
            titleFont.setMarginSize(68);
            titleFont.setMarginSize(27);

            configuration.setTitleFont(titleFont);
        }

        /**
         * 图片大小
         */
        configuration.setImageSize(300);
        /**
         * 背景颜色
         */
        configuration.setBackgroudColor(sealEntity.getColor());
        /**
         * 边线粗细、半径
         */
        configuration.setBorderCircle(new SealCircle(4, 140, 100));

        return SealUtils.buildAndStoreSeal(configuration);
    }
}
