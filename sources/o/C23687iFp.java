package o;

import com.okinc.business.invest_biz.data.contants.RateType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23687iFp {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final C23687iFp OLrzqt = new C23687iFp(false, null, null, 0, null, 31, null);
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final RateType KWHzl;
    public final java.lang.String copydefault;
    public final int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23687iFp() {
        this(false, null, null, 0, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23687iFp copy$default(C23687iFp c23687iFp, boolean z, java.lang.String str, RateType rateType, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = c23687iFp.EZpvd;
        }
        if ((i2 & 2) != 0) {
            str = c23687iFp.AEQbTJ;
        }
        java.lang.String str3 = str;
        if ((i2 & 4) != 0) {
            rateType = c23687iFp.KWHzl;
        }
        RateType rateType2 = rateType;
        if ((i2 & 8) != 0) {
            i = c23687iFp.gEmmrt;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = c23687iFp.copydefault;
        }
        return c23687iFp.KWHzl(z, str3, rateType2, i3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateType KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23687iFp KWHzl(boolean z, @NotNull java.lang.String str, @NotNull RateType rateType, int i, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rateType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C23687iFp(z, str, rateType, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23687iFp)) {
            return false;
        }
        C23687iFp c23687iFp = (C23687iFp) obj;
        return this.EZpvd == c23687iFp.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c23687iFp.AEQbTJ) && this.KWHzl == c23687iFp.KWHzl && this.gEmmrt == c23687iFp.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c23687iFp.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Integer.hashCode(this.gEmmrt)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProductRiskInfo(hasLossRisk=" + this.EZpvd + ", lossRate=" + this.AEQbTJ + ", lossType=" + this.KWHzl + ", ratingTypeId=" + this.gEmmrt + ", ratingName=" + this.copydefault + ")";
    }

    public C23687iFp(boolean z, @NotNull java.lang.String str, @NotNull RateType rateType, int i, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rateType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = z;
        this.AEQbTJ = str;
        this.KWHzl = rateType;
        this.gEmmrt = i;
        this.copydefault = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.contants.RateType:0x0017: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.contants.RateType:0x0015: SGET  A[WRAPPED] (LINE:109) com.okinc.business.invest_biz.data.contants.RateType.Unknown com.okinc.business.invest_biz.data.contants.RateType) : (r7v0 com.okinc.business.invest_biz.data.contants.RateType))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(boolean, java.lang.String, com.okinc.business.invest_biz.data.contants.RateType, int, java.lang.String):void (m)] (LINE:106) call: o.iFp.<init>(boolean, java.lang.String, com.okinc.business.invest_biz.data.contants.RateType, int, java.lang.String):void type: THIS */
    public /* synthetic */ C23687iFp(boolean z, java.lang.String str, RateType rateType, int i, java.lang.String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? RateType.Unknown : rateType, (i2 & 8) == 0 ? i : 0, (i2 & 16) != 0 ? "" : str2);
    }

    /* JADX INFO: renamed from: o.iFp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iFp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C23687iFp copydefault() {
            return C23687iFp.OLrzqt;
        }
    }
}
