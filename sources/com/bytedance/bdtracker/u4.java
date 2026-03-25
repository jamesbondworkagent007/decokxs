package com.bytedance.bdtracker;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.NonNull;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f268a;
    public int b;
    public final boolean c = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        Iterator<String> itKeys = jSONObject.keys();
        boolean z = true;
        int iA = 2;
        while (itKeys.hasNext()) {
            if (!z) {
                iA++;
            }
            String next = itKeys.next();
            iA = a(jSONObject.opt(next)) + b(next) + 3 + iA;
            z = false;
        }
        return iA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int b(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                i2++;
            } else if (cCharAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(cCharAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean a(@NonNull JSONObject jSONObject, boolean z) {
        int iA = this.f268a + a(jSONObject) + (z ? 15 : 1);
        if (iA >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return false;
        }
        this.f268a = iA;
        return true;
    }

    public static String a(String str) {
        if (str == null || ((long) str.length()) * 4 <= 51200) {
            return str;
        }
        int iB = b(str);
        return (((long) iB) <= 51200 || iB <= 0) ? str : "{\"description\":\"event param too large\"}";
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0076 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Object obj) {
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        int iA = 2;
        int i = 0;
        boolean z = true;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray == null) {
                return 0;
            }
            int i2 = 0;
            while (i2 < jSONArray.length()) {
                if (!z) {
                    iA++;
                }
                iA += a(jSONArray.opt(i2));
                i2++;
                z = false;
            }
            return iA;
        }
        if (!(obj instanceof String)) {
            return String.valueOf(obj).length();
        }
        String str = (String) obj;
        if (str != null) {
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\f' && cCharAt != '\r' && cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        default:
                            if (cCharAt <= 127) {
                                i3++;
                                break;
                            } else if (cCharAt > 2047) {
                                if (!Character.isHighSurrogate(cCharAt)) {
                                    i3 += 3;
                                } else {
                                    i3 += 4;
                                    i++;
                                }
                                break;
                            }
                        case '\b':
                        case '\t':
                        case '\n':
                            break;
                    }
                } else {
                    i3 += 2;
                }
                i++;
            }
            i = i3;
        }
        return i + 2;
    }
}
