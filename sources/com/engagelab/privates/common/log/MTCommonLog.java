package com.engagelab.privates.common.log;

import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.engagelab.privates.common.BuildConfig;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MTCommonLog {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(String str, String str2) {
        if (MTGlobal.getDebugMode()) {
            getTag();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(String str, String str2) {
        getTag();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getLogTag() {
        try {
            String name = Thread.currentThread().getName();
            if (TextUtils.isEmpty(name)) {
                return MTCommonConstants.getLogTag() + "SDK";
            }
            if (TextUtils.equals(name, Looper.getMainLooper().getThread().getName())) {
                return MTCommonConstants.getLogTag() + "MAIN";
            }
            if (name.startsWith(MTCommonConstants.getLogTag())) {
                return name;
            }
            return MTCommonConstants.getLogTag() + name;
        } catch (Throwable unused) {
            return MTCommonConstants.getLogTag() + "SDK";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getTag() {
        return getLogTag() + BuildConfig.LOG_TAG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(String str, String str2) {
        getTag();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String toLogString(Bundle bundle) {
        if (bundle == null) {
            return AbstractJsonLexerKt.NULL;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{ ");
            for (String str : bundle.keySet()) {
                sb.append(str);
                sb.append(":");
                sb.append(bundle.get(str));
                sb.append(" ");
            }
            sb.append("}");
            return sb.toString();
        } catch (Throwable unused) {
            return bundle.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void w(String str, String str2) {
        if (MTGlobal.getDebugMode()) {
            getTag();
        }
    }

    public static String toLogString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return AbstractJsonLexerKt.NULL;
        }
        try {
            return LINE_SEPARATOR + jSONObject.toString(2);
        } catch (Throwable unused) {
            return jSONObject.toString();
        }
    }
}
