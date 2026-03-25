package o;

import com.okinc.market.ext.UpDownColor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41461qrJ {
    public final kotlin.Pair<java.lang.CharSequence, java.lang.Boolean> AEQbTJ;
    public final java.lang.CharSequence AhwBna;
    public final java.lang.CharSequence EZpvd;
    public final java.lang.CharSequence KWHzl;
    public final java.lang.CharSequence OLrzqt;
    public final java.lang.CharSequence copydefault;
    public final UpDownColor valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.qrJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41461qrJ copy$default(C41461qrJ c41461qrJ, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, UpDownColor upDownColor, java.lang.CharSequence charSequence3, kotlin.Pair pair, java.lang.CharSequence charSequence4, java.lang.CharSequence charSequence5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charSequence = c41461qrJ.EZpvd;
        }
        if ((i & 2) != 0) {
            charSequence2 = c41461qrJ.OLrzqt;
        }
        java.lang.CharSequence charSequence6 = charSequence2;
        if ((i & 4) != 0) {
            upDownColor = c41461qrJ.valueOf;
        }
        UpDownColor upDownColor2 = upDownColor;
        if ((i & 8) != 0) {
            charSequence3 = c41461qrJ.KWHzl;
        }
        java.lang.CharSequence charSequence7 = charSequence3;
        if ((i & 16) != 0) {
            pair = c41461qrJ.AEQbTJ;
        }
        kotlin.Pair pair2 = pair;
        if ((i & 32) != 0) {
            charSequence4 = c41461qrJ.AhwBna;
        }
        java.lang.CharSequence charSequence8 = charSequence4;
        if ((i & 64) != 0) {
            charSequence5 = c41461qrJ.copydefault;
        }
        return c41461qrJ.OLrzqt(charSequence, charSequence6, upDownColor2, charSequence7, pair2, charSequence8, charSequence5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.lang.CharSequence, java.lang.Boolean> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpDownColor OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41461qrJ OLrzqt(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, UpDownColor upDownColor, java.lang.CharSequence charSequence3, @NotNull kotlin.Pair<? extends java.lang.CharSequence, java.lang.Boolean> pair, java.lang.CharSequence charSequence4, java.lang.CharSequence charSequence5) {
        Intrinsics.checkNotNullParameter(pair, "");
        return new C41461qrJ(charSequence, charSequence2, upDownColor, charSequence3, pair, charSequence4, charSequence5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41461qrJ)) {
            return false;
        }
        C41461qrJ c41461qrJ = (C41461qrJ) obj;
        return Intrinsics.EZpvd(this.EZpvd, c41461qrJ.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c41461qrJ.OLrzqt) && this.valueOf == c41461qrJ.valueOf && Intrinsics.EZpvd(this.KWHzl, c41461qrJ.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c41461qrJ.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, c41461qrJ.AhwBna) && Intrinsics.EZpvd(this.copydefault, c41461qrJ.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.CharSequence charSequence = this.EZpvd;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        java.lang.CharSequence charSequence2 = this.OLrzqt;
        int iHashCode2 = charSequence2 == null ? 0 : charSequence2.hashCode();
        UpDownColor upDownColor = this.valueOf;
        int iHashCode3 = upDownColor == null ? 0 : upDownColor.hashCode();
        java.lang.CharSequence charSequence3 = this.KWHzl;
        int iHashCode4 = charSequence3 == null ? 0 : charSequence3.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        java.lang.CharSequence charSequence4 = this.AhwBna;
        int iHashCode6 = charSequence4 == null ? 0 : charSequence4.hashCode();
        java.lang.CharSequence charSequence5 = this.copydefault;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (charSequence5 != null ? charSequence5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.CharSequence charSequence = this.EZpvd;
        java.lang.CharSequence charSequence2 = this.OLrzqt;
        UpDownColor upDownColor = this.valueOf;
        java.lang.CharSequence charSequence3 = this.KWHzl;
        return "FormatFuturesVoFieldsResult(formatedName=" + ((java.lang.Object) charSequence) + ", formatedRatio=" + ((java.lang.Object) charSequence2) + ", ratioUpDownColor=" + upDownColor + ", formatedPrice=" + ((java.lang.Object) charSequence3) + ", formatedSubPriceAndIsShow=" + this.AEQbTJ + ", formatedVolume=" + ((java.lang.Object) this.AhwBna) + ", formatedTurnover=" + ((java.lang.Object) this.copydefault) + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.Pair<? extends java.lang.CharSequence, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41461qrJ(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, UpDownColor upDownColor, java.lang.CharSequence charSequence3, @NotNull kotlin.Pair<? extends java.lang.CharSequence, java.lang.Boolean> pair, java.lang.CharSequence charSequence4, java.lang.CharSequence charSequence5) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.EZpvd = charSequence;
        this.OLrzqt = charSequence2;
        this.valueOf = upDownColor;
        this.KWHzl = charSequence3;
        this.AEQbTJ = pair;
        this.AhwBna = charSequence4;
        this.copydefault = charSequence5;
    }
}
