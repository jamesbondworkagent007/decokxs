package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31198lpW {
    public static final void AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null || str2.length() == 0) {
            return;
        }
        map.put(str, str2);
    }
}
