package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.contants.ApyType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27468jvk implements InterfaceC27461jvd {
    public final java.lang.String AEQbTJ;
    public ApyType AYXKKw;
    public final java.lang.String EZpvd;
    public boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final InvestTipInfoVo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27468jvk() {
        this(null, null, null, null, false, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27468jvk copy$default(C27468jvk c27468jvk, java.lang.String str, ApyType apyType, java.lang.String str2, java.lang.String str3, boolean z, InvestTipInfoVo investTipInfoVo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c27468jvk.EZpvd;
        }
        if ((i & 2) != 0) {
            apyType = c27468jvk.AYXKKw;
        }
        ApyType apyType2 = apyType;
        if ((i & 4) != 0) {
            str2 = c27468jvk.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = c27468jvk.AEQbTJ;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            z = c27468jvk.KWHzl;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            investTipInfoVo = c27468jvk.copydefault;
        }
        return c27468jvk.OLrzqt(str, apyType2, str4, str5, z2, investTipInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27461jvd
    public void AEQbTJ(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27461jvd
    public ApyType EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27468jvk OLrzqt(@NotNull java.lang.String str, ApyType apyType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C27468jvk(str, apyType, str2, str3, z, investTipInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27468jvk)) {
            return false;
        }
        C27468jvk c27468jvk = (C27468jvk) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c27468jvk.EZpvd) && this.AYXKKw == c27468jvk.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c27468jvk.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27468jvk.AEQbTJ) && this.KWHzl == c27468jvk.KWHzl && Intrinsics.EZpvd(this.copydefault, c27468jvk.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        ApyType apyType = this.AYXKKw;
        int iHashCode2 = apyType == null ? 0 : apyType.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.KWHzl);
        InvestTipInfoVo investTipInfoVo = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (investTipInfoVo != null ? investTipInfoVo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiBonusSubInfo(logo=" + this.EZpvd + ", type=" + this.AYXKKw + ", title=" + this.OLrzqt + ", rate=" + this.AEQbTJ + ", selected=" + this.KWHzl + ", tipInfo=" + this.copydefault + ")";
    }

    public C27468jvk(@NotNull java.lang.String str, ApyType apyType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd = str;
        this.AYXKKw = apyType;
        this.OLrzqt = str2;
        this.AEQbTJ = str3;
        this.KWHzl = z;
        this.copydefault = investTipInfoVo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.contants.ApyType:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.contants.ApyType) : (r7v0 com.okinc.business.invest_biz.data.contants.ApyType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r12v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:boolean:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r11v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(java.lang.String, com.okinc.business.invest_biz.data.contants.ApyType, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:15) call: o.jvk.<init>(java.lang.String, com.okinc.business.invest_biz.data.contants.ApyType, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ C27468jvk(java.lang.String str, ApyType apyType, java.lang.String str2, java.lang.String str3, boolean z, InvestTipInfoVo investTipInfoVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : apyType, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : investTipInfoVo);
    }
}
