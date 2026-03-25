package com.geetest.captcha;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static y a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return new y(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
            return new y(displayMetrics2.widthPixels, displayMetrics2.heightPixels);
        }
        WindowMetrics maximumWindowMetrics = windowManager.getMaximumWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "");
        Rect bounds = maximumWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "");
        return new y(bounds.width(), bounds.height());
    }
}
