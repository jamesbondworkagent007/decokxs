package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jKv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25908jKv implements InterfaceC40516qYt {
    public final double EZpvd;
    public final float KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25908jKv copy$default(C25908jKv c25908jKv, float f, java.lang.String str, double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = c25908jKv.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c25908jKv.copydefault;
        }
        if ((i & 4) != 0) {
            d = c25908jKv.EZpvd;
        }
        return c25908jKv.copydefault(f, str, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25908jKv copydefault(float f, @NotNull java.lang.String str, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C25908jKv(f, str, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25908jKv)) {
            return false;
        }
        C25908jKv c25908jKv = (C25908jKv) obj;
        return java.lang.Float.compare(this.KWHzl, c25908jKv.KWHzl) == 0 && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c25908jKv.copydefault) && java.lang.Double.compare(this.EZpvd, c25908jKv.EZpvd) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Float.hashCode(this.KWHzl) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Double.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FundFeeItemVo(percent=" + this.KWHzl + ", title=" + this.copydefault + ", count=" + this.EZpvd + ")";
    }

    public C25908jKv(float f, @NotNull java.lang.String str, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = f;
        this.copydefault = str;
        this.EZpvd = d;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C25908jKv) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return onCompareItems(interfaceC40516qYt);
    }
}
