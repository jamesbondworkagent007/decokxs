package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C14922dub {
    public static final java.util.HashMap<java.lang.String, java.lang.Object> OLrzqt(@NotNull android.os.Bundle bundle) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            if (obj instanceof java.lang.String) {
                map.put(str, obj);
            } else if (obj instanceof java.lang.Integer) {
                map.put(str, obj);
            } else if (obj instanceof java.lang.Long) {
                map.put(str, obj);
            } else if (obj instanceof java.lang.Float) {
                map.put(str, obj);
            } else if (obj instanceof java.lang.Double) {
                map.put(str, obj);
            } else if (obj instanceof java.lang.Boolean) {
                map.put(str, obj);
            } else if (obj instanceof java.lang.Object[]) {
                map.put(str, obj);
            } else {
                if (obj == null || (string = obj.toString()) == null) {
                    string = "";
                }
                map.put(str, string);
            }
        }
        return map;
    }
}
