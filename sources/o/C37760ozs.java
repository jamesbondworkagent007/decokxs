package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37760ozs {
    public static final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SPUtils.put(str, obj, "im_preferences");
    }

    public static final boolean copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return SPUtils.getBoolean(str, z, "im_preferences");
    }

    public static final <T> T OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        return (T) SPUtils.getObject(str, (java.lang.Class) cls, "im_preferences");
    }

    public static final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.remove(str, "im_preferences");
    }
}
