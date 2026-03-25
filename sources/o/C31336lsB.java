package o;

import com.okinc.business.web3pay.lib.core.model.ConvertOrderType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31336lsB {
    public final java.lang.String AEQbTJ;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final ConvertOrderType OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31336lsB copy$default(C31336lsB c31336lsB, java.lang.String str, java.lang.String str2, int i, ConvertOrderType convertOrderType, java.lang.String str3, java.lang.String str4, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c31336lsB.djBIcL;
        }
        if ((i2 & 2) != 0) {
            str2 = c31336lsB.copydefault;
        }
        java.lang.String str5 = str2;
        if ((i2 & 4) != 0) {
            i = c31336lsB.EZpvd;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            convertOrderType = c31336lsB.OLrzqt;
        }
        ConvertOrderType convertOrderType2 = convertOrderType;
        if ((i2 & 16) != 0) {
            str3 = c31336lsB.AEQbTJ;
        }
        java.lang.String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = c31336lsB.KWHzl;
        }
        return c31336lsB.KWHzl(str, str5, i3, convertOrderType2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31336lsB KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, ConvertOrderType convertOrderType, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C31336lsB(str, str2, i, convertOrderType, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31336lsB)) {
            return false;
        }
        C31336lsB c31336lsB = (C31336lsB) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c31336lsB.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31336lsB.copydefault) && this.EZpvd == c31336lsB.EZpvd && this.OLrzqt == c31336lsB.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31336lsB.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c31336lsB.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = java.lang.Integer.hashCode(this.EZpvd);
        ConvertOrderType convertOrderType = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (convertOrderType == null ? 0 : convertOrderType.hashCode())) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConvertInfo(tokenSymbol=" + this.djBIcL + ", tokenAmount=" + this.copydefault + ", tokenDecimal=" + this.EZpvd + ", convertOrderType=" + this.OLrzqt + ", tokenCoinTypeNo=" + this.AEQbTJ + ", currencyAmount=" + this.KWHzl + ")";
    }

    public C31336lsB(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, ConvertOrderType convertOrderType, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.djBIcL = str;
        this.copydefault = str2;
        this.EZpvd = i;
        this.OLrzqt = convertOrderType;
        this.AEQbTJ = str3;
        this.KWHzl = str4;
    }
}
