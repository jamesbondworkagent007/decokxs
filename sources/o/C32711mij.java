package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: renamed from: o.mij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C32711mij {
    public static java.lang.String AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
        return new Gson().toJson(map);
    }

    public static java.util.Map<java.lang.String, java.lang.String> EZpvd(java.lang.String str) {
        return (java.util.Map) new Gson().fromJson(str, new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() { // from class: o.mij.4
        }.getType());
    }
}
