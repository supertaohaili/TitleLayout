package com.siberiadante.titlelayoutlib.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.WindowManager;

import com.siberiadante.titlelayoutlib.Constants;


/**
 * Created by SiberiaDante on 2017/5/4.
 * 屏幕相关工具类
 */

public class ScreenUtil {

    private ScreenUtil() {
        throw new UnsupportedOperationException("Use this lib,you need init first! In your Application: TitleLayoutLib.initLib(context);");
    }

    /**
     * @param activity
     */
    public static void setStatusTranslucent(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }

    /**
     * 计算状态栏高度
     *
     * @return 状态栏高度
     */
    public static int getStatusBarHeight() {
        return getInternalDimensionSize(Resources.getSystem(), Constants.STATUS_BAR_HEIGHT_RES_NAME);
    }

    private static int getInternalDimensionSize(Resources res, String key) {
        int result = 0;
        int resourceId = res.getIdentifier(key, "dimen", "android");
        if (resourceId > 0) {
            result = res.getDimensionPixelSize(resourceId);
        }
        return result;
    }

}
