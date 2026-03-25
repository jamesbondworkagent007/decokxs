package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yIr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56527yIr implements InterfaceC56513yId {
    public final java.lang.Class<?> AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56513yId
    public java.lang.Class<?> OLrzqt() {
        return this.AEQbTJ;
    }

    public C56527yIr(@NotNull java.lang.Class<?> cls, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = cls;
        this.KWHzl = str;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof C56527yIr) && Intrinsics.EZpvd(OLrzqt(), ((C56527yIr) obj).OLrzqt());
    }

    public int hashCode() {
        return OLrzqt().hashCode();
    }

    public java.lang.String toString() {
        return OLrzqt() + " (Kotlin reflection is not available)";
    }
}
