package o;

import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gWo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19983gWo implements kMU {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<C19981gWm> OLrzqt;
    public final long copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final boolean gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C19981gWm> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19983gWo KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.util.List<C19981gWm> list, boolean z, boolean z2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C19983gWo(str, str2, str3, str4, str5, str6, str7, list, z, z2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19983gWo)) {
            return false;
        }
        C19983gWo c19983gWo = (C19983gWo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c19983gWo.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c19983gWo.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c19983gWo.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c19983gWo.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c19983gWo.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c19983gWo.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c19983gWo.valueOf) && Intrinsics.EZpvd(this.OLrzqt, c19983gWo.OLrzqt) && this.AhwBna == c19983gWo.AhwBna && this.gEmmrt == c19983gWo.gEmmrt && this.copydefault == c19983gWo.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.AYXKKw.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Long.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiStrategyData(id=" + this.AYXKKw + ", icon=" + this.djBIcL + ", chainId=" + this.AEQbTJ + ", chainIcon=" + this.EZpvd + ", title=" + this.fetchVPNInfo + ", fromAddress=" + this.KWHzl + ", fromName=" + this.valueOf + ", cells=" + this.OLrzqt + ", isActive=" + this.AhwBna + ", isHistory=" + this.gEmmrt + ", expireTime=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    public C19983gWo(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.util.List<C19981gWm> list, boolean z, boolean z2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw = str;
        this.djBIcL = str2;
        this.AEQbTJ = str3;
        this.EZpvd = str4;
        this.fetchVPNInfo = str5;
        this.KWHzl = str6;
        this.valueOf = str7;
        this.OLrzqt = list;
        this.AhwBna = z;
        this.gEmmrt = z2;
        this.copydefault = j;
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }
}
