package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class zLS {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public AbstractC4401Bcs AhwBna;
    public java.lang.String EZpvd;
    public java.util.List<zJI> KWHzl;
    public int OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.zLS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zLS copy$default(zLS zls, java.lang.String str, int i, java.util.List list, java.lang.String str2, java.lang.String str3, AbstractC4401Bcs abstractC4401Bcs, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = zls.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            i = zls.OLrzqt;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = zls.KWHzl;
        }
        java.util.List list2 = list;
        if ((i2 & 8) != 0) {
            str2 = zls.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i2 & 16) != 0) {
            str3 = zls.copydefault;
        }
        java.lang.String str5 = str3;
        if ((i2 & 32) != 0) {
            abstractC4401Bcs = zls.AhwBna;
        }
        return zls.copydefault(str, i3, list2, str4, str5, abstractC4401Bcs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<zJI> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zLS copydefault(@NotNull java.lang.String str, int i, @NotNull java.util.List<zJI> list, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull AbstractC4401Bcs abstractC4401Bcs) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(abstractC4401Bcs, "");
        return new zLS(str, i, list, str2, str3, abstractC4401Bcs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zLS)) {
            return false;
        }
        zLS zls = (zLS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) zls.AEQbTJ) && this.OLrzqt == zls.OLrzqt && Intrinsics.EZpvd(this.KWHzl, zls.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) zls.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) zls.copydefault) && Intrinsics.EZpvd(this.AhwBna, zls.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC4401Bcs gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NewDeviceJourneyInput(applyId=" + this.AEQbTJ + ", behavior=" + this.OLrzqt + ", authInfos=" + this.KWHzl + ", maskedEmail=" + this.EZpvd + ", maskedPhone=" + this.copydefault + ", subdomainStrategy=" + this.AhwBna + ")";
    }

    public zLS(@NotNull java.lang.String str, int i, @NotNull java.util.List<zJI> list, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull AbstractC4401Bcs abstractC4401Bcs) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(abstractC4401Bcs, "");
        this.AEQbTJ = str;
        this.OLrzqt = i;
        this.KWHzl = list;
        this.EZpvd = str2;
        this.copydefault = str3;
        this.AhwBna = abstractC4401Bcs;
    }
}
