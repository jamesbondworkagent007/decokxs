package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fiT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18440fiT {
    public final ConcurrentHashMap<java.lang.String, java.lang.String> KWHzl = new ConcurrentHashMap<>();

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.get(str);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.put(str, str2);
    }
}
