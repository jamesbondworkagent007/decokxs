package o;

import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lcd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30516lcd {
    public final InterfaceC30395laO AEQbTJ;
    public final ConfirmOrderTag AYXKKw;
    public final java.lang.CharSequence AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final InterfaceC30395laO valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C30516lcd() {
        this(null, null, null, null, null, false, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC30395laO EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConfirmOrderTag OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30516lcd OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, ConfirmOrderTag confirmOrderTag, InterfaceC30395laO interfaceC30395laO, java.lang.String str2, boolean z, java.lang.String str3, InterfaceC30395laO interfaceC30395laO2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        return new C30516lcd(str, charSequence, confirmOrderTag, interfaceC30395laO, str2, z, str3, interfaceC30395laO2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC30395laO djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30516lcd)) {
            return false;
        }
        C30516lcd c30516lcd = (C30516lcd) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c30516lcd.EZpvd) && Intrinsics.EZpvd(this.AhwBna, c30516lcd.AhwBna) && this.AYXKKw == c30516lcd.AYXKKw && Intrinsics.EZpvd(this.valueOf, c30516lcd.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c30516lcd.OLrzqt) && this.copydefault == c30516lcd.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c30516lcd.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c30516lcd.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AhwBna.hashCode();
        ConfirmOrderTag confirmOrderTag = this.AYXKKw;
        int iHashCode3 = confirmOrderTag == null ? 0 : confirmOrderTag.hashCode();
        InterfaceC30395laO interfaceC30395laO = this.valueOf;
        int iHashCode4 = interfaceC30395laO == null ? 0 : interfaceC30395laO.hashCode();
        java.lang.String str = this.OLrzqt;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str2 = this.KWHzl;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        InterfaceC30395laO interfaceC30395laO2 = this.AEQbTJ;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (interfaceC30395laO2 != null ? interfaceC30395laO2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.EZpvd;
        java.lang.CharSequence charSequence = this.AhwBna;
        return "UIConfirmOrderItem(label=" + str + ", value=" + ((java.lang.Object) charSequence) + ", tag=" + this.AYXKKw + ", tipContent=" + this.valueOf + ", logoUrl=" + this.OLrzqt + ", isPmm=" + this.copydefault + ", boostWeight=" + this.KWHzl + ", boostTagAction=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence valueOf() {
        return this.AhwBna;
    }

    public C30516lcd(@NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, ConfirmOrderTag confirmOrderTag, InterfaceC30395laO interfaceC30395laO, java.lang.String str2, boolean z, java.lang.String str3, InterfaceC30395laO interfaceC30395laO2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.EZpvd = str;
        this.AhwBna = charSequence;
        this.AYXKKw = confirmOrderTag;
        this.valueOf = interfaceC30395laO;
        this.OLrzqt = str2;
        this.copydefault = z;
        this.KWHzl = str3;
        this.AEQbTJ = interfaceC30395laO2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.CharSequence) : (""))
  (wrap:com.okinc.business.trade.features.home.ui.ConfirmOrderTag:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.trade.features.home.ui.ConfirmOrderTag) : (r12v0 com.okinc.business.trade.features.home.ui.ConfirmOrderTag))
  (wrap:o.laO:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.laO) : (r13v0 o.laO))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:o.laO:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 o.laO) : (null o.laO))
 A[MD:(java.lang.String, java.lang.CharSequence, com.okinc.business.trade.features.home.ui.ConfirmOrderTag, o.laO, java.lang.String, boolean, java.lang.String, o.laO):void (m)] (LINE:106) call: o.lcd.<init>(java.lang.String, java.lang.CharSequence, com.okinc.business.trade.features.home.ui.ConfirmOrderTag, o.laO, java.lang.String, boolean, java.lang.String, o.laO):void type: THIS */
    public /* synthetic */ C30516lcd(java.lang.String str, java.lang.CharSequence charSequence, ConfirmOrderTag confirmOrderTag, InterfaceC30395laO interfaceC30395laO, java.lang.String str2, boolean z, java.lang.String str3, InterfaceC30395laO interfaceC30395laO2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? charSequence : "", (i & 4) != 0 ? null : confirmOrderTag, (i & 8) != 0 ? null : interfaceC30395laO, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str3, (i & 128) == 0 ? interfaceC30395laO2 : null);
    }
}
