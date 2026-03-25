package o;

import com.okinc.crcore.shared.formatter.AmountDisplayType;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mDl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31775mDl {
    public final java.lang.String AEQbTJ;
    public final RoundingMode EZpvd;
    public final DisplaySign KWHzl;
    public final AmountDisplayType OLrzqt;
    public final BigDecimal copydefault;
    public final boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31775mDl copy$default(C31775mDl c31775mDl, java.lang.String str, AmountDisplayType amountDisplayType, BigDecimal bigDecimal, boolean z, RoundingMode roundingMode, DisplaySign displaySign, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c31775mDl.AEQbTJ;
        }
        if ((i & 2) != 0) {
            amountDisplayType = c31775mDl.OLrzqt;
        }
        AmountDisplayType amountDisplayType2 = amountDisplayType;
        if ((i & 4) != 0) {
            bigDecimal = c31775mDl.copydefault;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i & 8) != 0) {
            z = c31775mDl.djBIcL;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            roundingMode = c31775mDl.EZpvd;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 32) != 0) {
            displaySign = c31775mDl.KWHzl;
        }
        return c31775mDl.OLrzqt(str, amountDisplayType2, bigDecimal2, z2, roundingMode2, displaySign);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AmountDisplayType AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplaySign AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RoundingMode OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31775mDl OLrzqt(@NotNull java.lang.String str, @NotNull AmountDisplayType amountDisplayType, @NotNull BigDecimal bigDecimal, boolean z, @NotNull RoundingMode roundingMode, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amountDisplayType, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        return new C31775mDl(str, amountDisplayType, bigDecimal, z, roundingMode, displaySign);
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
        if (!(obj instanceof C31775mDl)) {
            return false;
        }
        C31775mDl c31775mDl = (C31775mDl) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31775mDl.AEQbTJ) && this.OLrzqt == c31775mDl.OLrzqt && Intrinsics.EZpvd(this.copydefault, c31775mDl.copydefault) && this.djBIcL == c31775mDl.djBIcL && this.EZpvd == c31775mDl.EZpvd && this.KWHzl == c31775mDl.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AmountFormatRequest(currencyCode=" + this.AEQbTJ + ", amountDisplayType=" + this.OLrzqt + ", amount=" + this.copydefault + ", smallValueHandlingRequired=" + this.djBIcL + ", roundingMode=" + this.EZpvd + ", signDisplay=" + this.KWHzl + ")";
    }

    public C31775mDl(@NotNull java.lang.String str, @NotNull AmountDisplayType amountDisplayType, @NotNull BigDecimal bigDecimal, boolean z, @NotNull RoundingMode roundingMode, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amountDisplayType, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        this.AEQbTJ = str;
        this.OLrzqt = amountDisplayType;
        this.copydefault = bigDecimal;
        this.djBIcL = z;
        this.EZpvd = roundingMode;
        this.KWHzl = displaySign;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 com.okinc.crcore.shared.formatter.AmountDisplayType)
  (r10v0 java.math.BigDecimal)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:java.math.RoundingMode:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.math.RoundingMode:0x000a: SGET  A[WRAPPED] (LINE:37) java.math.RoundingMode.DOWN java.math.RoundingMode) : (r12v0 java.math.RoundingMode))
  (wrap:com.okinc.localization.util.format.DisplaySign:?: TERNARY null = ((wrap:int:0x000d: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.localization.util.format.DisplaySign:0x0011: SGET  A[WRAPPED] (LINE:38) com.okinc.localization.util.format.DisplaySign.AUTO com.okinc.localization.util.format.DisplaySign) : (r13v0 com.okinc.localization.util.format.DisplaySign))
 A[MD:(java.lang.String, com.okinc.crcore.shared.formatter.AmountDisplayType, java.math.BigDecimal, boolean, java.math.RoundingMode, com.okinc.localization.util.format.DisplaySign):void (m)] (LINE:32) call: o.mDl.<init>(java.lang.String, com.okinc.crcore.shared.formatter.AmountDisplayType, java.math.BigDecimal, boolean, java.math.RoundingMode, com.okinc.localization.util.format.DisplaySign):void type: THIS */
    public /* synthetic */ C31775mDl(java.lang.String str, AmountDisplayType amountDisplayType, BigDecimal bigDecimal, boolean z, RoundingMode roundingMode, DisplaySign displaySign, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, amountDisplayType, bigDecimal, (i & 8) != 0 ? false : z, (i & 16) != 0 ? RoundingMode.DOWN : roundingMode, (i & 32) != 0 ? DisplaySign.AUTO : displaySign);
    }
}
