package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48874uds implements InterfaceC48871udp {
    @Override // o.InterfaceC48871udp
    public java.io.File copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new java.io.File(str);
    }
}
