package o;

import com.okinc.uilib.hyperlink.state.HyperlinkFontWeight;
import com.okinc.uilib.hyperlink.state.HyperlinkSize;
import com.okinc.uilib.hyperlink.state.HyperlinkStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55356xiR {
    public final HyperlinkStyle AEQbTJ;
    public final java.lang.CharSequence AYXKKw;
    public final boolean AhwBna;
    public final boolean EZpvd;
    public final HyperlinkFontWeight KWHzl;
    public final HyperlinkSize OLrzqt;
    public final boolean copydefault;
    public final java.lang.Integer djBIcL;
    public final java.lang.Integer gEmmrt;
    public final java.lang.Integer valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55356xiR() {
        this(null, null, null, null, null, false, false, false, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55356xiR AEQbTJ(java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.Integer num2, HyperlinkFontWeight hyperlinkFontWeight, java.lang.Integer num3, boolean z, boolean z2, boolean z3, @NotNull HyperlinkStyle hyperlinkStyle, @NotNull HyperlinkSize hyperlinkSize) {
        Intrinsics.checkNotNullParameter(hyperlinkStyle, "");
        Intrinsics.checkNotNullParameter(hyperlinkSize, "");
        return new C55356xiR(charSequence, num, num2, hyperlinkFontWeight, num3, z, z2, z3, hyperlinkStyle, hyperlinkSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HyperlinkStyle OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HyperlinkFontWeight copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55356xiR)) {
            return false;
        }
        C55356xiR c55356xiR = (C55356xiR) obj;
        return Intrinsics.EZpvd(this.AYXKKw, c55356xiR.AYXKKw) && Intrinsics.EZpvd(this.valueOf, c55356xiR.valueOf) && Intrinsics.EZpvd(this.gEmmrt, c55356xiR.gEmmrt) && this.KWHzl == c55356xiR.KWHzl && Intrinsics.EZpvd(this.djBIcL, c55356xiR.djBIcL) && this.EZpvd == c55356xiR.EZpvd && this.copydefault == c55356xiR.copydefault && this.AhwBna == c55356xiR.AhwBna && this.AEQbTJ == c55356xiR.AEQbTJ && this.OLrzqt == c55356xiR.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.CharSequence charSequence = this.AYXKKw;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        java.lang.Integer num = this.valueOf;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.gEmmrt;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        HyperlinkFontWeight hyperlinkFontWeight = this.KWHzl;
        int iHashCode4 = hyperlinkFontWeight == null ? 0 : hyperlinkFontWeight.hashCode();
        java.lang.Integer num3 = this.djBIcL;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num3 != null ? num3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.CharSequence charSequence = this.AYXKKw;
        return "HyperlinkState(text=" + ((java.lang.Object) charSequence) + ", textColor=" + this.valueOf + ", textSizePx=" + this.gEmmrt + ", fontWeight=" + this.KWHzl + ", lineHeightPx=" + this.djBIcL + ", isEnabled=" + this.EZpvd + ", isShowLinkIcon=" + this.copydefault + ", isShowUnderline=" + this.AhwBna + ", hyperlinkStyle=" + this.AEQbTJ + ", hyperlinkSize=" + this.OLrzqt + ")";
    }

    public C55356xiR(java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.Integer num2, HyperlinkFontWeight hyperlinkFontWeight, java.lang.Integer num3, boolean z, boolean z2, boolean z3, @NotNull HyperlinkStyle hyperlinkStyle, @NotNull HyperlinkSize hyperlinkSize) {
        Intrinsics.checkNotNullParameter(hyperlinkStyle, "");
        Intrinsics.checkNotNullParameter(hyperlinkSize, "");
        this.AYXKKw = charSequence;
        this.valueOf = num;
        this.gEmmrt = num2;
        this.KWHzl = hyperlinkFontWeight;
        this.djBIcL = num3;
        this.EZpvd = z;
        this.copydefault = z2;
        this.AhwBna = z3;
        this.AEQbTJ = hyperlinkStyle;
        this.OLrzqt = hyperlinkSize;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.CharSequence))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:com.okinc.uilib.hyperlink.state.HyperlinkFontWeight:?: TERNARY null = ((wrap:int:0x0019: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.uilib.hyperlink.state.HyperlinkFontWeight) : (r14v0 com.okinc.uilib.hyperlink.state.HyperlinkFontWeight))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0020: ARITH (r21v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r21v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 boolean) : true)
  (wrap:com.okinc.uilib.hyperlink.state.HyperlinkStyle:?: TERNARY null = ((wrap:int:0x003e: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0042: SGET  A[WRAPPED] (LINE:15) com.okinc.uilib.hyperlink.state.HyperlinkStyle.PRIMARY com.okinc.uilib.hyperlink.state.HyperlinkStyle) : (r19v0 com.okinc.uilib.hyperlink.state.HyperlinkStyle))
  (wrap:com.okinc.uilib.hyperlink.state.HyperlinkSize:?: TERNARY null = ((wrap:int:0x0047: ARITH (r21v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004b: SGET  A[WRAPPED] (LINE:16) com.okinc.uilib.hyperlink.state.HyperlinkSize.MEDIUM com.okinc.uilib.hyperlink.state.HyperlinkSize) : (r20v0 com.okinc.uilib.hyperlink.state.HyperlinkSize))
 A[MD:(java.lang.CharSequence, java.lang.Integer, java.lang.Integer, com.okinc.uilib.hyperlink.state.HyperlinkFontWeight, java.lang.Integer, boolean, boolean, boolean, com.okinc.uilib.hyperlink.state.HyperlinkStyle, com.okinc.uilib.hyperlink.state.HyperlinkSize):void (m)] (LINE:6) call: o.xiR.<init>(java.lang.CharSequence, java.lang.Integer, java.lang.Integer, com.okinc.uilib.hyperlink.state.HyperlinkFontWeight, java.lang.Integer, boolean, boolean, boolean, com.okinc.uilib.hyperlink.state.HyperlinkStyle, com.okinc.uilib.hyperlink.state.HyperlinkSize):void type: THIS */
    public /* synthetic */ C55356xiR(java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.Integer num2, HyperlinkFontWeight hyperlinkFontWeight, java.lang.Integer num3, boolean z, boolean z2, boolean z3, HyperlinkStyle hyperlinkStyle, HyperlinkSize hyperlinkSize, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : charSequence, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : hyperlinkFontWeight, (i & 16) == 0 ? num3 : null, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2, (i & 128) == 0 ? z3 : true, (i & 256) != 0 ? HyperlinkStyle.PRIMARY : hyperlinkStyle, (i & 512) != 0 ? HyperlinkSize.MEDIUM : hyperlinkSize);
    }
}
