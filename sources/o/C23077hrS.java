package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hrS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23077hrS {
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23077hrS copy$default(C23077hrS c23077hrS, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c23077hrS.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c23077hrS.copydefault;
        }
        if ((i & 4) != 0) {
            z = c23077hrS.EZpvd;
        }
        return c23077hrS.OLrzqt(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23077hrS OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C23077hrS(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23077hrS)) {
            return false;
        }
        C23077hrS c23077hrS = (C23077hrS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c23077hrS.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c23077hrS.copydefault) && this.EZpvd == c23077hrS.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexRateLabelDisplayData(mainText=" + this.KWHzl + ", fiatValue=" + this.copydefault + ", isRtl=" + this.EZpvd + ")";
    }

    public C23077hrS(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.EZpvd = z;
    }
}
