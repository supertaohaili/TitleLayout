package com.siberiadante.titlelayoutlib;

import android.annotation.SuppressLint;
import android.content.Context;


public class TitleLayoutLib {

    @SuppressLint("StaticFieldLeak")
    private static Context context;

    public TitleLayoutLib() {
        throw new UnsupportedOperationException("Use this lib,you need init first! In your Application: TitleLayoutLib.initLib(context);");
    }

    public static void init(Context context) {
        TitleLayoutLib.context = context;
    }

    public static Context getContext() {
        if (context != null) {
            return context;
        } else {
            throw new NullPointerException("Use this lib,you need init first! In your Application: TitleLayoutLib.initLib(context);");

        }
    }

}
