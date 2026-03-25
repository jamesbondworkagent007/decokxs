package o;

import android.icu.text.MessageFormat;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pSL {
    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, java.util.Map<java.lang.Object, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.HashMap map2 = new java.util.HashMap();
        if (map != null) {
            for (Map.Entry<java.lang.Object, ? extends java.lang.Object> entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        map2.put(str2, java.lang.Integer.valueOf(i));
        try {
            return new MessageFormat(str).format(map2);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
