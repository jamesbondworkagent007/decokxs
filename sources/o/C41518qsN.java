package o;

import com.okinc.market.ext.UpDownColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.qsN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41518qsN {
    public final java.lang.CharSequence AEQbTJ;
    public final java.lang.CharSequence EZpvd;
    public final java.lang.CharSequence KWHzl;
    public final java.lang.CharSequence OLrzqt;
    public final java.lang.CharSequence copydefault;
    public final UpDownColor djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41518qsN copy$default(C41518qsN c41518qsN, java.lang.CharSequence charSequence, UpDownColor upDownColor, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, java.lang.CharSequence charSequence5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charSequence = c41518qsN.KWHzl;
        }
        if ((i & 2) != 0) {
            upDownColor = c41518qsN.djBIcL;
        }
        UpDownColor upDownColor2 = upDownColor;
        if ((i & 4) != 0) {
            charSequence2 = c41518qsN.AEQbTJ;
        }
        java.lang.CharSequence charSequence6 = charSequence2;
        if ((i & 8) != 0) {
            charSequence3 = c41518qsN.OLrzqt;
        }
        java.lang.CharSequence charSequence7 = charSequence3;
        if ((i & 16) != 0) {
            charSequence4 = c41518qsN.EZpvd;
        }
        java.lang.CharSequence charSequence8 = charSequence4;
        if ((i & 32) != 0) {
            charSequence5 = c41518qsN.copydefault;
        }
        return c41518qsN.EZpvd(charSequence, upDownColor2, charSequence6, charSequence7, charSequence8, charSequence5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpDownColor AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41518qsN EZpvd(java.lang.CharSequence charSequence, UpDownColor upDownColor, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, java.lang.CharSequence charSequence5) {
        return new C41518qsN(charSequence, upDownColor, charSequence2, charSequence3, charSequence4, charSequence5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41518qsN)) {
            return false;
        }
        C41518qsN c41518qsN = (C41518qsN) obj;
        return Intrinsics.EZpvd(this.KWHzl, c41518qsN.KWHzl) && this.djBIcL == c41518qsN.djBIcL && Intrinsics.EZpvd(this.AEQbTJ, c41518qsN.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c41518qsN.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c41518qsN.EZpvd) && Intrinsics.EZpvd(this.copydefault, c41518qsN.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.CharSequence charSequence = this.KWHzl;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        UpDownColor upDownColor = this.djBIcL;
        int iHashCode2 = upDownColor == null ? 0 : upDownColor.hashCode();
        java.lang.CharSequence charSequence2 = this.AEQbTJ;
        int iHashCode3 = charSequence2 == null ? 0 : charSequence2.hashCode();
        java.lang.CharSequence charSequence3 = this.OLrzqt;
        int iHashCode4 = charSequence3 == null ? 0 : charSequence3.hashCode();
        java.lang.CharSequence charSequence4 = this.EZpvd;
        int iHashCode5 = charSequence4 == null ? 0 : charSequence4.hashCode();
        java.lang.CharSequence charSequence5 = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (charSequence5 != null ? charSequence5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.CharSequence charSequence = this.KWHzl;
        return "FormatSpotVoFieldsResult(formatedRatio=" + ((java.lang.Object) charSequence) + ", ratioUpDownColor=" + this.djBIcL + ", formatedPrice=" + ((java.lang.Object) this.AEQbTJ) + ", formatedSubPrice=" + ((java.lang.Object) this.OLrzqt) + ", formatedVolume=" + ((java.lang.Object) this.EZpvd) + ", formatedTurnover=" + ((java.lang.Object) this.copydefault) + ")";
    }

    public C41518qsN(java.lang.CharSequence charSequence, UpDownColor upDownColor, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, java.lang.CharSequence charSequence5) {
        this.KWHzl = charSequence;
        this.djBIcL = upDownColor;
        this.AEQbTJ = charSequence2;
        this.OLrzqt = charSequence3;
        this.EZpvd = charSequence4;
        this.copydefault = charSequence5;
    }
}
