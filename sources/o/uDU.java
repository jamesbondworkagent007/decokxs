package o;

import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class uDU {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final int AEQbTJ;
    public final boolean EZpvd;
    public final java.util.List<IndicatorSectionUiModel> KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public uDU() {
        this(null, 0, 0, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uDU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ uDU copy$default(uDU udu, java.util.List list, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            list = udu.KWHzl;
        }
        if ((i3 & 2) != 0) {
            i = udu.OLrzqt;
        }
        if ((i3 & 4) != 0) {
            i2 = udu.AEQbTJ;
        }
        if ((i3 & 8) != 0) {
            z = udu.EZpvd;
        }
        return udu.AEQbTJ(list, i, i2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<IndicatorSectionUiModel> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final uDU AEQbTJ(@NotNull java.util.List<IndicatorSectionUiModel> list, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new uDU(list, i, i2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt < this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uDU)) {
            return false;
        }
        uDU udu = (uDU) obj;
        return Intrinsics.EZpvd(this.KWHzl, udu.KWHzl) && this.OLrzqt == udu.OLrzqt && this.AEQbTJ == udu.AEQbTJ && this.EZpvd == udu.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TechnicalIndicatorsUiState(sections=" + this.KWHzl + ", totalSelectedCount=" + this.OLrzqt + ", maxIndicators=" + this.AEQbTJ + ", showMaxSelectionHint=" + this.EZpvd + ")";
    }

    public uDU(@NotNull java.util.List<IndicatorSectionUiModel> list, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        this.OLrzqt = i;
        this.AEQbTJ = i2;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:323)) : (r2v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (6 int) : (r4v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.util.List<com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel>, int, int, boolean):void (m)] (LINE:322) call: o.uDU.<init>(java.util.List, int, int, boolean):void type: THIS */
    public /* synthetic */ uDU(java.util.List list, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? yDY.AhwBna() : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 6 : i2, (i3 & 8) != 0 ? false : z);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uDU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
