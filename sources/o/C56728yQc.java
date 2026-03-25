package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56728yQc {
    public static final java.lang.Class<?> AEQbTJ(@NotNull java.lang.ClassLoader classLoader, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(classLoader, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return java.lang.Class.forName(str, false, classLoader);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }
}
