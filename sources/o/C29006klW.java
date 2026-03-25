package o;

import com.okinc.business.market.features.overview.ui.widget.CoinInfoGridCellId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29006klW implements kMU {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final android.text.SpannedString EZpvd;
    public final java.lang.Integer KWHzl;
    public final CoinInfoGridCellId OLrzqt;
    public final InterfaceC29065kmc copydefault;
    public final java.lang.Integer gEmmrt;
    public final java.lang.Integer valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC29065kmc AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfoGridCellId OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.SpannedString copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29006klW copydefault(@NotNull CoinInfoGridCellId coinInfoGridCellId, @NotNull java.lang.String str, @NotNull android.text.SpannedString spannedString, @NotNull java.lang.String str2, @androidx.annotation.ColorInt java.lang.Integer num, @androidx.annotation.DrawableRes java.lang.Integer num2, @androidx.annotation.DrawableRes java.lang.Integer num3, InterfaceC29065kmc interfaceC29065kmc) {
        Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C29006klW(coinInfoGridCellId, str, spannedString, str2, num, num2, num3, interfaceC29065kmc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29006klW)) {
            return false;
        }
        C29006klW c29006klW = (C29006klW) obj;
        return this.OLrzqt == c29006klW.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c29006klW.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c29006klW.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c29006klW.AhwBna) && Intrinsics.EZpvd(this.KWHzl, c29006klW.KWHzl) && Intrinsics.EZpvd(this.valueOf, c29006klW.valueOf) && Intrinsics.EZpvd(this.gEmmrt, c29006klW.gEmmrt) && Intrinsics.EZpvd(this.copydefault, c29006klW.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = this.AhwBna.hashCode();
        java.lang.Integer num = this.KWHzl;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.valueOf;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        java.lang.Integer num3 = this.gEmmrt;
        int iHashCode7 = num3 == null ? 0 : num3.hashCode();
        InterfaceC29065kmc interfaceC29065kmc = this.copydefault;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (interfaceC29065kmc != null ? interfaceC29065kmc.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        CoinInfoGridCellId coinInfoGridCellId = this.OLrzqt;
        java.lang.String str = this.AEQbTJ;
        android.text.SpannedString spannedString = this.EZpvd;
        return "CoinInfoGridCell(cellId=" + coinInfoGridCellId + ", label=" + str + ", content=" + ((java.lang.Object) spannedString) + ", leadingIconUrl=" + this.AhwBna + ", iconTint=" + this.KWHzl + ", leadingIconRes=" + this.valueOf + ", trailingIconRes=" + this.gEmmrt + ", contentAction=" + this.copydefault + ")";
    }

    public C29006klW(@NotNull CoinInfoGridCellId coinInfoGridCellId, @NotNull java.lang.String str, @NotNull android.text.SpannedString spannedString, @NotNull java.lang.String str2, @androidx.annotation.ColorInt java.lang.Integer num, @androidx.annotation.DrawableRes java.lang.Integer num2, @androidx.annotation.DrawableRes java.lang.Integer num3, InterfaceC29065kmc interfaceC29065kmc) {
        Intrinsics.checkNotNullParameter(coinInfoGridCellId, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = coinInfoGridCellId;
        this.AEQbTJ = str;
        this.EZpvd = spannedString;
        this.AhwBna = str2;
        this.KWHzl = num;
        this.valueOf = num2;
        this.gEmmrt = num3;
        this.copydefault = interfaceC29065kmc;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (r12v0 com.okinc.business.market.features.overview.ui.widget.CoinInfoGridCellId)
  (r13v0 java.lang.String)
  (r14v0 android.text.SpannedString)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0014: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001c: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:o.kmc:?: TERNARY null = ((wrap:int:0x0024: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null o.kmc) : (r19v0 o.kmc))
 A[MD:(com.okinc.business.market.features.overview.ui.widget.CoinInfoGridCellId, java.lang.String, android.text.SpannedString, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, o.kmc):void (m)] (LINE:383) call: o.klW.<init>(com.okinc.business.market.features.overview.ui.widget.CoinInfoGridCellId, java.lang.String, android.text.SpannedString, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, o.kmc):void type: THIS */
    public /* synthetic */ C29006klW(CoinInfoGridCellId coinInfoGridCellId, java.lang.String str, android.text.SpannedString spannedString, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, InterfaceC29065kmc interfaceC29065kmc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coinInfoGridCellId, str, spannedString, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : interfaceC29065kmc);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        C29006klW c29006klW = kmu instanceof C29006klW ? (C29006klW) kmu : null;
        return c29006klW != null && this.OLrzqt == c29006klW.OLrzqt;
    }
}
