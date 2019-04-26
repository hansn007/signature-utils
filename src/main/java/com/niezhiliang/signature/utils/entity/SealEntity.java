package com.niezhiliang.signature.utils.entity;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:Hansn
 * @Date: 2019/4/24 下午2:39
 * Description:
 */
public class SealEntity {
    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 颜色
     */
    private Integer color = 0;

    /**
     * 字体
     */
    private Integer font = 0;

    /**
     * 下弦文
     */
    private String serNo;

    /**
     * 副标题
     */
    private String title;

    /**
     * 颜色的集合
     */
    private static java.util.List<Color> colorList = Arrays.asList(Color.RED,Color.BLUE,Color.BLACK);

    /**
     * 字体集合
     */
    private static List<String> fonts = Arrays.asList("宋体","方正黑体","楷体");

    public String getCompanyName() {
        return companyName;
    }

    public SealEntity setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public SealEntity setColor(Integer color) {
        this.color = color;
        return this;
    }


    public SealEntity setFont(Integer font) {
        this.font = font;
        return this;
    }

    public String getSerNo() {
        return serNo;
    }

    public SealEntity setSerNo(String serNo) {
        this.serNo = serNo;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SealEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public static List<Color> getColorList() {
        return colorList;
    }

    public static void setColorList(List<Color> colorList) {
        SealEntity.colorList = colorList;
    }

    public static List<String> getFonts() {
        return fonts;
    }

    public static void setFonts(List<String> fonts) {
        SealEntity.fonts = fonts;
    }

    public Color getColor() {
        return color > colorList.size() ? colorList.get(0) : colorList.get(color);
    }

    public String getFont() {
        return font > fonts.size() ? fonts.get(0) : fonts.get(font);
    }


}
