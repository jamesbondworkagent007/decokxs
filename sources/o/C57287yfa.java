package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yfa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57287yfa implements InterfaceC57302yfp {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57287yfa OLrzqt(@NotNull java.lang.String str, int i, long j, boolean z, @androidx.annotation.ColorRes int i2, @NotNull java.lang.String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C57287yfa(str, i, j, z, i2, str2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57287yfa)) {
            return false;
        }
        C57287yfa c57287yfa = (C57287yfa) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c57287yfa.djBIcL) && this.KWHzl == c57287yfa.KWHzl && this.valueOf == c57287yfa.valueOf && this.AEQbTJ == c57287yfa.AEQbTJ && this.OLrzqt == c57287yfa.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c57287yfa.copydefault) && this.EZpvd == c57287yfa.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.djBIcL.hashCode() * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Long.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OnlyOneAddressState(text=" + this.djBIcL + ", selection=" + this.KWHzl + ", version=" + this.valueOf + ", isExchangeAddress=" + this.AEQbTJ + ", promptColor=" + this.OLrzqt + ", promptMsg=" + this.copydefault + ", isShowPrompt=" + this.EZpvd + ")";
    }

    public C57287yfa(@NotNull java.lang.String str, int i, long j, boolean z, @androidx.annotation.ColorRes int i2, @NotNull java.lang.String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL = str;
        this.KWHzl = i;
        this.valueOf = j;
        this.AEQbTJ = z;
        this.OLrzqt = i2;
        this.copydefault = str2;
        this.EZpvd = z2;
    }
}
