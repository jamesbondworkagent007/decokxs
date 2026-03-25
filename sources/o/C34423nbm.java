package o;

import com.okinc.dexkline.market.features.overview.ui.widget.CoinInfoGridCellId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC34635nfn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nbm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34423nbm implements InterfaceC34635nfn {
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.Integer AhwBna;
    public final java.lang.String EZpvd;
    public final CoinInfoGridCellId KWHzl;
    public final InterfaceC34425nbo OLrzqt;
    public final android.text.SpannedString copydefault;
    public final java.lang.Integer djBIcL;
    public final InterfaceC34425nbo valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC34425nbo AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC34425nbo EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfoGridCellId KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.SpannedString OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34423nbm OLrzqt(@NotNull CoinInfoGridCellId coinInfoGridCellId, @NotNull java.lang.String str, @NotNull android.text.SpannedString spannedString, @NotNull java.lang.String str2, @androidx.annotation.ColorInt java.lang.Integer num, @androidx.annotation.DrawableRes java.lang.Integer num2, @androidx.annotation.DrawableRes java.lang.Integer num3, InterfaceC34425nbo interfaceC34425nbo, InterfaceC34425nbo interfaceC34425nbo2) {
        Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C34423nbm(coinInfoGridCellId, str, spannedString, str2, num, num2, num3, interfaceC34425nbo, interfaceC34425nbo2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34423nbm)) {
            return false;
        }
        C34423nbm c34423nbm = (C34423nbm) obj;
        return this.KWHzl == c34423nbm.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c34423nbm.EZpvd) && Intrinsics.EZpvd(this.copydefault, c34423nbm.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c34423nbm.AYXKKw) && Intrinsics.EZpvd(this.AEQbTJ, c34423nbm.AEQbTJ) && Intrinsics.EZpvd(this.djBIcL, c34423nbm.djBIcL) && Intrinsics.EZpvd(this.AhwBna, c34423nbm.AhwBna) && Intrinsics.EZpvd(this.valueOf, c34423nbm.valueOf) && Intrinsics.EZpvd(this.OLrzqt, c34423nbm.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        java.lang.Integer num = this.AEQbTJ;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.djBIcL;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        java.lang.Integer num3 = this.AhwBna;
        int iHashCode7 = num3 == null ? 0 : num3.hashCode();
        InterfaceC34425nbo interfaceC34425nbo = this.valueOf;
        int iHashCode8 = interfaceC34425nbo == null ? 0 : interfaceC34425nbo.hashCode();
        InterfaceC34425nbo interfaceC34425nbo2 = this.OLrzqt;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (interfaceC34425nbo2 != null ? interfaceC34425nbo2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        CoinInfoGridCellId coinInfoGridCellId = this.KWHzl;
        java.lang.String str = this.EZpvd;
        android.text.SpannedString spannedString = this.copydefault;
        return "CoinInfoGridCell(cellId=" + coinInfoGridCellId + ", label=" + str + ", content=" + ((java.lang.Object) spannedString) + ", leadingIconUrl=" + this.AYXKKw + ", iconTint=" + this.AEQbTJ + ", leadingIconRes=" + this.djBIcL + ", trailingIconRes=" + this.AhwBna + ", labelAction=" + this.valueOf + ", contentAction=" + this.OLrzqt + ")";
    }

    public C34423nbm(@NotNull CoinInfoGridCellId coinInfoGridCellId, @NotNull java.lang.String str, @NotNull android.text.SpannedString spannedString, @NotNull java.lang.String str2, @androidx.annotation.ColorInt java.lang.Integer num, @androidx.annotation.DrawableRes java.lang.Integer num2, @androidx.annotation.DrawableRes java.lang.Integer num3, InterfaceC34425nbo interfaceC34425nbo, InterfaceC34425nbo interfaceC34425nbo2) {
        Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = coinInfoGridCellId;
        this.EZpvd = str;
        this.copydefault = spannedString;
        this.AYXKKw = str2;
        this.AEQbTJ = num;
        this.djBIcL = num2;
        this.AhwBna = num3;
        this.valueOf = interfaceC34425nbo;
        this.OLrzqt = interfaceC34425nbo2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (r13v0 com.okinc.dexkline.market.features.overview.ui.widget.CoinInfoGridCellId)
  (r14v0 java.lang.String)
  (r15v0 android.text.SpannedString)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000c: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0015: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:o.nbo:?: TERNARY null = ((wrap:int:0x0025: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null o.nbo) : (r20v0 o.nbo))
  (wrap:o.nbo:?: TERNARY null = ((wrap:int:0x002d: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null o.nbo) : (r21v0 o.nbo))
 A[MD:(com.okinc.dexkline.market.features.overview.ui.widget.CoinInfoGridCellId, java.lang.String, android.text.SpannedString, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, o.nbo, o.nbo):void (m)] (LINE:450) call: o.nbm.<init>(com.okinc.dexkline.market.features.overview.ui.widget.CoinInfoGridCellId, java.lang.String, android.text.SpannedString, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, o.nbo, o.nbo):void type: THIS */
    public /* synthetic */ C34423nbm(CoinInfoGridCellId coinInfoGridCellId, java.lang.String str, android.text.SpannedString spannedString, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, InterfaceC34425nbo interfaceC34425nbo, InterfaceC34425nbo interfaceC34425nbo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coinInfoGridCellId, str, spannedString, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : interfaceC34425nbo, (i & 256) != 0 ? null : interfaceC34425nbo2);
    }

    @Override // o.InterfaceC34635nfn
    public boolean KWHzl(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.KWHzl(this, interfaceC34635nfn);
    }

    @Override // o.InterfaceC34635nfn
    public java.lang.Object copydefault(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.AEQbTJ(this, interfaceC34635nfn);
    }

    @Override // o.InterfaceC34635nfn
    public boolean AEQbTJ(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        Intrinsics.checkNotNullParameter(interfaceC34635nfn, "");
        C34423nbm c34423nbm = interfaceC34635nfn instanceof C34423nbm ? (C34423nbm) interfaceC34635nfn : null;
        return c34423nbm != null && this.KWHzl == c34423nbm.KWHzl;
    }
}
