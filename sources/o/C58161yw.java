package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C58161yw {
    public final java.lang.String KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.KWHzl;
    }

    public C58161yw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        this.copydefault = lowerCase.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof C58161yw) && C59449zhJ.gEmmrt(((C58161yw) obj).KWHzl, this.KWHzl, true);
    }
}
