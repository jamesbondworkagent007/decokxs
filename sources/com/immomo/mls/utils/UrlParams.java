package com.immomo.mls.utils;

import android.graphics.Color;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class UrlParams extends HashMap<String, String> {
    private static final String MAIN_INDEX_KEY = "entryFile";
    private static final String MIN_SDK_VERSION = "msv";
    private static final String PRE_LOAD = "preload";
    private static final String SHOW_LOADING = "showLoading";
    private static final String STATUS_BAR_COLOR = "statusBarColor";
    private static final String STATUS_BAR_STYLE = "statusBarStyle";
    private static final String TRUE = "1";
    private static final String VERSION_KEY = "version";
    private String urlWithoutParams;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUrlWithoutParams() {
        return this.urlWithoutParams;
    }

    public UrlParams(@NonNull String str) {
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            for (String str2 : queryParameterNames) {
                put(str2, uri.getQueryParameter(str2));
            }
            str = str.substring(0, str.indexOf(63));
        }
        this.urlWithoutParams = str;
    }

    public String getEntryFile() {
        return get(MAIN_INDEX_KEY);
    }

    public String getVersion() {
        return get("version");
    }

    public String[] getPreload() {
        String str = get(PRE_LOAD);
        if (str == null || str.length() == 0) {
            return null;
        }
        return str.substring(1, str.length() - 1).split(",");
    }

    public Integer getStatusBarColor() {
        String str = get(STATUS_BAR_COLOR);
        if (str == null || str.length() == 0) {
            return null;
        }
        return Integer.valueOf(Color.parseColor(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + str));
    }

    public Integer getStatusBarStyle() {
        String str = get(STATUS_BAR_STYLE);
        if (str == null || str.length() == 0 || !isInteger(str)) {
            return null;
        }
        return Integer.valueOf(str);
    }

    public int getMinSdkVersion() {
        String str = get(MIN_SDK_VERSION);
        if (str == null || str.length() == 0) {
            return -1;
        }
        return Integer.valueOf(str).intValue();
    }

    public boolean showLoading() {
        String str = get(SHOW_LOADING);
        if (isEmpty(str)) {
            return true;
        }
        return "1".equals(str);
    }

    private static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isInteger(String str) {
        return Pattern.compile("^[-+]?[\\d]*$").matcher(str).matches();
    }
}
