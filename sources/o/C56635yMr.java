package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yMr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56635yMr {
    public static final boolean KWHzl(@NotNull C56637yMt c56637yMt, @NotNull InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(c56637yMt, "");
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        if (yYH.isConnected(interfaceC56658yNn)) {
            java.util.Set<C56929yXo> setEZpvd = c56637yMt.EZpvd();
            C56929yXo c56929yXoEZpvd = yZE.EZpvd((InterfaceC56663yNs) interfaceC56658yNn);
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends C56929yXo>) ((java.lang.Iterable<? extends java.lang.Object>) setEZpvd), c56929yXoEZpvd != null ? c56929yXoEZpvd.KWHzl() : null)) {
                return true;
            }
        }
        return false;
    }
}
