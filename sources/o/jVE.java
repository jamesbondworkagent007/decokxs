package o;

import com.okinc.business.market.common.constants.RangeType;
import com.okinc.business.market.common.constants.TokenAgeType;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jVE implements kMU {
    public RangeType AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public TokenAgeType gEmmrt;
    public final java.lang.String valueOf;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RangeType.values().length];
            try {
                iArr[RangeType.TIME_CREATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RangeType.MARKET_CAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RangeType.TURNOVER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[RangeType.LIQUIDITY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[RangeType.FDV.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[RangeType.CHANGE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RangeType AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jVE AEQbTJ(@NotNull java.lang.String str, @NotNull RangeType rangeType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, TokenAgeType tokenAgeType, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rangeType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new jVE(str, rangeType, str2, str3, tokenAgeType, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAgeType OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(TokenAgeType tokenAgeType) {
        this.gEmmrt = tokenAgeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jVE)) {
            return false;
        }
        jVE jve = (jVE) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) jve.djBIcL) && this.AEQbTJ == jve.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) jve.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) jve.KWHzl) && this.gEmmrt == jve.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) jve.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) jve.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) jve.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        TokenAgeType tokenAgeType = this.gEmmrt;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (tokenAgeType == null ? 0 : tokenAgeType.hashCode())) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RangeFilterUiModel(title=" + this.djBIcL + ", rangeType=" + this.AEQbTJ + ", startValue=" + this.copydefault + ", endValue=" + this.KWHzl + ", tokenAgeType=" + this.gEmmrt + ", displayStartValue=" + this.EZpvd + ", displayEndValue=" + this.OLrzqt + ", trackType=" + this.valueOf + ")";
    }

    public jVE(@NotNull java.lang.String str, @NotNull RangeType rangeType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, TokenAgeType tokenAgeType, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rangeType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.djBIcL = str;
        this.AEQbTJ = rangeType;
        this.copydefault = str2;
        this.KWHzl = str3;
        this.gEmmrt = tokenAgeType;
        this.EZpvd = str4;
        this.OLrzqt = str5;
        this.valueOf = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (r14v0 com.okinc.business.market.common.constants.RangeType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: TERNARY null = ((wrap:int:0x001a: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.common.constants.TokenAgeType) : (r17v0 com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.market.common.constants.RangeType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:19) call: o.jVE.<init>(java.lang.String, com.okinc.business.market.common.constants.RangeType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ jVE(java.lang.String str, RangeType rangeType, java.lang.String str2, java.lang.String str3, TokenAgeType tokenAgeType, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, rangeType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : tokenAgeType, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    public final java.lang.String OLrzqt(@NotNull RangeType rangeType) {
        java.lang.String strAYXKKw;
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(rangeType, "");
        if (rangeType == RangeType.TIME_CREATE) {
            TokenAgeType.Companion companion = TokenAgeType.Companion;
            TokenAgeType tokenAgeType = this.gEmmrt;
            if (tokenAgeType == null) {
                tokenAgeType = TokenAgeType.DAY;
            }
            strAYXKKw = C33070mpX.AYXKKw(companion.OLrzqt(tokenAgeType));
        } else {
            strAYXKKw = "";
        }
        switch (StateListAnimator.OLrzqt[rangeType.ordinal()]) {
            case 1:
                pairOLrzqt = C56390yDp.OLrzqt(this.copydefault, this.KWHzl);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                if (this.EZpvd.length() > 0 || this.OLrzqt.length() > 0) {
                    java.lang.String str = this.EZpvd;
                    java.lang.String scientificCurrency$default = C33129mqd.OLrzqt((java.lang.CharSequence) str) ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, false, null, true, false, 372, null) : "";
                    java.lang.String str2 = this.OLrzqt;
                    pairOLrzqt = C56390yDp.OLrzqt(scientificCurrency$default, C33129mqd.OLrzqt((java.lang.CharSequence) str2) ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str2, true, RoundingMode.DOWN, false, false, false, false, null, true, false, 372, null) : "");
                } else {
                    java.lang.String str3 = this.copydefault;
                    java.lang.String scientificCurrency$default2 = C33129mqd.OLrzqt((java.lang.CharSequence) str3) ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str3, true, RoundingMode.DOWN, false, false, false, false, null, false, false, 500, null) : "";
                    java.lang.String str4 = this.KWHzl;
                    pairOLrzqt = C56390yDp.OLrzqt(scientificCurrency$default2, C33129mqd.OLrzqt((java.lang.CharSequence) str4) ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str4, true, RoundingMode.DOWN, false, false, false, false, null, false, false, 500, null) : "");
                }
                break;
            case 6:
                pairOLrzqt = C56390yDp.OLrzqt(C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault) ? KWHzl() + "%" : "", C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl) ? copydefault() + "%" : "");
                break;
            default:
                C23271hvA c23271hvA = C23271hvA.copydefault;
                pairOLrzqt = C56390yDp.OLrzqt(C23271hvA.getShowData$default(c23271hvA, this.copydefault, false, null, false, false, 30, null), C23271hvA.getShowData$default(c23271hvA, this.KWHzl, false, null, false, false, 30, null));
                break;
        }
        java.lang.String str5 = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str6 = (java.lang.String) pairOLrzqt.component2();
        if (str5.length() > 0 && str6.length() > 0) {
            return str5 + strAYXKKw + "~" + str6 + strAYXKKw;
        }
        if (str5.length() > 0) {
            return "≥" + str5 + strAYXKKw;
        }
        if (str6.length() <= 0) {
            return "";
        }
        return "≤" + str6 + strAYXKKw;
    }
}
