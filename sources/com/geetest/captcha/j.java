package com.geetest.captcha;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f368a = "加载遇到一点麻烦";
    public static String b = "网络错误";
    public static String c = "网络链接超时";
    public static String d = "证书错误";
    public static String e = "参数不合法";
    public static String f = "验证会话已取消";
    public static String g = "不支持的 WebView 组件";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter("gt4_web_callback_error", "");
        String string = applicationContext.getString(u.a(context, "gt4_web_callback_error", "string"));
        Intrinsics.checkNotNullExpressionValue(string, "");
        f368a = string;
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter("gt4_web_view_load_error", "");
        String string2 = applicationContext2.getString(u.a(context, "gt4_web_view_load_error", "string"));
        Intrinsics.checkNotNullExpressionValue(string2, "");
        b = string2;
        Context applicationContext3 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter("gt4_web_view_load_timeout", "");
        String string3 = applicationContext3.getString(u.a(context, "gt4_web_view_load_timeout", "string"));
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c = string3;
        Context applicationContext4 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter("gt4_web_view_ssl_error", "");
        String string4 = applicationContext4.getString(u.a(context, "gt4_web_view_ssl_error", "string"));
        Intrinsics.checkNotNullExpressionValue(string4, "");
        d = string4;
        Context applicationContext5 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter("gt4_parameter_config_error", "");
        String string5 = applicationContext5.getString(u.a(context, "gt4_parameter_config_error", "string"));
        Intrinsics.checkNotNullExpressionValue(string5, "");
        e = string5;
        Context applicationContext6 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter("gt4_user_cancel", "");
        String string6 = applicationContext6.getString(u.a(context, "gt4_user_cancel", "string"));
        Intrinsics.checkNotNullExpressionValue(string6, "");
        f = string6;
        Context applicationContext7 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter("gt4_device_not_supported", "");
        String string7 = applicationContext7.getString(u.a(context, "gt4_device_not_supported", "string"));
        Intrinsics.checkNotNullExpressionValue(string7, "");
        g = string7;
    }
}
