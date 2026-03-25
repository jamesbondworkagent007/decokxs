package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AGe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C2293AGe {
    public static final int $stable = 8;
    public long AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public C4148AzQ OLrzqt;
    public C4148AzQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2293AGe copy$default(C2293AGe c2293AGe, long j, java.lang.String str, java.lang.String str2, C4148AzQ c4148AzQ, C4148AzQ c4148AzQ2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c2293AGe.AEQbTJ;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = c2293AGe.KWHzl;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = c2293AGe.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            c4148AzQ = c2293AGe.copydefault;
        }
        C4148AzQ c4148AzQ3 = c4148AzQ;
        if ((i & 16) != 0) {
            c4148AzQ2 = c2293AGe.OLrzqt;
        }
        return c2293AGe.AEQbTJ(j2, str3, str4, c4148AzQ3, c4148AzQ2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2293AGe AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull C4148AzQ c4148AzQ, @NotNull C4148AzQ c4148AzQ2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c4148AzQ, "");
        Intrinsics.checkNotNullParameter(c4148AzQ2, "");
        return new C2293AGe(j, str, str2, c4148AzQ, c4148AzQ2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4148AzQ AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4148AzQ OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2293AGe)) {
            return false;
        }
        C2293AGe c2293AGe = (C2293AGe) obj;
        return this.AEQbTJ == c2293AGe.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2293AGe.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c2293AGe.EZpvd) && Intrinsics.EZpvd(this.copydefault, c2293AGe.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c2293AGe.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Preset(id=" + this.AEQbTJ + ", name=" + this.KWHzl + ", presetType=" + this.EZpvd + ", buyPreset=" + this.copydefault + ", sellPreset=" + this.OLrzqt + ")";
    }

    public C2293AGe(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull C4148AzQ c4148AzQ, @NotNull C4148AzQ c4148AzQ2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c4148AzQ, "");
        Intrinsics.checkNotNullParameter(c4148AzQ2, "");
        this.AEQbTJ = j;
        this.KWHzl = str;
        this.EZpvd = str2;
        this.copydefault = c4148AzQ;
        this.OLrzqt = c4148AzQ2;
    }
}
