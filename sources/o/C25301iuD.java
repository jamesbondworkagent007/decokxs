package o;

import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexui.main.swap.widget.slippage.InputStatus;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25301iuD {
    public java.lang.String AEQbTJ;
    public final SlippageFeeType EZpvd;
    public final SlippageMode KWHzl;
    public final InputStatus OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25301iuD copy$default(C25301iuD c25301iuD, java.lang.String str, java.lang.String str2, SlippageFeeType slippageFeeType, InputStatus inputStatus, SlippageMode slippageMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c25301iuD.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c25301iuD.copydefault;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            slippageFeeType = c25301iuD.EZpvd;
        }
        SlippageFeeType slippageFeeType2 = slippageFeeType;
        if ((i & 8) != 0) {
            inputStatus = c25301iuD.OLrzqt;
        }
        InputStatus inputStatus2 = inputStatus;
        if ((i & 16) != 0) {
            slippageMode = c25301iuD.KWHzl;
        }
        return c25301iuD.AEQbTJ(str, str3, slippageFeeType2, inputStatus2, slippageMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25301iuD AEQbTJ(java.lang.String str, java.lang.String str2, SlippageFeeType slippageFeeType, @NotNull InputStatus inputStatus, @NotNull SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(inputStatus, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        return new C25301iuD(str, str2, slippageFeeType, inputStatus, slippageMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputStatus EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageFeeType KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25301iuD)) {
            return false;
        }
        C25301iuD c25301iuD = (C25301iuD) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c25301iuD.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c25301iuD.copydefault) && this.EZpvd == c25301iuD.EZpvd && this.OLrzqt == c25301iuD.OLrzqt && this.KWHzl == c25301iuD.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        SlippageFeeType slippageFeeType = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (slippageFeeType != null ? slippageFeeType.hashCode() : 0)) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SlippageCacheParam(slippage=" + this.AEQbTJ + ", maxSlippage=" + this.copydefault + ", slippageFeeType=" + this.EZpvd + ", inputStatus=" + this.OLrzqt + ", slippageMode=" + this.KWHzl + ")";
    }

    public C25301iuD(java.lang.String str, java.lang.String str2, SlippageFeeType slippageFeeType, @NotNull InputStatus inputStatus, @NotNull SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(inputStatus, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.EZpvd = slippageFeeType;
        this.OLrzqt = inputStatus;
        this.KWHzl = slippageMode;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (wrap:com.okinc.business.dexlogic.bean.SlippageFeeType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.SlippageFeeType) : (r9v0 com.okinc.business.dexlogic.bean.SlippageFeeType))
  (r10v0 com.okinc.business.dexui.main.swap.widget.slippage.InputStatus)
  (r11v0 com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode)
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.SlippageFeeType, com.okinc.business.dexui.main.swap.widget.slippage.InputStatus, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode):void (m)] (LINE:912) call: o.iuD.<init>(java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.SlippageFeeType, com.okinc.business.dexui.main.swap.widget.slippage.InputStatus, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode):void type: THIS */
    public /* synthetic */ C25301iuD(java.lang.String str, java.lang.String str2, SlippageFeeType slippageFeeType, InputStatus inputStatus, SlippageMode slippageMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : slippageFeeType, inputStatus, slippageMode);
    }

    public final boolean gEmmrt() {
        return yDY.gEmmrt(InputStatus.ERROR, InputStatus.NO_DATA).contains(this.OLrzqt);
    }
}
