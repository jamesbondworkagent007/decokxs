package com.bytedance.applog.aggregation;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    public static final JSONObject copy(@NotNull JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) jSONObject, "");
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject2;
    }

    public static final JSONObject copyFrom(@NotNull JSONObject jSONObject, JSONObject jSONObject2) {
        Intrinsics.EZpvd((Object) jSONObject, "");
        if (jSONObject2 != null) {
            try {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static final JSONObject toJSONObject(@NotNull String str) {
        Intrinsics.EZpvd((Object) str, "");
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final JSONArray toJSONArray(@NotNull String str) {
        Intrinsics.EZpvd((Object) str, "");
        try {
            return new JSONArray(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
