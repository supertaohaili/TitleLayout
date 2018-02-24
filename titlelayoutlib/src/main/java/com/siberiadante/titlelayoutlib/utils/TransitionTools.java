package com.siberiadante.titlelayoutlib.utils;

import com.siberiadante.titlelayoutlib.TitleLayoutLib;

public class TransitionTools {
    /**
     * dip转为 px
     */
    public static int dip2px(float dipValue) {
//        final float scale = Resources.getSystem().getDisplayMetrics().density;
        final float scale = TitleLayoutLib.getContext().getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    /**
     * px 转为 dip
     */
    public static int px2dip(float pxValue) {
        final float scale = TitleLayoutLib.getContext().getResources().getDisplayMetrics().density;

        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * 将px值转换为sp值，保证文字大小不变
     *
     * @param pxValue
     * @return
     */
    public static int px2sp(float pxValue) {
        final float fontScale = TitleLayoutLib.getContext().getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }

}
