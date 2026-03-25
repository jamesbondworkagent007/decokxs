package o;

import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41495qrr {
    public final DexChainGroupVo AEQbTJ;
    public final java.lang.Integer EZpvd;
    public final boolean KWHzl;
    public final kotlin.Pair<DexSortByEnum, SortOrder> OLrzqt;
    public final DexPeriodEnum copydefault;
    public final InterfaceC41652qup djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.qrr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41495qrr copy$default(C41495qrr c41495qrr, DexChainGroupVo dexChainGroupVo, DexPeriodEnum dexPeriodEnum, kotlin.Pair pair, InterfaceC41652qup interfaceC41652qup, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dexChainGroupVo = c41495qrr.AEQbTJ;
        }
        if ((i & 2) != 0) {
            dexPeriodEnum = c41495qrr.copydefault;
        }
        DexPeriodEnum dexPeriodEnum2 = dexPeriodEnum;
        if ((i & 4) != 0) {
            pair = c41495qrr.OLrzqt;
        }
        kotlin.Pair pair2 = pair;
        if ((i & 8) != 0) {
            interfaceC41652qup = c41495qrr.djBIcL;
        }
        InterfaceC41652qup interfaceC41652qup2 = interfaceC41652qup;
        if ((i & 16) != 0) {
            num = c41495qrr.EZpvd;
        }
        java.lang.Integer num2 = num;
        if ((i & 32) != 0) {
            z = c41495qrr.KWHzl;
        }
        return c41495qrr.OLrzqt(dexChainGroupVo, dexPeriodEnum2, pair2, interfaceC41652qup2, num2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<DexSortByEnum, SortOrder> AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPeriodEnum EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexChainGroupVo KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41495qrr OLrzqt(@NotNull DexChainGroupVo dexChainGroupVo, @NotNull DexPeriodEnum dexPeriodEnum, @NotNull kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair, @NotNull InterfaceC41652qup interfaceC41652qup, java.lang.Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(dexChainGroupVo, "");
        Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(interfaceC41652qup, "");
        return new C41495qrr(dexChainGroupVo, dexPeriodEnum, pair, interfaceC41652qup, num, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC41652qup OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<DexSortByEnum, SortOrder> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexChainGroupVo djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41495qrr)) {
            return false;
        }
        C41495qrr c41495qrr = (C41495qrr) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c41495qrr.AEQbTJ) && this.copydefault == c41495qrr.copydefault && Intrinsics.EZpvd(this.OLrzqt, c41495qrr.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, c41495qrr.djBIcL) && Intrinsics.EZpvd(this.EZpvd, c41495qrr.EZpvd) && this.KWHzl == c41495qrr.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPeriodEnum gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = this.djBIcL.hashCode();
        java.lang.Integer num = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.Pair<? extends com.okinc.market.quotation.ui.model.dex.DexSortByEnum, ? extends com.okinc.market.quotation.ui.model.SortOrder> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41495qrr(@NotNull DexChainGroupVo dexChainGroupVo, @NotNull DexPeriodEnum dexPeriodEnum, @NotNull kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair, @NotNull InterfaceC41652qup interfaceC41652qup, java.lang.Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(dexChainGroupVo, "");
        Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(interfaceC41652qup, "");
        this.AEQbTJ = dexChainGroupVo;
        this.copydefault = dexPeriodEnum;
        this.OLrzqt = pair;
        this.djBIcL = interfaceC41652qup;
        this.EZpvd = num;
        this.KWHzl = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r8v0 com.okinc.market.quotation.ui.model.dex.DexChainGroupVo)
  (r9v0 com.okinc.market.quotation.ui.model.dex.DexPeriodEnum)
  (r10v0 kotlin.Pair)
  (r11v0 o.qup)
  (wrap:java.lang.Integer:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(com.okinc.market.quotation.ui.model.dex.DexChainGroupVo, com.okinc.market.quotation.ui.model.dex.DexPeriodEnum, kotlin.Pair<? extends com.okinc.market.quotation.ui.model.dex.DexSortByEnum, ? extends com.okinc.market.quotation.ui.model.SortOrder>, o.qup, java.lang.Integer, boolean):void (m)] (LINE:38) call: o.qrr.<init>(com.okinc.market.quotation.ui.model.dex.DexChainGroupVo, com.okinc.market.quotation.ui.model.dex.DexPeriodEnum, kotlin.Pair, o.qup, java.lang.Integer, boolean):void type: THIS */
    public /* synthetic */ C41495qrr(DexChainGroupVo dexChainGroupVo, DexPeriodEnum dexPeriodEnum, kotlin.Pair pair, InterfaceC41652qup interfaceC41652qup, java.lang.Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dexChainGroupVo, dexPeriodEnum, pair, interfaceC41652qup, (i & 16) != 0 ? null : num, (i & 32) != 0 ? false : z);
    }

    public java.lang.String toString() {
        return "GetDexVosPayload(chain=" + this.AEQbTJ.EZpvd() + ", period=" + this.copydefault.name() + ", sorter=" + this.OLrzqt + ", desireCount=" + this.EZpvd + ", useCache=" + this.KWHzl + ")";
    }
}
