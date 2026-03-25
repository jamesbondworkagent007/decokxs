package o;

import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.liA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30805liA {
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final SlippageMode valueOf;

    /* JADX INFO: renamed from: o.liA$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SlippageMode.values().length];
            try {
                iArr[SlippageMode.Dynamic.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SlippageMode.Fixed.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C30805liA() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C30805liA copy$default(C30805liA c30805liA, boolean z, java.lang.String str, java.lang.String str2, SlippageMode slippageMode, java.lang.String str3, java.lang.String str4, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c30805liA.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c30805liA.OLrzqt;
        }
        java.lang.String str5 = str;
        if ((i & 4) != 0) {
            str2 = c30805liA.AYXKKw;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            slippageMode = c30805liA.valueOf;
        }
        SlippageMode slippageMode2 = slippageMode;
        if ((i & 16) != 0) {
            str3 = c30805liA.copydefault;
        }
        java.lang.String str7 = str3;
        if ((i & 32) != 0) {
            str4 = c30805liA.EZpvd;
        }
        java.lang.String str8 = str4;
        if ((i & 64) != 0) {
            num = c30805liA.AEQbTJ;
        }
        return c30805liA.AEQbTJ(z, str5, str6, slippageMode2, str7, str8, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30805liA AEQbTJ(boolean z, java.lang.String str, java.lang.String str2, SlippageMode slippageMode, java.lang.String str3, @NotNull java.lang.String str4, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new C30805liA(z, str, str2, slippageMode, str3, str4, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30805liA)) {
            return false;
        }
        C30805liA c30805liA = (C30805liA) obj;
        return this.KWHzl == c30805liA.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c30805liA.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c30805liA.AYXKKw) && this.valueOf == c30805liA.valueOf && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c30805liA.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c30805liA.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c30805liA.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AYXKKw;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        SlippageMode slippageMode = this.valueOf;
        int iHashCode4 = slippageMode == null ? 0 : slippageMode.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        int iHashCode6 = this.EZpvd.hashCode();
        java.lang.Integer num = this.AEQbTJ;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QuoteSetting(isOpenMev=" + this.KWHzl + ", maxSlippage=" + this.OLrzqt + ", slippageValue=" + this.AYXKKw + ", slippageMode=" + this.valueOf + ", routerModeType=" + this.copydefault + ", priorityFeeValue=" + this.EZpvd + ", priorityFeeType=" + this.AEQbTJ + ")";
    }

    public C30805liA(boolean z, java.lang.String str, java.lang.String str2, SlippageMode slippageMode, java.lang.String str3, @NotNull java.lang.String str4, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str4, "");
        this.KWHzl = z;
        this.OLrzqt = str;
        this.AYXKKw = str2;
        this.valueOf = slippageMode;
        this.copydefault = str3;
        this.EZpvd = str4;
        this.AEQbTJ = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode:0x001a: SGET  A[WRAPPED] (LINE:72) com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode.Dynamic com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode) : (r9v0 com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0029: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Integer:0x0033: INVOKE 
  (wrap:int:0x002f: INVOKE 
  (wrap:com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType:0x002d: SGET  A[WRAPPED] (LINE:75) com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType.Market com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType)
 VIRTUAL call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType.getValue():int A[MD:():int (m), WRAPPED] (LINE:75))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:75)) : (r12v0 java.lang.Integer))
 A[MD:(boolean, java.lang.String, java.lang.String, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:68) call: o.liA.<init>(boolean, java.lang.String, java.lang.String, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ C30805liA(boolean z, java.lang.String str, java.lang.String str2, SlippageMode slippageMode, java.lang.String str3, java.lang.String str4, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? SlippageMode.Dynamic : slippageMode, (i & 16) == 0 ? str3 : null, (i & 32) == 0 ? str4 : "", (i & 64) != 0 ? java.lang.Integer.valueOf(AdvancedPriorityFeeType.Market.getValue()) : num);
    }

    public final boolean KWHzl(C30808liD c30808liD) {
        if (c30808liD.AYXKKw() != this.valueOf || c30808liD.fetchVPNInfo() != this.KWHzl) {
            return true;
        }
        int iCopydefault = c30808liD.copydefault();
        java.lang.Integer num = this.AEQbTJ;
        if (num == null || iCopydefault != num.intValue()) {
            return true;
        }
        SlippageMode slippageMode = this.valueOf;
        if (slippageMode == null) {
            slippageMode = SlippageMode.Dynamic;
        }
        int i = Application.KWHzl[slippageMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!Intrinsics.EZpvd((java.lang.Object) c30808liD.AkhnZx(), (java.lang.Object) this.AYXKKw)) {
                return true;
            }
        } else if (!Intrinsics.EZpvd((java.lang.Object) c30808liD.KWHzl(), (java.lang.Object) this.OLrzqt)) {
            return true;
        }
        java.lang.Integer num2 = this.AEQbTJ;
        return (num2 == null || num2.intValue() != AdvancedPriorityFeeType.Custom.getValue() || Intrinsics.EZpvd((java.lang.Object) c30808liD.valueOf(), (java.lang.Object) this.EZpvd)) ? false : true;
    }

    public final C30805liA EZpvd(@NotNull C30808liD c30808liD) {
        Intrinsics.checkNotNullParameter(c30808liD, "");
        if (!KWHzl(c30808liD)) {
            return this;
        }
        java.lang.String strAkhnZx = c30808liD.AkhnZx();
        SlippageMode slippageModeAYXKKw = c30808liD.AYXKKw();
        return AEQbTJ(c30808liD.fetchVPNInfo(), c30808liD.KWHzl(), strAkhnZx, slippageModeAYXKKw, c30808liD.AhwBna(), c30808liD.valueOf(), java.lang.Integer.valueOf(c30808liD.copydefault()));
    }

    public final java.lang.String EZpvd() {
        if (this.valueOf == SlippageMode.Dynamic) {
            return null;
        }
        return this.AYXKKw;
    }
}
