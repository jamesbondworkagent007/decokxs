package com.alibaba.sdk.android.oss.common.utils;

import android.os.Build;
import com.alibaba.sdk.android.oss.common.OSSLog;

/* JADX INFO: loaded from: classes2.dex */
public class VersionInfoUtils {
    private static String userAgent;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getVersion() {
        return "2.9.2";
    }

    public static String getUserAgent(String str) {
        if (OSSUtils.isEmptyString(userAgent)) {
            userAgent = "aliyun-sdk-android/" + getVersion() + getSystemInfo();
        }
        if (OSSUtils.isEmptyString(str)) {
            return userAgent;
        }
        return userAgent + "/" + str;
    }

    private static String getSystemInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(System.getProperty("os.name"));
        sb.append("/Android " + Build.VERSION.RELEASE);
        sb.append("/");
        sb.append(HttpUtil.urlEncode(Build.MODEL, "utf-8") + ";" + HttpUtil.urlEncode(Build.ID, "utf-8"));
        sb.append(")");
        String string = sb.toString();
        OSSLog.logDebug("user agent : " + string);
        return OSSUtils.isEmptyString(string) ? System.getProperty("http.agent").replaceAll("[^\\p{ASCII}]", "?") : string;
    }
}
