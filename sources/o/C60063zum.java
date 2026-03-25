package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zum, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C60063zum {
    public static final void copydefault(@NotNull C60057zug c60057zug, @NotNull java.util.Properties properties) {
        Intrinsics.checkNotNullParameter(c60057zug, "");
        Intrinsics.checkNotNullParameter(properties, "");
        c60057zug.KWHzl().KWHzl().EZpvd("load " + properties.size() + " properties");
        java.util.Map mapValues = C56424yEw.values(properties);
        Intrinsics.copydefault(mapValues, "");
        for (Map.Entry entry : mapValues.entrySet()) {
            c60057zug.AEQbTJ((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
    }
}
