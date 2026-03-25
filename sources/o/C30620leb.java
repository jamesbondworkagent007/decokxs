package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.leb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30620leb implements InterfaceC30619lea {
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public java.lang.String getValue() {
        return this.copydefault;
    }

    public C30620leb(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.copydefault = str;
        this.OLrzqt = map;
    }
}
