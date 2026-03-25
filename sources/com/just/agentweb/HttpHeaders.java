package com.just.agentweb;

import android.net.Uri;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes17.dex */
public class HttpHeaders {
    private final Map<String, Map<String, String>> mHeaders = new ArrayMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, Map<String, String>> getHeaders() {
        return this.mHeaders;
    }

    public static HttpHeaders create() {
        return new HttpHeaders();
    }

    public Map<String, String> getHeaders(String str) {
        String strSubBaseUrl = subBaseUrl(str);
        if (this.mHeaders.get(strSubBaseUrl) == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.mHeaders.put(strSubBaseUrl, arrayMap);
            return arrayMap;
        }
        return this.mHeaders.get(strSubBaseUrl);
    }

    public void additionalHttpHeader(String str, String str2, String str3) {
        if (str == null) {
            return;
        }
        String strSubBaseUrl = subBaseUrl(str);
        Map<String, Map<String, String>> headers = getHeaders();
        Map<String, String> arrayMap = headers.get(subBaseUrl(strSubBaseUrl));
        if (arrayMap == null) {
            arrayMap = new ArrayMap<>();
        }
        arrayMap.put(str2, str3);
        headers.put(strSubBaseUrl, arrayMap);
    }

    public void additionalHttpHeaders(String str, Map<String, String> map) {
        if (str == null) {
            return;
        }
        String strSubBaseUrl = subBaseUrl(str);
        Map<String, Map<String, String>> headers = getHeaders();
        if (map == null) {
            map = new ArrayMap<>();
        }
        headers.put(strSubBaseUrl, map);
    }

    public void removeHttpHeader(String str, String str2) {
        if (str == null) {
            return;
        }
        Map<String, String> map = getHeaders().get(subBaseUrl(str));
        if (map != null) {
            map.remove(str2);
        }
    }

    public boolean isEmptyHeaders(String str) {
        Map<String, String> headers = getHeaders(subBaseUrl(str));
        return headers == null || headers.isEmpty();
    }

    private String subBaseUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() + "://" + uri.getAuthority();
    }

    public String toString() {
        return "HttpHeaders{mHeaders=" + this.mHeaders + AbstractJsonLexerKt.END_OBJ;
    }
}
